package com.test.beans;

public class Capacite {
    private Integer     code;
    private String      disposition;
    private Integer     nbPersonnes;

    public      Capacite(Integer pcode, String pdispositon, Integer pnbPersonnes){
        code = pcode;
        disposition = pdispositon;
        nbPersonnes = pnbPersonnes;
    }

    public Integer getCode() {
        return code;
    }

    public String getDisposition() {
        return disposition;
    }

    public Integer getNbPersonnes() {
        return nbPersonnes;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setNbPersonnes(Integer nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
