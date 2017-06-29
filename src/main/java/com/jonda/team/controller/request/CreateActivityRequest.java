package com.jonda.team.controller.request;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by xiesitao on 2017/5/11.
 */
public class CreateActivityRequest {
    // 活动名称
    private String name;
    // 团长游戏ID
    private String masterId;
    // 团队名称
    private String teamName;
    // 最低装分
    private Integer minScore;
    // 活动开始时间
    private String start;
    // 活动结束时间
    private String end;
    // 备注
    private String remark;
    // 团队配置
    private String AX;
    private String TL;
    private String ZX;
    private String TX;
    private String TL01;
    private String JY;
    private String HJ;
    private String LJ;
    private String YS;
    private String BX;
    private String MW;
    private String XZ;
    private String DJ;
    private String BT;
    private String YJ;
    private String XS;
    private String MZ;
    private String FY;
    private String FS;
    private String TG;
    private String CJ;
    private String GB;
    private String BD;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMasterId() {
        return masterId;
    }

    public void setMasterId(String masterId) {
        this.masterId = masterId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getMinScore() {
        return minScore;
    }

    public void setMinScore(Integer minScore) {
        this.minScore = minScore;
    }

    public Date getStart() {
        if (StringUtils.isBlank(this.start)) {
            return null;
        }
        FastDateFormat dp = FastDateFormat.getInstance("yyyy-MM-dd HH:mm");
        try {
            return dp.parse(this.start);
        } catch (ParseException e) {
        }
        return null;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public Date getEnd() {
        if (StringUtils.isBlank(this.end)) {
            return null;
        }
        FastDateFormat dp = FastDateFormat.getInstance("yyyy-MM-dd HH:mm");
        try {
            return dp.parse(this.end);
        } catch (ParseException e) {
        }
        return null;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAX() {
        return Integer.valueOf(AX);
    }

    public void setAX(String AX) {
        this.AX = AX;
    }

    public Integer getTL() {
        return Integer.valueOf(TL);
    }

    public void setTL(String TL) {
        this.TL = TL;
    }

    public Integer getZX() {
        return Integer.valueOf(ZX);
    }

    public void setZX(String ZX) {
        this.ZX = ZX;
    }

    public Integer getTX() {
        return Integer.valueOf(TX);
    }

    public void setTX(String TX) {
        this.TX = TX;
    }

    public Integer getTL01() {
        return Integer.valueOf(TL01);
    }

    public void setTL01(String TL01) {
        this.TL01 = TL01;
    }

    public Integer getJY() {
        return Integer.valueOf(JY);
    }

    public void setJY(String JY) {
        this.JY = JY;
    }

    public Integer getHJ() {
        return Integer.valueOf(HJ);
    }

    public void setHJ(String HJ) {
        this.HJ = HJ;
    }

    public Integer getLJ() {
        return Integer.valueOf(LJ);
    }

    public void setLJ(String LJ) {
        this.LJ = LJ;
    }

    public Integer getYS() {
        return Integer.valueOf(YS);
    }

    public void setYS(String YS) {
        this.YS = YS;
    }

    public Integer getBX() {
        return Integer.valueOf(BX);
    }

    public void setBX(String BX) {
        this.BX = BX;
    }

    public Integer getMW() {
        return Integer.valueOf(MW);
    }

    public void setMW(String MW) {
        this.MW = MW;
    }

    public Integer getXZ() {
        return Integer.valueOf(XZ);
    }

    public void setXZ(String XZ) {
        this.XZ = XZ;
    }

    public Integer getDJ() {
        return Integer.valueOf(DJ);
    }

    public void setDJ(String DJ) {
        this.DJ = DJ;
    }

    public Integer getBT() {
        return Integer.valueOf(BT);
    }

    public void setBT(String BT) {
        this.BT = BT;
    }

    public Integer getYJ() {
        return Integer.valueOf(YJ);
    }

    public void setYJ(String YJ) {
        this.YJ = YJ;
    }

    public Integer getXS() {
        return Integer.valueOf(XS);
    }

    public void setXS(String XS) {
        this.XS = XS;
    }

    public Integer getMZ() {
        return Integer.valueOf(MZ);
    }

    public void setMZ(String MZ) {
        this.MZ = MZ;
    }

    public Integer getFY() {
        return Integer.valueOf(FY);
    }

    public void setFY(String FY) {
        this.FY = FY;
    }

    public Integer getFS() {
        return Integer.valueOf(FS);
    }

    public void setFS(String FS) {
        this.FS = FS;
    }

    public Integer getTG() {
        return Integer.valueOf(TG);
    }

    public void setTG(String TG) {
        this.TG = TG;
    }

    public Integer getCJ() {
        return Integer.valueOf(CJ);
    }

    public void setCJ(String CJ) {
        this.CJ = CJ;
    }

    public Integer getGB() {
        return Integer.valueOf(GB);
    }

    public void setGB(String GB) {
        this.GB = GB;
    }

    public Integer getBD() {
        return Integer.valueOf(BD);
    }

    public void setBD(String BD) {
        this.BD = BD;
    }

    @Override
    public String toString() {
        return "CreateActivityRequest{" +
                "name='" + name + '\'' +
                ", masterId='" + masterId + '\'' +
                ", teamName='" + teamName + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", remark='" + remark + '\'' +
                ", AX='" + AX + '\'' +
                ", TL='" + TL + '\'' +
                ", ZX='" + ZX + '\'' +
                ", TX='" + TX + '\'' +
                ", TL01='" + TL01 + '\'' +
                ", JY='" + JY + '\'' +
                ", HJ='" + HJ + '\'' +
                ", LJ='" + LJ + '\'' +
                ", YS='" + YS + '\'' +
                ", BX='" + BX + '\'' +
                ", MW='" + MW + '\'' +
                ", XZ='" + XZ + '\'' +
                ", DJ='" + DJ + '\'' +
                ", BT='" + BT + '\'' +
                ", YJ='" + YJ + '\'' +
                ", XS='" + XS + '\'' +
                ", MZ='" + MZ + '\'' +
                ", FY='" + FY + '\'' +
                ", FS='" + FS + '\'' +
                ", TG='" + TG + '\'' +
                ", CJ='" + CJ + '\'' +
                ", GB='" + GB + '\'' +
                ", BD='" + BD + '\'' +
                '}';
    }
}
