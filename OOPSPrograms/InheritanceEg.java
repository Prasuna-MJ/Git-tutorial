package OOPSPrograms;

class Base {

    public void show() {
        System.out.println("Base class method");
    }
}

class Derived extends Base {

    public void show() {
        System.out.println("Derived class method");
    }
}

public class InheritanceEg {

    public static void main(String[] args) {
        Base b = new Derived();
        b.show();
        Derived d = new Derived();
        d.show();
        Base b1 = new Base();
        b1.show();
    }

}
