package examples;

public class Amphibian  implements UniversalTransport {
    @Override
    public void fly() {
        System.out.println(getName() + " fly");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " swim");
    }

    @Override
    public String getName() {
        return "Amphibian";
    }
}
