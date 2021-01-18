package pl.krysinski;

public class Human {
    private final String name;
    private final String lastName;
    private Animal pet;
    private Car car;

    public Human(String name, String lastName, Animal pet, Car car) {
        this.name = name;
        this.lastName = lastName;
        this.pet = pet;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
