package com.jonda.team.controller;

import com.jonda.team.repository.ActivityRepository;
import com.jonda.team.repository.entity.ActivityEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xiesitao on 2017/5/9.
 */
@Controller
@RequestMapping("/activity")
public class ActivityController {

    @Resource
    private ActivityRepository activityRepository;

    @RequestMapping("/index")
    public String index(Model model) {
        List<ActivityEntity> activities = activityRepository.queryActivity();
        model.addAttribute("activities", activities);
        return "activity/index";
    }
    @RequestMapping(value = "/create",method = RequestMethod.GET)
    public String create() {
        return "activity/create";
    }

    @RequestMapping(value = "/create",method = RequestMethod.POST)
    public String doCreate() {
        return "activity/success";
    }
}
