package com.jonda.team.controller;

import com.jonda.team.common.PersonType;
import com.jonda.team.repository.ActivityRepository;
import com.jonda.team.repository.ConfigRepository;
import com.jonda.team.repository.SignUpRepository;
import com.jonda.team.repository.entity.ActivityEntity;
import com.jonda.team.repository.entity.SignUpEntity;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by xiesitao on 2017/5/4.
 */
@Controller
public class SignUpController {

    @Resource
    private SignUpRepository signUpRepository;

    @Resource
    private ActivityRepository activityRepository;
    @Resource
    private ConfigRepository configRepository;

    @RequestMapping(value = "/signUp", method = RequestMethod.GET)
    public String signUp(String activityId, Model model) {
        ActivityEntity activity = null;
        if (StringUtils.isBlank(activityId)) {
            List<ActivityEntity> activities = activityRepository.queryActivity();
            activity = activities.get(0);
            activityId = activity.getId();
        } else {
            activity = activityRepository.getActivityById(activityId);
        }
        int signUpCount = signUpRepository.getActivitySignUpCount(Integer.valueOf(activityId));
        activity.setName(activity.getName() + "----报名人数："+signUpCount);
        model.addAttribute("activity", activity);
        return "signUp/signUp";
    }

    @RequestMapping(value = "/getSigners", method = RequestMethod.GET)
    public String getSigners(String activityId, Model model) {
        ActivityEntity activity = activityRepository.getActivityById(activityId);
        model.addAttribute("activity", activity);
        List<SignUpEntity> signUps = signUpRepository.getSignUps(Integer.valueOf(activityId));
        model.addAttribute("signs", signUps);
        return "signUp/signers";
    }

    @RequestMapping(value = "/signUp", method = RequestMethod.POST)
    public String doSignUp(String activityId, String roleId, String roleType, String isDub, String score, Model model) {
        ActivityEntity activity = activityRepository.getActivityById(activityId);
        int signUpCount = signUpRepository.getActivitySignUpCount(Integer.valueOf(activityId));
        activity.setName(activity.getName() + "----已经报名人数："+signUpCount);
        model.addAttribute("activity",activity);

        List<String> errors = new ArrayList<>();
        if (StringUtils.isBlank(roleId)) {
            errors.add("角色ID不能为空");
        }
        if (StringUtils.isBlank(roleType) || PersonType.getPersonTypeByCode(roleType) == null) {
            errors.add("角色角色心法不能为空，请选择");
        }
        if (StringUtils.isBlank(score)) {
            errors.add("角色装备分数不能为空，请填写");
        }
        if (!errors.isEmpty()) {
            model.addAttribute("errors", errors);
            return "signUp/signUp";
        }
        int scoreNum = 0;
        int isDouble = 0;
        try {
            isDouble = Integer.valueOf(isDub);
        }catch (Exception ex) {
        }
        try {
            scoreNum = Integer.valueOf(score);
        } catch (Exception ex) {
        }

        if (scoreNum < 18800) {
            errors.add("装备分数格式不正确或者装分太低");
            model.addAttribute("errors", errors);
            return "signUp/signUp";
        }
        // 查询配置的该心法需要几人
        String counts = configRepository.getRoleCount(Integer.valueOf(activityId), roleType);
        Integer count = 0;
        if (StringUtils.isNotBlank(counts)) {
            count = Integer.valueOf(counts);
        }
        // 查询当前已经报名的人数
        int hcount = signUpRepository.getActivityRoleCount(Integer.valueOf(activityId), roleType);
        // count <= 0 表示不需要该心法， count <= hcount表示报名人数已经大于当前需要的人
        if (count <= 0 || count <= hcount) {
            errors.add("目前该心法已经组满，请换一个职业参与该次活动或者报名下次活动。");
            model.addAttribute("errors", errors);
            return "signUp/signUp";
        }

        SignUpEntity entity = new SignUpEntity();
        entity.setRoleId(roleId);
        PersonType personType = PersonType.getPersonTypeByCode(roleType);
        entity.setActivityId(Integer.valueOf(activityId));
        entity.setType(personType.getName());
        entity.setRoleType(roleType);
        entity.setRoleName(personType.getTypeName());
        entity.setIsDouble(isDouble);
        entity.setScore(scoreNum);
        signUpRepository.addSignUp(entity);
        return "signUp/success";
    }

}
