package Nomor2;


public class Vehicle {
    void move() {
        System.out.println("Vehicle is moving");
        }
    }

    class Car extends Vehicle {
    @Override
    void move() {
    System.out.println("Car is moving");
    }
}
