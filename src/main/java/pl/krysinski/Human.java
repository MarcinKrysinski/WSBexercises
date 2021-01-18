package pl.krysinski;

import pl.krysinski.devices.Car;

import java.time.LocalDateTime;

public class Human {
    private final String name;
    private final String lastName;
    private Double salary;
    private Animal pet;
    private Car car;


    public Human(String name, String lastName, Double salary, Animal pet, Car car) {
        this.name = name;
        this.lastName = lastName;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
    }

    public Double getSalary() {
        System.out.println("Pobieranie wynagrodzenia: " + LocalDateTime.now());
        return salary;
    }

    public Car getCar() {
        return car;
    }

    public void setSalary(Double salary) {
        if(salary < 0){
            System.out.println("Wypłata nie może być ujemna!!!");
        }else{
            this.salary = salary;
            System.out.println("Zmieniono wysokośc pensji! Aktualana pensja wynosi: " + salary);
        }
    }

    public void setCar(Car car) {
        if(this.salary > car.getValue()){
            System.out.println("Kupiłeś auto za gotówke!");
            this.car = car;
        }else if (this.salary > car.getValue()/12){
            System.out.println("Wziąłeś auto na kredyt!");
            this.car = car;
        }else{
            System.out.println("Nie stać Cię lamusie, skończ studia albo jedź na truskawki czy coś!");
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
