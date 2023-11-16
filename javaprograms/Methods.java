public class Methods {

    public static void main(String[] args) {

        Methods s = new Methods();
        s.addNum(12, 05);
        printName("prasu");
        s.subNum(52, 12);

    }

    public static void printName(String name) {
        System.out.println(name);
    }

    public static void addNum(int a, int b) {
        int c = a + b;
        System.out.println(c);

    }

    public static int subNum(int q, int w) {
        int z = q - w;
        System.out.println(z);
        return z;

    }
}
