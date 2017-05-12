package com.jonda.team.repository.entity;

/**
 * Created by xiesitao on 2017/5/4.
 */
public class ConfigurationEntity {
    private Integer id;
    // 活动ID
    private Integer activityId;
    // 团队配置
    private Integer AX;
    private Integer TL;
    private Integer ZX;
    private Integer TX;
    private Integer TL01;
    private Integer JY;
    private Integer HJ;
    private Integer LJ;
    private Integer YS;
    private Integer BX;
    private Integer MW;
    private Integer XZ;
    private Integer DJ;
    private Integer BT;
    private Integer YJ;
    private Integer XS;
    private Integer MZ;
    private Integer FY;
    private Integer FS;
    private Integer TG;
    private Integer CJ;
    private Integer GB;
    private Integer BD;

    public ConfigurationEntity() {
    }

    public ConfigurationEntity(Integer AX, Integer TL,
                               Integer ZX, Integer TX,
                               Integer TL01, Integer JY,
                               Integer HJ, Integer LJ,
                               Integer YS, Integer BX,
                               Integer MW, Integer XZ,
                               Integer DJ, Integer BT,
                               Integer YJ, Integer XS,
                               Integer MZ, Integer FY,
                               Integer FS, Integer TG,
                               Integer CJ, Integer GB, Integer BD) {
        this.AX = AX;
        this.TL = TL;
        this.ZX = ZX;
        this.TX = TX;
        this.TL01 = TL01;
        this.JY = JY;
        this.HJ = HJ;
        this.LJ = LJ;
        this.YS = YS;
        this.BX = BX;
        this.MW = MW;
        this.XZ = XZ;
        this.DJ = DJ;
        this.BT = BT;
        this.YJ = YJ;
        this.XS = XS;
        this.MZ = MZ;
        this.FY = FY;
        this.FS = FS;
        this.TG = TG;
        this.CJ = CJ;
        this.GB = GB;
        this.BD = BD;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getAX() {
        return AX;
    }

    public void setAX(Integer AX) {
        this.AX = AX;
    }

    public Integer getTL() {
        return TL;
    }

    public void setTL(Integer TL) {
        this.TL = TL;
    }

    public Integer getZX() {
        return ZX;
    }

    public void setZX(Integer ZX) {
        this.ZX = ZX;
    }

    public Integer getTX() {
        return TX;
    }

    public void setTX(Integer TX) {
        this.TX = TX;
    }

    public Integer getTL01() {
        return TL01;
    }

    public void setTL01(Integer TL01) {
        this.TL01 = TL01;
    }

    public Integer getJY() {
        return JY;
    }

    public void setJY(Integer JY) {
        this.JY = JY;
    }

    public Integer getHJ() {
        return HJ;
    }

    public void setHJ(Integer HJ) {
        this.HJ = HJ;
    }

    public Integer getLJ() {
        return LJ;
    }

    public void setLJ(Integer LJ) {
        this.LJ = LJ;
    }

    public Integer getYS() {
        return YS;
    }

    public void setYS(Integer YS) {
        this.YS = YS;
    }

    public Integer getBX() {
        return BX;
    }

    public void setBX(Integer BX) {
        this.BX = BX;
    }

    public Integer getMW() {
        return MW;
    }

    public void setMW(Integer MW) {
        this.MW = MW;
    }

    public Integer getXZ() {
        return XZ;
    }

    public void setXZ(Integer XZ) {
        this.XZ = XZ;
    }

    public Integer getDJ() {
        return DJ;
    }

    public void setDJ(Integer DJ) {
        this.DJ = DJ;
    }

    public Integer getBT() {
        return BT;
    }

    public void setBT(Integer BT) {
        this.BT = BT;
    }

    public Integer getYJ() {
        return YJ;
    }

    public void setYJ(Integer YJ) {
        this.YJ = YJ;
    }

    public Integer getXS() {
        return XS;
    }

    public void setXS(Integer XS) {
        this.XS = XS;
    }

    public Integer getMZ() {
        return MZ;
    }

    public void setMZ(Integer MZ) {
        this.MZ = MZ;
    }

    public Integer getFY() {
        return FY;
    }

    public void setFY(Integer FY) {
        this.FY = FY;
    }

    public Integer getFS() {
        return FS;
    }

    public void setFS(Integer FS) {
        this.FS = FS;
    }

    public Integer getTG() {
        return TG;
    }

    public void setTG(Integer TG) {
        this.TG = TG;
    }

    public Integer getCJ() {
        return CJ;
    }

    public void setCJ(Integer CJ) {
        this.CJ = CJ;
    }

    public Integer getGB() {
        return GB;
    }

    public void setGB(Integer GB) {
        this.GB = GB;
    }

    public Integer getBD() {
        return BD;
    }

    public void setBD(Integer BD) {
        this.BD = BD;
    }

    @Override
    public String toString() {
        return "ConfigurationEntity{" +
                "activityId=" + activityId +
                ", AX=" + AX +
                ", TL=" + TL +
                ", ZX=" + ZX +
                ", TX=" + TX +
                ", TL01=" + TL01 +
                ", JY=" + JY +
                ", HJ=" + HJ +
                ", LJ=" + LJ +
                ", YS=" + YS +
                ", BX=" + BX +
                ", MW=" + MW +
                ", XZ=" + XZ +
                ", DJ=" + DJ +
                ", BT=" + BT +
                ", YJ=" + YJ +
                ", XS=" + XS +
                ", MZ=" + MZ +
                ", FY=" + FY +
                ", FS=" + FS +
                ", TG=" + TG +
                ", CJ=" + CJ +
                ", GB=" + GB +
                ", BD=" + BD +
                '}';
    }
}
