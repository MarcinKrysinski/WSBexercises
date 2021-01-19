package pl.krysinski.devices;

import pl.krysinski.creatures.Human;
import pl.krysinski.Sellable;

public abstract class Car extends Device implements Sellable {

    public Car(String producer, String model,Integer yearOfProduction, Double value) {
        super(producer, model, yearOfProduction, value);
    }

    public Double getValue() {
        return value;
    }

    @Override
    public void turnOn() {
        System.out.println("Engine start!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)){
            throw new Exception("Sprzedjący nie ma auta!");
        }else if (!buyer.hasFreeSpaceInGarage()){
            throw new Exception("Kupujący nie ma miejsca w Garazu!");
        }else if (buyer.getCash() < price){
            throw new Exception("Kupujący nie ma wystarczającej ilości hajsu!");
        }
        seller.removeCar(this);
        buyer.addCar(this);
        buyer.setCash(buyer.getCash() - price);
        seller.setCash(seller.getCash() + price);
        System.out.println("Transakcja zakonczona sukcesem!");
    }



    public abstract void refuel();

    @Override
    public String toString() {
        return "Car{" +
                "value=" + value +
                ", producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

}
