package pl.krysinski.creatures;

import pl.krysinski.creatures.Animal;
import pl.krysinski.devices.Car;
import pl.krysinski.devices.CarComparator;
import pl.krysinski.devices.Phone;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Human extends Animal {
    private final String name;
    private final String lastName;
    private Double salary;
    private Double cash;
    private Animal pet;
    private final Car[] garage;
    private Phone phone;
    public static final Integer GARAGE_DEFAULT_SIZE = 4;


    public Human(String species, Double weight, String name, String lastName, Double salary, Animal pet, Integer sizeGarage) {
        super(species, weight);
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.pet = pet;
        this.garage = new Car[sizeGarage];
        this.cash = 0.0;
    }

    public Human(String species, Double weight, String name, String lastName, Double salary, Animal pet) {
        super(species, weight);
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.pet = pet;
        this.garage = new Car[GARAGE_DEFAULT_SIZE];
        this.cash = 0.0;
    }


    @Override
    public void feed() {
        System.out.println("Dzięki za zarcie!");
    }

    public Double getSalary() {
        System.out.println("Pobieranie wynagrodzenia: " + LocalDateTime.now());
        return salary;
    }

    public Animal getPet() {
        return pet;
    }

    public Car getCar(Integer parkNumber) {
        return garage[parkNumber];
    }

    public Phone getPhone() {
        return phone;
    }

    public Double getCash() {
        return cash;
    }

    public Car[] getGarage() {
        return garage;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Wypłata nie może być ujemna!!!");
        } else {
            this.salary = salary;
            System.out.println("Zmieniono wysokośc pensji! Aktualana pensja wynosi: " + salary);
        }
    }

    public void setCar(Car car, Integer parkNumber) {
        this.garage[parkNumber] = car;
    }


    public void setCash(Double cash) {
        this.cash = cash;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Double sumAllCarsValue() {
        Double sumAllCarsValue = 0.0;
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] != null) {
                sumAllCarsValue += this.garage[i].getValue();
            }
        }
        return sumAllCarsValue;
    }

    public Car[] sortedCarsInGarageByValue() {
        Arrays.sort(this.garage, new CarComparator());
        return this.garage;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", cash=" + cash +
                ", pet=" + pet +
                ", garage=" + Arrays.toString(garage) +
                ", phone=" + phone +
                '}';
    }
}
