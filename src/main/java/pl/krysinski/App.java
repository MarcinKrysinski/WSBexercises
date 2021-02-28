package pl.krysinski;

import pl.krysinski.creatures.Animal;
import pl.krysinski.creatures.Human;
import pl.krysinski.creatures.Pet;
import pl.krysinski.devices.Car;
import pl.krysinski.devices.Diesel;
import pl.krysinski.repo.Repository;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {

//        Animal petTest = new Animal("Unknown", 10.0);
//        petTest.feed(3);
//

////        car.turnOn();
//
//        Human buyer = new Human("Homo sapiens", 80.0, "Marcin", "Krysinski", 3000.0, null, 4);
//        Human seller = new Human("Homo sapiens", 80.0, "Marcin", "Krysinski", 3000.0, null, 4);



//        seller.setCar(car, 0);
//        buyer.setCash(500.0);
//        System.out.println(buyer);
//        System.out.println(seller);
//        System.out.println(car.owners);
//        car.sell(seller, buyer, 100.0);
//        System.out.println(buyer);
//        System.out.println(seller);
//        System.out.println(car.owners);
//
//        Repository test = new Repository();
//        Pet pet = new Pet("Dog", 19.0);
//        Animal testAnimal = new Animal("Catty", 5.0);
//        testAnimal.saveA();
//        pet.saveA();
//
//        Human human1 = new Human("Homo sapiens", 80.0, "Marian","Pazdzioch", 2000.0);
//        Human human2 = new Human("Homo sapiens", 100.0, "Ferdek","Kiepski", 500.0);
//        human1.save();
//        human2.save();
//
//
//        Car car = new Diesel("Opel", "Vectra", 2008, 15000.0);
//        Car car2 = new Diesel("Opel", "Corsa", 2008, 1000.0);
//        Car car3 = new Diesel("Opel", "Astra", 2008, 150000.0);
//        Car car4 = new Diesel("Opel", "Vivaro", 2008, 54000.0);
//
//        Map<String,Car> cars = new TreeMap<>();
//        cars.put("Vectra", car);
//        cars.put("Corsa", car2);
//        cars.put("Astra", car3);
//        cars.put("Vivaro", car4);
//
//        for (String c:cars.keySet()) {
//            System.out.println(c);
//        }


        Map<String, Double> countries = new HashMap<>();
        countries.put("Poland", 312679.0);
        countries.put("Monaco", 1.95);
        countries.put("Russia", 17075400.0);
        countries.put("Czech", 78866.0);

        Map<String, Double> result = countries.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));

//        Double value = result.entrySet().stream().reduce((first, second) -> second).orElse(null).getValue();

        Object[] objects = result.values().toArray();

        System.out.println(result.objects[0]);
        System.out.println(objects[objects.length-1]);
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
