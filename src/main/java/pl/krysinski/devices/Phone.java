package pl.krysinski.devices;

import pl.krysinski.creatures.Human;
import pl.krysinski.Sellable;

import java.util.List;

public class Phone extends Device implements Sellable, Installer {
    private final Double screenSize;
    public static final String DEFAULT_APP_VERSION = "LATEST";
    public static final String DEFAULT_SERVER_ADDRESS = "appserver.me.com";

    public Phone(String producer, String model, Integer yearOfProduction, Double screenSize) {
        super(producer, model, yearOfProduction);
        this.screenSize = screenSize;
    }

    @Override
    public void turnOn() {
        System.out.println("Phone on!");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller.getPhone() != null){
            if (buyer.getCash() >= price){
                buyer.setCash(buyer.getCash() - price);
                seller.setCash(seller.getCash() + price);
                buyer.setPhone(seller.getPhone());
                seller.setPhone(null);
                System.out.println("Transakcja sfinalizowana!");
            }else {
                System.out.println("Nie stać Cie!");
            }
        }else{
            System.out.println("Sprzedający nie ma telefonu na sprzedaz!");
        }
    }


    @Override
    public boolean installAnnApp(String appName) {
        System.out.println("Zainstalowano aplkacje " + appName + " v. " + DEFAULT_APP_VERSION);
        return true;
    }

    @Override
    public boolean installAnnApp(String appName, String version) {
        System.out.println("Zainstalowano aplkacje " + appName +" w wersji " + version + " server: " + DEFAULT_SERVER_ADDRESS);
        return true;
    }

    @Override
    public boolean installAnnApp(String appName, String version, String serverUrl) {
        System.out.println("Zainstalowano aplkacje " + appName +" w wersji " + version + " z serwera " + serverUrl );
        return true;
    }

    @Override
    public boolean installAnnApp(List<String> appNames) {
        System.out.println("Zainstalowano aplkacje nastepujące aplikacje: ");
        for (String appName: appNames) {
            System.out.println(appName);
        }
        return true;
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
