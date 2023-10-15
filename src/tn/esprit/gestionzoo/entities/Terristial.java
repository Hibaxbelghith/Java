package tn.esprit.gestionzoo.entities;

public class Terristial extends Animal{

    protected int nbrLegs; //nombre de ses pâtes.

    public Terristial(int nbrLegs,String family,String name,int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }

    public String toString() {
        return ("habitat : "+this.nbrLegs+" "+"Famille : "+super.getFamily()+" "+"nom : "+super.getName()+" "+"age : "+super.getAge()+" "+"isMammal ? :"+super.isMammal());
    }
}
