package creatures;

import device.Car;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Human {
    public Double cash;
    String name;
    String surname;
    Integer age;
    Double height;
    java.util.List<java.util.Map.Entry<LocalDateTime, Double>> dateMoney = new java.util.ArrayList<>();
    private Double salary;
    private Car[] garage;
    double carsValue;

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.garage = new Car[3];
    }

    public Human(int size) {
        this.garage = new Car[size];
    }

    @Override
    public String toString() {
        return "creatures.Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    //Zadanie 4
    public Double getSalary() {
        System.out.println(dateMoney);
        dateMoney.add(new java.util.AbstractMap.SimpleEntry<>(LocalDateTime.now(), salary));

        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException();
        }
        this.salary = salary;
        this.cash = salary;
        System.out.println("Salary increased by: " + salary + "\n Visit HR to sign contract amendment, " +
                "ZUS and tax office knows everything. You can run, but you can't hide");
    }

    //Zadanie 5
    public Car getCar(int space) {
        return this.garage[space];
    }

    public void setCar(int space, Car car) {
        this.garage[space] = car;
    }

    public double getValue() {
        for (int i = 0; i <= garage.length; i++) {
            carsValue += garage[i].value;
        }
        return carsValue;
    }
}
