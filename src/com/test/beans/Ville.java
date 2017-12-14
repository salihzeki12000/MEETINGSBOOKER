package com.test.beans;

public class Ville {
    private Integer     codeVille;
    private String      nomVille;
    private Pays        unPays;

    public      Ville(Integer pcodeVille, String pnomVille, Pays punPays){
        codeVille = pcodeVille;
        nomVille = pnomVille;
        unPays = punPays;
    }

    public Integer getCodeVille() {
        return codeVille;
    }

    public String getNomVille() {
        return nomVille;
    }

    public Pays getUnPays() {
        return unPays;
    }

    public void setCodeVille(Integer codeVille) {
        this.codeVille = codeVille;
    }

    public void setNomVille(String nomVille) {
        this.nomVille = nomVille;
    }

    public void setUnPays(Pays unPays) {
        this.unPays = unPays;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
