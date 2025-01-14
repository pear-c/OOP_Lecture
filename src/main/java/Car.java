public class Car extends Vehicle {
    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Car is moving.");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped.");
    }

    @Override
    public void turn() {
        System.out.println("Car is turning.");
    }

    @Override
    public void acceleration() {
        System.out.println("Car is accelerating");
    }
}
