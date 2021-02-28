package pl.krysinski.creatures;

import pl.krysinski.Sellable;
import pl.krysinski.repo.Connector;
import pl.krysinski.repo.Repository;

public class Animal implements Sellable, Feedable {
    private final String species;
    private Double weight;
    public Boolean isAlive = true;

    private static final Double MIN_WEIGHT = 5.0;

    public Animal(String species, Double weight) {
        if (species.equals("Homo sapiens")){
            this.species = species;
            this.weight = weight;
            saveA();
        }else {
            this.species = species;
            this.weight = weight;
        }
    }

    public void feed(){
        if (this.species.equals("dog")){
            feed(1.5);
        }else if (this.species.equals("cat")){
            feed(1.0);
        }else if (this instanceof FarmAnimal){
            feed(5.0);
        }

    }

    public void feed(Double foodWeight){
        if(isAlive){
            this.weight += foodWeight/2;
            System.out.println("Nakrmiłeś zwierzaka. Jego waga wynosi wzrosła teraz o : " + foodWeight/2 + " i wynosi: "+ this.weight);
        }else {
            System.out.println("Za późno Twój zwierzak zdechł, a trupa nie da się nakarmić...");
        }
    }

    public void takeForAWalk(){
        if (isAlive){
            this.weight--;
            if(this.weight <= MIN_WEIGHT)
            {
                isAlive = false;
                System.out.println("Waga zwierzaka osiągneła " + this.weight + ". Zwierzak zdechł...");
            }else if (this.weight >= MIN_WEIGHT && this.weight <= MIN_WEIGHT + 1){
                System.out.println("Wyprowadziłeś zwierzaka na spacer. Waga zwierzaka jest bliska 0!!! Nakarm go szybko!!");
            }else{
                System.out.println("Wyprowadziłeś zwierzaka na spacer. Jego waga zmalała i wynosi teraz: " + this.weight);
            }
        }
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPet() != null && !seller.getPet().species.equals("human")){
            if (buyer.getCash() >= price){
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.setPet(seller.getPet());
                seller.setPet(null);
                System.out.println("Transakcja sfinalizowana!");
            }else {
                System.out.println("Nie stać Cie!");
            }
        }else if (seller.getPet() != null && seller.getPet().species.equals("human")){
            System.out.println("Handel ludzmi jest zakazany!!");
        }else if (seller.getPet() != null){
            System.out.println("Sprzedający nie ma zwierzaka na sprzedaz!");
        }
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void saveA(){
        String sql = "INSERT INTO ANIMAL (SPECIES, WEIGHT) VALUES (" + "'"+this.species + "'" + ", " + this.weight + ");";
//        String sql = "INSERT INTO PET (SPECIES, WEIGHT) VALUES ('doggy', 8.0);";
        Repository.executiveSQL(sql);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                ", isAlive=" + isAlive +
                '}';
    }


}
