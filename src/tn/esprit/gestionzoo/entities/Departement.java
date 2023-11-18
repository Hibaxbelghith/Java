package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Departement {

    private int id;
    private String nomDepart;
    private int nbEmployee;

    public Departement(){}

    public Departement(int id, String nomDepart, int nbEmployee) {
        this.id = id;
        this.nomDepart = nomDepart;
        this.nbEmployee = nbEmployee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepart() {
        return nomDepart;
    }

    public void setNomDepart(String nomDepart) {
        this.nomDepart = nomDepart;
    }

    public int getNbEmployee() {
        return nbEmployee;
    }

    public void setNbEmployee(int nbEmployee) {
        this.nbEmployee = nbEmployee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && nbEmployee == that.nbEmployee && Objects.equals(nomDepart, that.nomDepart);
    }

    @Override
    public String toString() {
        return this.nomDepart+this.nbEmployee+this.id;
    }
}
