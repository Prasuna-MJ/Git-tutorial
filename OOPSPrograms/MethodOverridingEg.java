package OOPSPrograms;

class Vehicle {

    public void display() {
        System.out.println("Starting vehicle class");
    }
}

class Car extends Vehicle {

    public void display() {
        System.out.println("Staring car class ");
    }
}

public class MethodOverridingEg {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.display();

    }

}
