package pl.krysinski.devices;

import pl.krysinski.Human;
import pl.krysinski.Sellable;

public class Car extends Device implements Sellable {
    private final Double value;

    public Car(String producer, String model,Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction);
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public void turnOn() {
        System.out.println("Engine start!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

}
