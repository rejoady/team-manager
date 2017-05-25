package com.jonda.team.repository.entity;

import org.apache.ibatis.type.Alias;

/**
 * Created by xiesitao on 2017/5/4.
 */
@Alias("SginUp")
public class SignUpEntity {
    private Integer id;
    // 活动ID
    private int activityId;
    // 角色ID
    private String roleId;
    // 群昵称
    private String nickName;
    // 职业
    private String type;
    // 心法
    private String roleType;
    // 心法名称
    private String roleName;
    // 是否双休
    private int isDouble;
    // 装分
    private int score;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getIsDouble() {
        return isDouble;
    }

    public void setIsDouble(int isDouble) {
        this.isDouble = isDouble;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "SignUpEntity{" +
                "id=" + id +
                ", activityId=" + activityId +
                ", roleId='" + roleId + '\'' +
                ", type='" + type + '\'' +
                ", roleType='" + roleType + '\'' +
                ", roleName='" + roleName + '\'' +
                ", isDouble=" + isDouble +
                ", score=" + score +
                '}';
    }
}
