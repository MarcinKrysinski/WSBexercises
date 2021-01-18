package pl.krysinski;

import pl.krysinski.devices.Car;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Animal petTest = new Animal("Unknown", 10.0);
        petTest.feed(3);

        Car car = new Car("Opel", "Vectra", 2008, 15000.0);
        car.turnOn();
    }
}
