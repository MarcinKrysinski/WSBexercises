package pl.krysinski.devices;

import pl.krysinski.Human;
import pl.krysinski.Sellable;

public class Phone extends Device implements Sellable {
    private final Double screenSize;

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone on!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                '}';
    }
}
