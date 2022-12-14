public class Car {
    String producer;
    String model;
    Integer yearOfProduction;
    Double millage;
    Double value;

    public Car(String producer, String model, Integer yearOfProduction) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.millage = 0.0;
    }
}
