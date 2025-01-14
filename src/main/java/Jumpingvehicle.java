public class Jumpingvehicle extends Vehicle implements Jumpable {
    public Jumpingvehicle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Jumping vehicle is moving.");
    }

    @Override
    public void stop() {
        System.out.println("Jumping vehicle has stopped.");
    }

    @Override
    public void turn() {
        System.out.println("Jumping vehicle is turning.");
    }

    @Override
    public void acceleration() {
        System.out.println("Jumping vehicle is accelerating!");
    }

    @Override
    public void jumping() {
        System.out.println("Jumping vehicle is jumping.");
    }
}
