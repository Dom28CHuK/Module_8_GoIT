package examples;

public class Universal implements Flyable, Swimable {
    @Override
    public void fly() {
        System.out.println("Fly");
    }

    @Override
    public void swim() {
        System.out.println("Swim");
    }
}
