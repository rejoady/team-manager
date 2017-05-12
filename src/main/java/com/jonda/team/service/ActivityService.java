package com.jonda.team.service;

import com.jonda.team.controller.request.CreateActivityRequest;
import com.jonda.team.repository.ActivityRepository;
import com.jonda.team.repository.ConfigRepository;
import com.jonda.team.repository.entity.ActivityEntity;
import com.jonda.team.repository.entity.ConfigurationEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by xiesitao on 2017/5/11.
 */
@Service
public class ActivityService {

    @Resource
    private ActivityRepository activityRepository;

    @Resource
    private ConfigRepository configRepository;

    public void createActivity(CreateActivityRequest request) {
        ActivityEntity activity = new ActivityEntity();
        activity.setName(request.getName());
        activity.setMasterId(request.getMasterId());
        activity.setTeamName(request.getTeamName());
        activity.setRemark(request.getRemark());
        activity.setStart(request.getStart());
        activity.setEnd(request.getEnd());
        activityRepository.saveActivity(activity);

        ConfigurationEntity config = new ConfigurationEntity(
                request.getAX(), request.getTL(),request.getZX(), request.getTX(),
                request.getTL01(), request.getJY(), request.getHJ(), request.getLJ(),
                request.getYS(), request.getBX(), request.getMW(), request.getXZ(),
                request.getDJ(), request.getBT(),request.getYJ(), request.getXS(),
                request.getMZ(), request.getFY(), request.getFS(), request.getTG(),
                request.getCJ(), request.getGB(), request.getBD()
        );
        config.setActivityId(activity.getId());
        configRepository.saveConfig(config);
    }

}
