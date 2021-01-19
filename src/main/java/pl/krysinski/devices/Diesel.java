package pl.krysinski.devices;

public class Diesel extends Car{

    public Diesel(String producer, String model, Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    @Override
    public void refuel() {
        System.out.println("Zatankowano ON");
    }
}
