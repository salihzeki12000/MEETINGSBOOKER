package com.test.beans;

public class    Salle {
    private Integer     code;
    private String      config;
    private Lieu        unLieu;

    public      Salle(Integer pcode, String pconfig, Lieu punLieu){
        this.code = pcode;
        this.config = pconfig;
        this.unLieu = punLieu;
    }

    public Integer getCode() {
        return code;
    }

    public String getConfig() {
        return config;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setConfig(String config) {
        this.config = config;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
