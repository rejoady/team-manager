package com.jonda.team.repository;

import com.jonda.team.repository.entity.ActivityEntity;
import com.jonda.team.repository.entity.ConfigurationEntity;
import com.jonda.team.repository.entity.SignUpEntity;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.StatementType;

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

    @Insert("insert into activity(name, min_score, start_time, end_time, remark, team_name, master_id) " +
            "values (#{name},#{minScore}, #{start}, #{end}, #{remark}, #{teamName}, #{masterId})")
    @SelectKey(before=false,keyProperty="id",resultType=Integer.class,statementType= StatementType.STATEMENT,statement="SELECT LAST_INSERT_ID() AS id")
    public void saveActivity(ActivityEntity entity);

}
