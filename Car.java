public class Car extends Vehicle implements Movable {
    public Car(String brand) {
        super(brand);
    }

    public void honk() {
        System.out.println(brand + " honk");
    }

    public void move() {
        System.out.println(brand + " is moving");
    }
}
