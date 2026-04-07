package Concepts;

class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private Engine engine; // Composition

    Car() {
        engine = new Engine(); // Car creates Engine (strong ownership)
    }

    void drive() {
        engine.start();
        System.out.println("Car is running");
    }
}

public class Composition {
    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
    }
}
