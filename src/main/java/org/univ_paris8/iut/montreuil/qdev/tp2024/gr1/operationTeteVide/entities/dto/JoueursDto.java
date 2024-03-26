package org.univ_paris8.iut.montreuil.qdev.tp2024.gr1.operationTeteVide.entities.dto;

import java.util.List;

public  class JoueursDto {

    private String prenom;
    private String pseudo;
    private int age;
    private List<String> centresInterets;
    private String languePreferee;

    public JoueursDto(String prenom, String pseudo, int age, List<String> centresInterets, String languePreferee) {
        this.prenom = prenom;
        this.pseudo = pseudo;
        this.age = age;
        this.centresInterets = centresInterets;
        this.languePreferee = languePreferee;
    }

    @Override
    public String toString() {
        return "JoueursDto{" +
                "prenom='" + prenom + '\'' +
                ", pseudo='" + pseudo + '\'' +
                ", age=" + age +
                ", centresInterets=" + centresInterets +
                ", languePreferee='" + languePreferee + '\'' +
                '}';
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCentresInterets(List<String> centresInterets) {
        this.centresInterets = centresInterets;
    }

    public void setLanguePreferee(String languePreferee) {
        this.languePreferee = languePreferee;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getPseudo() {
        return pseudo;
    }

    public int getAge() {
        return age;
    }

    public List<String> getCentresInterets() {
        return centresInterets;
    }

    public String getLanguePreferee() {
        return languePreferee;
    }

}
