package com.test.beans;

import java.util.ArrayList;

public class    Lieu {
    private Integer     code;
    private String      libelle;
    private String      lienCarte;
    private ArrayList<Salle>    lesSalles;
    private ArrayList<String>   lesLiensImages;

    public      Lieu(Integer pcode, String plibelle, String plienCarte, ArrayList<String> plesLiensImages){
        this.code = pcode;
        this.libelle = plibelle;
        this.lienCarte = plienCarte;
        lesSalles = new ArrayList<Salle>();
        lesLiensImages = plesLiensImages;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getLibelle() {
        return libelle;
    }

    public String getLienCarte() {
        return lienCarte;
    }

    public ArrayList<Salle> getLesSalles() {
        return lesSalles;
    }

    public ArrayList<String> getLesLiensImages() {
        return lesLiensImages;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public void setLienCarte(String lienCarte) {
        this.lienCarte = lienCarte;
    }

    public void setLesSalles(ArrayList<Salle> lesSalles) {
        this.lesSalles = lesSalles;
    }

    public void setLesLiensImages(ArrayList<String> lesLiensImages) {
        this.lesLiensImages = lesLiensImages;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
