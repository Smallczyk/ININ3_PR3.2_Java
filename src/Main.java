public class Main {
    public static void main(String[] args) {

   /*     //Zadanie 1
        Animal zebra = new Animal("zebra");
//        zebra.name = "Albert";

        zebra.feed();
        System.out.println(zebra.weight);

        for (int i = 0; i < 344; i++) {
            zebra.takeForAWalk();
        }
        System.out.println(zebra.weight);
        System.out.println(zebra.alive);*/
/*

        Car passat = new Car("vw", "ipsum", 2022);
        passat.millage = 69420.0;

        //Zadanie 2
        Human seba = new Human("Sebastian", "Sebczyński", passat);

        System.out.println(passat.millage);
        System.out.println(passat.model);
        System.out.println(passat.yearOfProduction);
        System.out.println(passat.producer);

        Car fiat = new Car("Fiat", "multipla", 2090);
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
        Car passat2 = new Car("vw", "ipsum", 2022);
        passat.millage = 69420.0;

        System.out.println(passat.equals(passat2));
        System.out.println(passat);
        System.out.println(passat2);*/

        //Zadanie 7
     //   Phone phone = new Phone();
       // phone.turnOn();

        //Zadanie 8
        Car skoda = new Car("skoda", "fabia", 2009);
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
        System.out.println(makak.owner);

    }
}