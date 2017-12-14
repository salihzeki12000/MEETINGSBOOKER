package com.test.beans;

public class User {
    private Integer     code;
    private String      nom;
    private String      prenom;
    private String      mail;
    private String      mdp;

    public      User(Integer pcode, String pnom, String pprenom, String pmail, String pmdp){
        code = pcode;
        nom = pnom;
        prenom = pprenom;
        mail = pmail;
        mdp = pmdp;
    }

    public Integer getCode() {
        return code;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getMail() {
        return mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
