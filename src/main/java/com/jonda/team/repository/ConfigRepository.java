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
public interface ConfigRepository {


    @Select("select * from configuration where activity_id=#{activityId}")
    @ResultMap("configResultMap")
    public ConfigurationEntity getActivityConfig(@Param("activityId")int activityId);

    @Select("select * from configuration where activity_id=#{activityId}")
    public List<ConfigurationEntity> queryConfig(@Param("activityId") int activityId);

    @Insert("insert into configuration(activity_id, AX, TL, ZX, TX, TL01, JY, HJ, LJ, " +
            "YS, BX, MW, XZ, DJ, BT, YJ, XS, MZ, FY, FS, TG, CJ, GB, BD) " +
            "values (#{activityId},#{AX},#{TL},#{ZX},#{TX},#{TL01},#{JY},#{HJ},#{LJ}," +
            "#{YS},#{BX},#{MW},#{XZ},#{DJ},#{BT},#{YJ},#{XS},#{MZ},#{FY},#{FS},#{TG},#{CJ},#{GB},#{BD})")
    public void saveConfig(ConfigurationEntity entity);
}
