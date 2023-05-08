package homework;

public class Main {
    public static void main(String[] args) {
        PrintShape printShape = new PrintShape();

        printShape.printNameShape(new Circle());
        printShape.printNameShape(new Rhomb());
        printShape.printNameShape(new Triangle());
        printShape.printNameShape(new Square());
        printShape.printNameShape(new Quad());

    }
}
