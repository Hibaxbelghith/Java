package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
    protected String habitat; //endroit de vie.

    public Aquatic(String habitat,String family,String name,int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    public String toString() {
        return ("endroit de vie : "+" "+this.habitat+"Famille :"+super.getFamily()+" "+"nom :"+super.getName()+" "+"age : "+super.getAge()+" "+"isMammal ? :"+super.isMammal());
    }

    public void swim(){
        System.out.println("This aquatic animal is swimming.");
    }

}
