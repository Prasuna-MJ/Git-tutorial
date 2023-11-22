package OOPSPrograms;

class Vehicle {
    int nowheels;
    String color;
    String seat;

    public void StartVehicle() {
        System.out.println("Starting the vehicle");
    }

    public void StopVehicle() {
        System.out.println("Stopping the vehicle");
    }

    public void applyBrake() {
        System.out.println("Applying the brake");
    }
}

class Car extends Vehicle {
    String brand;
    int mileage;

    public void applyHorn() {
        System.out.println("Applying the horn");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Car breeza = new Car();
        breeza.brand = "maruti suzuki";
        System.out.println(breeza.brand);
        breeza.color = "red";
        System.out.println(breeza.color);
        breeza.mileage = 20;
        System.out.println(breeza.mileage);
        breeza.nowheels = 4;
        System.out.println(breeza.nowheels);
        breeza.seat = "spongefoam";
        System.out.println(breeza.seat);
        breeza.StartVehicle();
        breeza.StopVehicle();
        breeza.applyBrake();
        breeza.applyHorn();
    }

}
