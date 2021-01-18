package pl.krysinski;

public class Animal {
    private final String species;
    private Double weight;
    private Boolean isAlive = true;

    private static final Double MIN_WEIGHT = 5.0;

    public Animal(String species, Double weight) {
        this.species = species;
        this.weight = weight;
    }

    public void feed(double foodWeight){
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
}
