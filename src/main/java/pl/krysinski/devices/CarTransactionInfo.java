package pl.krysinski.devices;

import pl.krysinski.creatures.Human;

import java.time.LocalDate;

public class CarTransactionInfo {
    private Human seller;
    private Human buyer;
    private Car car;
    private Double price;
    private LocalDate saleDate;

    public CarTransactionInfo(Human seller, Human buyer, Car car, Double price) {
        this.seller = seller;
        this.buyer = buyer;
        this.price = price;
        this.saleDate = LocalDate.now();
    }

    public CarTransactionInfo() {
        this.saleDate = LocalDate.now();
    }

    public Human getSeller() {
        return seller;
    }

    public void setSeller(Human seller) {
        this.seller = seller;
    }

    public Human getBuyer() {
        return buyer;
    }

    public void setBuyer(Human buyer) {
        this.buyer = buyer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    @Override
    public String toString() {
        return "CarTransactionInfo{" +
                "seller=" + seller +
                ", buyer=" + buyer +
                ", car=" + car +
                ", price=" + price +
                ", saleDate=" + saleDate +
                '}';
    }
}
