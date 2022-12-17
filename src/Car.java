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

    @Override
    public String toString() {
        return producer +" "+ model  +" "+ yearOfProduction +" "+ millage;
    }

    @Override
    public boolean equals (Object c){
        if (this == c){
            return true;
        }
    if (c == null || getClass() != c.getClass()){
        return false;
    }
        Car car = (Car) c;
        return producer == car.producer && model == car.model && yearOfProduction.equals(car.yearOfProduction);
    }

}
