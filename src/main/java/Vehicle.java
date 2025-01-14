public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    // 추상 메서드
    public abstract void move();
    public abstract void stop();
    public abstract void acceleration();
    public abstract void turn();

    // 일반 메서드
    public void displayName() {
        System.out.println("Vehicle name: " + name);
    }
}
