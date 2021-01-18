package pl.krysinski.devices;

public class Car extends Device{
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
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
