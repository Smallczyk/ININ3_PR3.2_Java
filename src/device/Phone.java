package device;

import creatures.Human;
import java.net.Inet4Address;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Sellable {
    static final String DEFAULT_SERVER_ADRESS = "pepethefrog.com";
    static final float DEFAULT_VERSION = 1.21f;
    static final String protocol = "HTTPS";

    Human owner;
    private int price;

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
        if (seller == owner) {
            if (price <= buyer.cash) {
                seller.cash += price;
                buyer.cash -= price;
                owner = buyer;
            } else System.out.println("not enough money");
        } else System.out.println("you dont own it");
    }

    //Zadanie 10
    public void installAnApp(String name) {
        System.out.println("Zainstalowano: " + name + "; ");
    }

    public void installAnApp(String name, float ver) {
        System.out.println("Zainstalowano: " + name + "; " + ver);
    }

    public void installAnApp(String name, float ver, Inet4Address server) {
        System.out.println("Zainstalowano: " + name + "; " + ver + "; " + server);
    }

    public void installAnApp(List appList) {
        System.out.println("Wybór aplikacji: " + appList);
    }

    public void installAnApp(URL appurl) {
        appurl.getDefaultPort();
        appurl.getProtocol();
        System.out.println("kAPPKa");
    }

}