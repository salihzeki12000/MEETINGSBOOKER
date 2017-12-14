package com.test.beans;

public class Pays {
    private Integer codePays;
    private String nomPays;

    public      Pays(Integer pcodePays, String pnomPays){
        codePays = pcodePays;
        nomPays = pnomPays;
    }

    public Integer getCodePays() {
        return codePays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setCodePays(Integer codePays) {
        this.codePays = codePays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
