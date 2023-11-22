package OOPSPrograms;

public class MethodOverloading {
    static void show(int a) {
        System.out.println("INT method is showing " + a);

    }

    static void show(char a) {
        System.out.println("Character is showing " + a);
    }

    public static void main(String[] args) {
        // MethodOverloading m = new MethodOverloading();
        show(9);
        show('a');

    }
}
