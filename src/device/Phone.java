package device;
import creatures.Human;
import device.Device;
import device.Sellable;

public class Phone extends Device implements Sellable {
    private int price;
    Human owner;

    @Override
    public String toString() {
        return "device.Phone{" +
                "price=" + price +
                '}';
    }

    @Override
    public void turnOn() {
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == owner){
            if(price<=buyer.cash){
                seller.cash += price;
                buyer.cash -= price;
                owner = buyer;
            } else System.out.println("not enough money");
        }else System.out.println("you dont own it");
    }
}
