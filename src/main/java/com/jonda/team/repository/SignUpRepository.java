package com.jonda.team.repository;

import com.jonda.team.repository.entity.SignUpEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by xiesitao on 2017/5/4.
 */
@Mapper
public interface SignUpRepository {

    @Insert("insert into sign_up(activity_id, roleId, roleType, type, roleName, dub, score) values (#{activityId},#{roleId}, #{roleType}, #{type}, #{roleName}, #{isDouble}, #{score})")
    public void addSignUp(SignUpEntity entity);

    @Select("select count(1) from sign_up " +
            "where activity_id=#{activityId} and roleType=#{roleCode}")
    public int getActivityRoleCount(@Param("activityId")int activityId, @Param("roleCode")String roleCode);

    @Select("select count(1) from sign_up " +
            "where activity_id=#{activityId}")
    public int getActivitySignUpCount(@Param("activityId")int activityId);

    @Select("select * from sign_up where activity_id=#{activityId} order by roleType")
    @ResultMap("signUpResultMap")
    public List<SignUpEntity> getSignUps(@Param("activityId")int activityId);
}
