public class Main {
    public static void main(String[] args) {
        Car passat = new Car("vw", "ipsum", 2022);
        passat.millage = 69420.0;

        System.out.println(passat.millage);
        System.out.println(passat.model);
        System.out.println(passat.yearOfProduction);
        System.out.println(passat.producer);

        Car fiat = new Car("Fiat", "multipla", 2090);
        fiat.millage = 0.0;

        System.out.println("Model auta: " + fiat.model);
        System.out.println("Przebieg: " + fiat.millage);

        Animal zebra = new Animal("zebra");
        zebra.name = "Albert";

        zebra.feed();
        System.out.println(zebra.weight);

        for(int i = 0; i < 344; i++){
            zebra.takeForAWalk();
        }
        System.out.println(zebra.weight);
        System.out.println(zebra.alive);
    }
}