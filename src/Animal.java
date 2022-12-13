public class Animal {
    String species;
    String name;
    Double weight;
    Boolean alive;


    public Animal(String species) {
        this.species = species;
        this.weight = 170.0;
        this.alive = true;
    }

    public void feed() {
        this.weight += 0.5;
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
}
