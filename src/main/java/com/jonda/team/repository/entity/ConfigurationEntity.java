package com.jonda.team.repository.entity;

/**
 * Created by xiesitao on 2017/5/4.
 */
public class ConfigurationEntity {

    private String type;

    private int count;

    private int mastDub;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMastDub() {
        return mastDub;
    }

    public void setMastDub(int mastDub) {
        this.mastDub = mastDub;
    }
}
