package pl.krysinski.devices;

public class Phone extends Device{
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
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", screenSize=" + screenSize +
                '}';
    }
}
