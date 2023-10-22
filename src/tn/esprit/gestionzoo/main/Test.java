package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class Test {
    public static void main(String[] args) {
        //Instruction 5
        // Création d'un animal (lion) en utilisant le constructeur par défaut
        //Animal lion = new Animal();
        //lion.name = "Lion";
        //lion.family = "Félin";
        //lion.age = 5;
        //lion.isMammal = true;

        // Création d'un zoo (myZoo) en utilisant le constructeur par défaut
        //Zoo myZoo = new Zoo();
        //myZoo.name = "Mon Zoo";
        //myZoo.city = "Ma Ville";
        //myZoo.nbrCages = 50; // Par exemple, 50 cages disponibles


        //Instruction 6
        // Création d'un animal lion:
        //Animal lion = new Animal("Félin", "lion", 20, true);
        // Création d'un zoo zooPark
        //Zoo myZoo = new Zoo("ZooParc","France", 30);
        // => myZoo ne peut pas accepter le tableau entre parethese car il n'est pas mis comme argument en parametres constructeur

        //Instruction 7
        // Créer un tableau d'animaux
        Animal[] zooAnimals = new Animal[25];
        // Ajouter le lion à la case 0 du tableau d'animaux
        //zooAnimals[0] = lion;
        // Créer un zoo (myZoo) avec le tableau d'animaux
        Zoo myZoo = new Zoo(zooAnimals, "Mon Zoo", "Ma Ville");


        //Instruction 8
        myZoo.displayZoo(); //appeler la methode affichage
        System.out.println(myZoo); //affiche l'@ mémoire de l'objet myZoo
        System.out.println(myZoo.toString()); //meme resultat

        //Instruction 9
        //Aprés la définition de methode toString() l'objet myZoo et lion s'affichent
        //System.out.println(lion);

        //Instruction 10
        //myZoo.addAnimal(lion);

        //Instruction11
        myZoo.AffichageAnimaux();

        //Aquatic aqua = new Aquatic("Ocean","Dolphinidae","Flipper",12,true);
        Terristial T = new Terristial(4,"Canidae","Fido",6,true);
        Dauphin D = new Dauphin((float) 20.5,"Ocean","Delphinidae","Splash",15,true);
        Penguin P = new Penguin((float) 9.3,"Southern Ocean","Spheniscidae","Waddle",7,false);
        //System.out.println(aqua);
        //toString : Instruction 23
        System.out.println(T);
        System.out.println(D);
        System.out.println(P);
        //redefinition : meme affichage pour aquatic et penguin et affichage particulier pour dauphin
        //aqua.swim();
        D.swim();
        P.swim();

        //Instruction 26
        //myZoo.addAquaticAnimal(aqua);
        myZoo.addAquaticAnimal(D);
        myZoo.addAquaticAnimal(P);

        //Instruction 26
        for(int i=0;i<myZoo.aquaticAnimals.length;i++){
            myZoo.aquaticAnimals[i].swim();
        }



    }

}