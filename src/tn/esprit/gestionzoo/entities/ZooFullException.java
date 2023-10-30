package tn.esprit.gestionzoo.entities;

public class ZooFullException extends Exception{

    public ZooFullException(){
    super();}


    //Personnaliser le message d'erreur avec constructeur paramétré
    public ZooFullException(String message){
        super(message);
        System.out.println("Zoo est plein !");
    }

}
