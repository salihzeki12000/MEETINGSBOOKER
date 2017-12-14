package com.test.beans;

public class Reservation {
    private Integer     code;
    private String      duree;
    private Integer     nbPersonnes;
    private String      dateD;
    private String      dateF;

    public      Reservation(Integer pcode, String pduree, Integer pnbPersonnes, String pdateD, String pdateF){
       this.code = pcode;
       this.duree = pduree;
       this.nbPersonnes = pnbPersonnes;
       this.dateD = pdateD;
       this.dateF = pdateF;
    }

    public Integer getCode(){
        return code;
    }

    public void setCode(Integer pcode){
        this.code = pcode;
    }

    public Integer getNbPersonnes() {
        return nbPersonnes;
    }

    public String getDateD() {
        return dateD;
    }

    public String getDateF() {
        return dateF;
    }

    public String getDuree() {
        return duree;
    }

    public void setDateD(String dateD) {
        this.dateD = dateD;
    }

    public void setDateF(String dateF) {
        this.dateF = dateF;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public void setNbPersonnes(Integer nbPersonnes) {
        this.nbPersonnes = nbPersonnes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

