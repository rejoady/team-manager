package com.jonda.team.repository;

import com.jonda.team.repository.entity.ConfigurationEntity;
import com.jonda.team.repository.entity.SignUpEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiesitao on 2017/5/4.
 */
@Mapper
public interface ConfigRepository {


    @Select("select countNum from configuration" +
            " where activity_id=#{activityId} and type=#{roleCode}")
    public String getRoleCount(@Param("activityId")int activityId, @Param("roleCode")String roleCode);

    @Select("select * from configuration where activity_id=#{activityId}")
    public List<ConfigurationEntity> queryConfig(@Param("activityId") int activityId);
}
