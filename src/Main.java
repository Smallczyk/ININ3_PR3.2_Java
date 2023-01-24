import creatures.Animal;
import creatures.FarmAnimal;
import creatures.Human;
import creatures.Pet;
import device.Car;

public class Main {
    public static void main(String[] args) {

   /*     //Zadanie 1
        creatures.Animal zebra = new creatures.Animal("zebra");
//        zebra.name = "Albert";

        zebra.feed();
        System.out.println(zebra.weight);

        for (int i = 0; i < 344; i++) {
            zebra.takeForAWalk();
        }
        System.out.println(zebra.weight);
        System.out.println(zebra.alive);*/
/*

        device.Car passat = new device.Car("vw", "ipsum", 2022);
        passat.millage = 69420.0;

        //Zadanie 2
        creatures.Human seba = new creatures.Human("Sebastian", "Sebczyński", passat);

        System.out.println(passat.millage);
        System.out.println(passat.model);
        System.out.println(passat.yearOfProduction);
        System.out.println(passat.producer);

        device.Car fiat = new device.Car("Fiat", "multipla", 2090);
        fiat.millage = 0.0;

        System.out.println("Model auta: " + fiat.model);
        System.out.println("Przebieg: " + fiat.millage);

*/
        Car passat = new Car("ww", "ww", 2222);
        //Zadanie 3 & 4
        Human robert = new Human("Robert", "Bobert", passat);
        robert.getSalary();
        robert.setSalary(2000D);
        robert.getSalary();
        robert.setSalary(22000D);
        robert.getSalary();


/*
        //Zadanie 6
        device.Car passat2 = new device.Car("vw", "ipsum", 2022);
        passat.millage = 69420.0;

        System.out.println(passat.equals(passat2));
        System.out.println(passat);
        System.out.println(passat2);*/

        //Zadanie 7
     //   device.Phone phone = new device.Phone();
       // phone.turnOn();

        //Zadanie 8
/*        Car skoda = new Car("skoda", "fabia", 2009);
        Human andrzej = new Human("andrzej", "rzejdaj", skoda);
        skoda.owner = andrzej;
        skoda.getOwner();
        andrzej.setSalary(5D); //samochód zostanie sprzedany tylko jak cash != null

        skoda.sell(andrzej, robert, 2000.0);
        skoda.getOwner();
        andrzej.getSalary();

        Animal makak = new Animal("małpa");
        makak.owner = andrzej;
        makak.sell(andrzej, robert, 2000D);
        //makak.sell(andrzej, robert, 2000D);
        andrzej.getSalary();
        robert.getSalary();
        System.out.println(makak.owner);*/

        //Zadanie 9
        Pet dog = new Pet("dog");
        System.out.println(dog);
        dog.feed();
        System.out.println(dog);
        dog.feed(40);
        System.out.println(dog);

        FarmAnimal cow = new FarmAnimal("cow");
        System.out.println(cow);
        cow.beEaten();
        System.out.println(cow);

    }
}