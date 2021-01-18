package pl.krysinski;

public class Car {
    private final String producer;
    private final String model;
    private Double value;

    public Car(String producer, String model, Double value) {
        this.producer = producer;
        this.model = model;
        this.value = value;
    }

    public Double getValue() {
        return value;
    }
}
