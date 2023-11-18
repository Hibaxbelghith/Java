package tn.esprit.gestionzoo.entities;
import java.util.*;
public class SocieteArrayList implements IGestion<T>{

    List <Employe>EmployeeList = new ArrayList();

    @Override
    public void ajouterEmploye(T t) {

    }

    @Override
    public boolean rechercherEmploye(String nom) {
        return false;
    }

    @Override
    public boolean rechercherEmploye(T t) {
        return false;
    }

    @Override
    public void supprimerEmploye(T t) {

    }

    @Override
    public void displayEmploye() {

    }

    @Override
    public void trierEmployeParId() {

    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {

    }
}
