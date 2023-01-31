package device;

public abstract class Device {
    public String producer;
    public String model;
    public Integer yearOfProduction;
    public Double value;

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }

    public abstract void turnOn();
}
