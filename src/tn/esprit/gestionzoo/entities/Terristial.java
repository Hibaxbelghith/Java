package tn.esprit.gestionzoo.entities;

public class Terristial extends Animal implements Omnivore<Food>{

    protected int nbrLegs; //nombre de ses pâtes.

    public Terristial(int nbrLegs,String family,String name,int age, boolean isMammal){
        super(family,name,age,isMammal);
        this.nbrLegs=nbrLegs;
    }

    public String toString() {
        return ("habitat : "+this.nbrLegs+" "+"Famille : "+super.getFamily()+" "+"nom : "+super.getName()+" "+"age : "+super.getAge()+" "+"isMammal ? :"+super.isMammal());
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("Terrestrial mange de la viande");
        } else {
            System.out.println("Terrestrial ne peut pas manger cette viande");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("Terrestrial mange des plantes");
        } else {
            System.out.println("Terrestrial ne peut pas manger cette plante");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {
        if (food == Food.BOTH) {
            System.out.println("Terrestrial mange à la fois de la viande et des plantes");
        } else {
            System.out.println("Terrestrial ne peut pas manger cette nourriture");
        }
    }
}
