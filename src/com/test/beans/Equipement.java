package com.test.beans;

public class Equipement {
    private Integer     code;
    private String      libelle;

    public   Equipement(Integer pcode, String plibelle){
        code = pcode;
        libelle = plibelle;
    }

    public Integer getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
