public class Zoo {
    Animal[] animals;
    String name, city;

    final int nbrCages = 25; //Instruction14
    int animaux;

    public Zoo() {
    }

    Zoo(Animal[] animals, String name, String city) {
        this.name = name;
        this.city = city;
        // this.animals = new Animal[25]; //initialisation fixe a 25 animaux max
        this.animals = new Animal[nbrCages];
        this.animaux = 0; //compteur addAnimal initialisé a 0
    }

    public void displayZoo() { //methode affichage zoo
        System.out.println(name + city + nbrCages);
    }

    public String toString() {
        return "Zoo name :" + name + ", city : " + city + ", nombres Cages : " + nbrCages + "]";
    }

    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        if (animaux < nbrCages && nbrCages < 25) { //nbr max cases 25
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
            System.out.println("Nom: " + animals[i].name);
            System.out.println("Famille: " + animals[i].family);
            System.out.println("Âge: " + animals[i].age);
            System.out.println("Mammifère: " + animals[i].isMammal);
        }
    }

    int searchAnimal(Animal animal) {
        int indice = -1;
        for (int i = 0; i < animaux; i++) {
            if (animals[i].name == animal.name)
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
        return animaux >= nbrCages;
    }

    Zoo comparerZoo(Zoo z1, Zoo z2){
       int zoo1= z1.nbrCages - z1.animaux;
       int zoo2 = z2.nbrCages - z2.animaux;
       if (zoo1>zoo2){
           return z1;}

       return z2;

    }

}






