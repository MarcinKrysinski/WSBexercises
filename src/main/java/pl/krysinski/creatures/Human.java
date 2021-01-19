package pl.krysinski.creatures;

import pl.krysinski.creatures.Animal;
import pl.krysinski.devices.Car;
import pl.krysinski.devices.Phone;

import java.time.LocalDateTime;

public class Human extends Animal{
    private final String name;
    private final String lastName;
    private Double salary;
    private Double cash;
    private Animal pet;
    private Car car;
    private Phone phone;


    public Human(String species, Double weight, String name, String lastName, Double salary, Animal pet, Car car) {
        super(species, weight);
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
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

    public Car getCar() {
        return car;
    }

    public Phone getPhone() {
        return phone;
    }

    public Double getCash() {
        return cash;
    }

    public void setSalary(Double salary) {
        if(salary < 0){
            System.out.println("Wypłata nie może być ujemna!!!");
        }else{
            this.salary = salary;
            System.out.println("Zmieniono wysokośc pensji! Aktualana pensja wynosi: " + salary);
        }
    }

    public void setCarWhenBuyInCarShop(Car car) {

        if(this.cash > car.getValue()){
            System.out.println("Kupiłeś auto za gotówke!");
            this.car = car;
        }else if (this.salary > car.getValue()/12){
            System.out.println("Wziąłeś auto na kredyt!");
            this.car = car;
        }else{
            System.out.println("Nie stać Cię lamusie, skończ studia albo jedź na truskawki czy coś!");
        }
    }

    public void setCarWhenBuySecondHandCar(Car car){
        this.car = car;
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


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", cash=" + cash +
                ", pet=" + pet +
                ", car=" + car +
                ", phone=" + phone +
                '}';
    }

}