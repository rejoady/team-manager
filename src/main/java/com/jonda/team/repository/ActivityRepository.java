package com.jonda.team.repository;

import com.jonda.team.repository.entity.ActivityEntity;
import com.jonda.team.repository.entity.ConfigurationEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiesitao on 2017/5/4.
 */
@Mapper
public interface ActivityRepository {


    @Select("select * from activity order by start_time desc")
    @ResultMap("activityResultMap")
    public List<ActivityEntity> queryActivity();

    @Select("select * from activity where id=#{activityId}")
    @ResultMap("activityResultMap")
    public ActivityEntity getActivityById(@Param("activityId") String activityId);
}
