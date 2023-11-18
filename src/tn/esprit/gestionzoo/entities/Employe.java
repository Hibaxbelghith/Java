package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Employe {

    private int ident;
    private String nom;
    private String depart;
    private int grade;

    public Employe(){};
    public Employe(int ident, String nom,String depart, int grade){
        this.ident=ident;
        this.nom=nom;
        this.depart=depart;
        this.grade=grade;
    }

    public int getIdent() {
        return ident;
    }

    public String getNom() {
        return nom;
    }

    public String getDepart() {
        return depart;
    }

    public int getGrade() {
        return grade;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return ident == employe.ident && Objects.equals(nom, employe.nom);
    }

    @Override
    public String toString() {
        return this.depart+this.grade+this.nom+this.ident;
    }
}
