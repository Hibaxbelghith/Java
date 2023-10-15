package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic{
    protected float swimmingDepth; //profondeur à laquelle il peut nager sous l'eau.

    public Penguin(float swimmingDepth,String habitat,String family,String name,int age, boolean isMammal){
        super(habitat,family,name,age,isMammal);
        this.swimmingDepth=swimmingDepth;
    }

    public String toString() {
        return ("profondeur : "+this.swimmingDepth+" "+"habitat : "+this.habitat+" "+"Famille : "+super.getFamily()+" "+"nom : "+super.getName()+" "+"age : "+super.getAge()+" "+"isMammal ? :"+super.isMammal());
    }
}
