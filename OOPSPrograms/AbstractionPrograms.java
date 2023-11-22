package OOPSPrograms;

//abstract class can have both abstract and non abstract methods
abstract class Vehicle {
    public void start() {
        System.out.println("Starting");
    }

    abstract public void getNoOfWheels();
}

class Car extends Vehicle {

    public void getNoOfWheels() {
        System.out.println("Car has 4 wheels");
    }
}

public class AbstractionPrograms {

    public static void main(String[] args) {
        // Vehicle v = new Vehicle();

        Car c = new Car();
        c.getNoOfWheels();
        c.start();
    }

}
