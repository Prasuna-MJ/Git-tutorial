package OOPSPrograms.MethodOverriding;

class superclass {
    private void m1() {
        System.out.println("Super classprivate method");
    }

    protected void m2() {
        System.out.println("super class m2 method");
        m1();
    }
}

class subclass extends superclass {
    private void m1() {
        System.out.println("subclass m1 private method");
    }

    // @Override
    public void m2() {
        System.out.println("subclass m2 method");
        m1();
    }
}

public class Eg2 {
    public static void main(String[] args) {
        superclass a = new superclass();
        a.m2();
        subclass c = new subclass();
        c.m2();
    }

}
