package tn.esprit.gestionzoo.entities;

public class Zoo {
    private Animal[] animals;
    private String name, city;

    private static final int nbrCages = 25; //Instruction14
    private int animaux;

    public Zoo() {
    }

    public Zoo(Animal[] animals, String name, String city) {
        this.name = name;
        this.city = city;
        // this.animals = new Animal[25]; //initialisation fixe a 25 animaux max
        this.animals = new Animal[nbrCages];
        this.animaux = 0; //compteur addAnimal initialisé a 0
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.isEmpty()) { //nom zoo non vide
            this.name = name;
        } else {
            System.out.println("Le nom du Zoo ne peut pas être vide.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnimaux() {
        return animaux;
    }

    public void setAnimaux(int animaux) {
        this.animaux = animaux;
    }

    public void displayZoo() { //methode affichage zoo
        System.out.println(name + city + nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo name :" + name + ", city : " + city + ", nombres Cages : " + nbrCages + "]";
    }

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (isZooFull()==true) { //Instruction 17
            animals[animaux] = animal;
            animaux++;
            return true;
        } else {
            System.out.println("Le zoo est plein");
            return false;
        }
    }


    public void AffichageAnimaux() {
        for (int i = 0; i < animaux; i++) {
            System.out.println("Nom: " + animals[i].getName());
            System.out.println("Famille: " + animals[i].getFamily());
            System.out.println("Âge: " + animals[i].getAge());
            System.out.println("Mammifère: " + animals[i].isMammal());
        }
    }

    int searchAnimal(Animal animal) {
        int indice = -1;
        for (int i = 0; i < animaux; i++) {
            if (animals[i].getName() == animal.getName())
                return i;
        }
        return indice;
    }

    boolean removeAnimal(Animal animal) {
        int Animalindex = searchAnimal(animal);
        if (Animalindex == -1)
            return false;
        animals[Animalindex] = null;
        return true;
    }

    //Instruction15
    boolean isZooFull() {
        return animaux == nbrCages;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2){
       int zoo1= z1.nbrCages - z1.animaux;
       int zoo2 = z2.nbrCages - z2.animaux;
       if (zoo1>zoo2){
           return z1;}

       return z2;

    }

}






