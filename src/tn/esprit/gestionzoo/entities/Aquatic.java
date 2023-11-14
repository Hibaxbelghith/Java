package tn.esprit.gestionzoo.entities;

public abstract class Aquatic extends Animal implements Carnivore<Food>{
    protected String habitat; //endroit de vie.

    public Aquatic(String habitat,String family,String name,int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Aquatic mange de la viande");
        } else {
            System.out.println("Aquatic ne peut pas manger cette nourriture");
        }
    }

    public String toString() {
        return ("endroit de vie : "+" "+this.habitat+"Famille :"+super.toString());
    }


    public abstract void swim();

    public boolean equals(Aquatic a) {
        if (this.habitat.equals(a.habitat) && this.getAge() == a.getAge() && this.getName().equals(a.getName())) {
            return true; //equals pour comparer les string
        }
        return false;
    }

}
