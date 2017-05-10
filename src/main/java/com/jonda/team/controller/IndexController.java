package com.jonda.team.controller;

import com.jonda.team.repository.ActivityRepository;
import com.jonda.team.repository.entity.ActivityEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by xiesitao on 2017/5/4.
 */
@Controller
public class IndexController {

    @Resource
    private ActivityRepository activityRepository;

    @RequestMapping("/")
    public String index(Model model) {
        List<ActivityEntity> activities = activityRepository.queryActivity();
        List<ActivityEntity> currents = new ArrayList<>();
        ActivityEntity current = null;
        Calendar calendar = Calendar.getInstance();
        for (ActivityEntity entity : activities) {
            // 已经过期
            if (entity.getStart().compareTo(new Date()) <= 0) {
                continue;
            }
            // 第一个有效记录
            if (current == null) {
                current = entity;
                continue;
            }
            // 记录离当前时间最近的一个活动
            if (current.getStart().getTime() - calendar.getTimeInMillis() >=
                    entity.getStart().getTime() - calendar.getTimeInMillis()) {
                current = entity;
            }
        }
        if (current != null) {
            currents.add(current);
        }
        model.addAttribute("activities", currents);
        return "index";
    }

}
