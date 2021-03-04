package pl.krysinski;

import pl.krysinski.creatures.Animal;
import pl.krysinski.creatures.Human;
import pl.krysinski.creatures.Pet;
import pl.krysinski.devices.Car;
import pl.krysinski.devices.Diesel;
import pl.krysinski.repo.Connector;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception {


       // Zadanie 1

        Connector.JDBCConnection();

        Pet pet = new Pet("Dog", 19.0);
        Animal testAnimal = new Animal("Catty", 5.0);
        Animal animal = new Animal("Python", 3.0);
        testAnimal.saveAnimal();
        pet.saveAnimal();
        animal.saveAnimal();
        Animal.findAllAnimal();


        Human human1 = new Human("Homo sapiens", 80.0, "Marian","Pazdzioch", 2000.0);
        Human human2 = new Human("Homo sapiens", 100.0, "Ferdek","Kiepski", 500.0);
        human1.save();
        human2.save();


        // Zadanie 2

        Animal.findAllAnimal();
        Human.findAllHuman();


        // Zadanie 3

        Car car = new Diesel("Opel", "Vectra", 2008, 15000.0);
        Car car2 = new Diesel("Opel", "Corsa", 2008, 1000.0);
        Car car3 = new Diesel("Opel", "Astra", 2008, 150000.0);
        Car car4 = new Diesel("Opel", "Vivaro", 2008, 54000.0);

        Map<String,Car> cars = new TreeMap<>();
        cars.put("Vectra", car);
        cars.put("Corsa", car2);
        cars.put("Astra", car3);
        cars.put("Vivaro", car4);

        for (String c:cars.keySet()) {
            System.out.println(c);
        }

        
        // Zadanie 4

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

        int i=0;
        for (Map.Entry<String, Double> entry : result.entrySet()) {
            if(i == 0 || i == result.size()-1) {
                System.out.println(entry.getKey() + " / " + entry.getValue());
                i++;
            }
        }

    }
}
