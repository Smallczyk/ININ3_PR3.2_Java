import device.Device;

public class Phone extends Device {
    private int price;

    @Override
    public String toString() {
        return "Phone{" +
                "price=" + price +
                '}';
    }

    @Override
    public void turnOn() {

    }
}
