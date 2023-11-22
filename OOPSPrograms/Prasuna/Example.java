package OOPSPrograms.Prasuna;

public class Example {

    public void ShowEg() {
        System.out.println("PUBLIC - Showing the package class method.");
    }

    void ShowMethod() {
        System.out.println("DEFAULT - Showing methods only of the same package as it is declared default");
    }

    protected void showMethod1() {
        System.out.println("PROTECTED - Showing methods of the same class");
    }

    private void showMethod2() {
        System.out.println("PRIVATE -Showing method of the same class");
    }

    public static void main(String[] args) {
        Example e = new Example();
        e.showMethod2();

        // all these methods are cxalled in Prasanna package

    }
}
