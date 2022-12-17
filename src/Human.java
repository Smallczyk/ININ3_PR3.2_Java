import java.awt.*;

public class Human {
    String name;
    String surname;
    Integer age;
    Double height;
    private Double salary;
    private Car car;

    public Human(String name, String surname, Car car) {
        this.name = name;
        this.surname = surname;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    //Zadanie 4
    public Double getSalary() {
        //List StringList = new List();

        System.out.println(salary);
        return salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException();
        }
        this.salary = salary;
        System.out.println("Salary increased by: " + salary + "\n Visit HR to sign contract amendment, " +
                "ZUS and tax office knows everything. You can run, but you can't hide");
    }

    //Zadanie 5
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (car.value <= salary) {
            this.car = car;
            System.out.println(name + " bought a car");
        }else if (car.value/12 < salary){
            this.car = car;
            System.out.println(name + " bought on installments");
        }else System.out.println("ty biedaku nawet złota nie masz");
    }
}
