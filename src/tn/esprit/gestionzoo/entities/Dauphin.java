package tn.esprit.gestionzoo.entities;

public class Dauphin extends Aquatic{
    protected float swimmingSpeed; //vitesse de nage.

    public Dauphin(float swimmingSpeed,String habitat,String family,String name,int age, boolean isMammal){
        super(habitat,family,name,age,isMammal);
        this.swimmingSpeed=swimmingSpeed;
    }

    public String toString() {
        return ("Vitesse de nage : "+this.swimmingSpeed+" "+"habitat : "+this.habitat+" "+"Famille : "+super.getFamily()+" "+"nom : "+super.getName()+" "+"age : "+super.getAge()+" "+"isMammal ? : "+super.isMammal());
    }


    @Override
    public void swim(){
        System.out.println("This dolphin is swimming.");
    }
}
