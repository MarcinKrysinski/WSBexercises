package pl.krysinski.creatures;

public class FarmAnimal extends Animal implements Edible{


    public FarmAnimal(String species, Double weight) {
        super(species, weight);
    }

    @Override
    public void beEaten() {
        this.setWeight(0.0);
        this.isAlive = false;
        System.out.println("Było zwierze, ni ma zwierza..");

    }

}
