package device;
import creatures.Human;

public class Car extends Device implements Sellable {

    Double millage;
    public Double value;
    public Human owner;

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = 0.0;
    }

    public Human getOwner() {
        System.out.println(owner);
        return owner;
    }

    @Override
    public String toString() {
        return producer + " " + model + " " + yearOfProduction + " " + millage;
    }

    @Override
    public boolean equals(Object c) {
        if (this == c) {
            return true;
        }
        if (c == null || getClass() != c.getClass()) {
            return false;
        }
        Car car = (Car) c;
        return producer == car.producer && model == car.model && yearOfProduction.equals(car.yearOfProduction);
    }

    @Override
    public void turnOn() {
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == owner) {
            if (price <= buyer.cash) {
                seller.cash += price;
                buyer.cash -= price;
                owner = buyer;
                System.out.println("car was sold");
            } else System.out.println("not enough money");
        } else System.out.println("you dont own it");
    }
}
