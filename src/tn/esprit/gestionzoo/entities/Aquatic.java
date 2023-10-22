package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal{
    protected String habitat; //endroit de vie.

    public Aquatic(String habitat,String family,String name,int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    public String toString() {
        return ("endroit de vie : "+" "+this.habitat+"Famille :"+super.getFamily()+" "+"nom :"+super.getName()+" "+"age : "+super.getAge()+" "+"isMammal ? :"+super.isMammal());
    }


    public abstract void swim();

    public boolean equals(Aquatic a) {
        if (this.habitat.equals(a.habitat) && this.getAge() == a.getAge() && this.getName().equals(a.getName())) {
            return true; //equals pour comparer les string
        }
        return false;
    }

}
