package pl.krysinski;

import pl.krysinski.creatures.Animal;
import pl.krysinski.creatures.Human;
import pl.krysinski.devices.Car;
import pl.krysinski.devices.Diesel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

//        Animal petTest = new Animal("Unknown", 10.0);
//        petTest.feed(3);

        Car car = new Diesel("Opel", "Vectra", 2008, 15000.0);
        Car car2 = new Diesel("Opel", "Corsa", 2008, 1000.0);
        Car car3 = new Diesel("Opel", "Astrra", 2008, 150000.0);
        Car car4 = new Diesel("Opel", "Vivaro", 2008, 54000.0);
//        car.turnOn();

        Human buyer = new Human("Homo sapiens", 80.0, "Marcin", "Krysinski", 3000.0, null, 4);
        Human seller = new Human("Homo sapiens", 80.0, "Marcin", "Krysinski", 3000.0, null, 4);


        seller.setCar(car, 0);
        buyer.setCash(500.0);
        System.out.println(buyer);
        System.out.println(seller);
        System.out.println(car.owners);
        car.sell(seller, buyer, 100.0);
        System.out.println(buyer);
        System.out.println(seller);
        System.out.println(car.owners);
//        buyer.setCar(car2, 1);
//        buyer.setCar(car3, 2);
//        buyer.setCar(car4, 3);

//        System.out.println(buyer);
//        Car[] cars = buyer.getGarage();
//        for (Car value : cars) {
//            System.out.println(value);
//        }
//        Car[] carsSorted = buyer.sortedCarsInGarageByValue();
//        System.out.println("Po sortowaniu:");
//        for (Car value : carsSorted) {
//            System.out.println(value);
//        }
//        Human seller = new Human("aaaaa", "aaaaaa", 0.0, null, null);
//
//        buyer.setCash(500.0);
//        System.out.println(buyer);
//        System.out.println(seller);
//        car.sell(seller,buyer, 200.0);
//        System.out.println(buyer);
//        System.out.println(seller);
    }
}
