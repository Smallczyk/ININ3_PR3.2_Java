package creatures;

public abstract class Animal implements Feedable{
    String species;
    String name;
    public Double weight;
    Boolean alive;
    public Human owner;


    public Animal(String species) {
        this.species = species;
        this.weight = 170.0;
        this.alive = true;
    }

    @Override
    public String toString() {
        return "creatures.Animal{" +
                "species='" + species + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", alive=" + alive +
                '}';
    }

    public void feed() {
        this.weight += 0.5;
    }

    public void feed(int foodWeight) {
        if(foodWeight>0)
        this.weight += foodWeight;
    }



    public void takeForAWalk() {
        if (!this.alive) {
            System.out.println("nie bardzo");
        } else {
            this.weight -= 0.5;
            if (weight <= 0) {
                this.alive = false;
                System.out.println("niech cie pieruny łogniste siarczyste");

            }
        }
    }


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
