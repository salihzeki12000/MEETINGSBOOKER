package com.test.beans;

public class RepasBoissons {
    private Integer     code;
    private String      libelle;
    private Boolean     isRepas;

    public   RepasBoissons(Integer pcode, String plibelle, Boolean pisRepas){
        code = pcode;
        libelle = plibelle;
        isRepas = pisRepas;
    }

    public Integer getCode() {
        return code;
    }

    public String getLibelle() {
        return libelle;
    }

    public Boolean getRepas() {
        return isRepas;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setRepas(Boolean repas) {
        isRepas = repas;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
