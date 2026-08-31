public class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    public void honk() {
        System.out.println(brand + "honks");
    }
}
