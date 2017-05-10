package com.jonda.team.common;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by xiesitao on 2017/5/4.
 */
public enum PersonType {

    AX("TC","天策","傲雪"),
    TL("TC","天策", "铁牢"),
    ZX("CY","纯阳","紫霞"),
    TX("CY","纯阳","太虚"),
    TL01("TM","唐门","天罗"),
    JY("TM","唐门","惊羽"),
    HJ("WH","万花","花间"),
    LJ("WH","万花","离经"),
    YS("QX","七秀","云裳"),
    BX("QX","七秀","冰心"),
    MW("CG","长歌","莫问"),
    XZ("CG","长歌","相知"),
    DJ("WD","五毒","毒经"),
    BT("WD","五毒","补天"),
    YJ("SL","少林","易经"),
    XS("SL","少林","洗髓"),
    MZ("MJ","明教","明尊"),
    FY("MJ","明教","焚影"),
    FS("CY01","苍云","分山"),
    TG("CY01","苍云","铁骨"),

    CJ("CJ","藏剑","藏剑"),
    GB("GB","丐帮","丐帮"),
    BD("BD","霸刀","霸刀"),

    ;

    private String code;

    private String name;

    private String typeName;

    PersonType(String code, String name, String typeName) {
        this.code = code;
        this.name = name;
        this.typeName = typeName;
    }

    public static PersonType getPersonTypeByCode(String code) {
        if (StringUtils.isBlank(code)) {
            return null;
        }
        for (PersonType type : PersonType.values()) {
            if (type.name().equals(code)) {
                return type;
            }
        }
        return null;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getTypeName() {
        return typeName;
    }

    @Override
    public String toString() {
        return "PersonType{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
