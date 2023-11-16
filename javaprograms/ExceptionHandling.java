public class ExceptionHandling {

    public static void main(String[] args) {
        // try catch///

        int[] marks = { 98, 100, 98 };
        try {
            System.out.println(marks[9]);
        } catch (Exception e) {
            System.out.println("caugth an exception");

        }
        System.out.println(marks[1]);
    }
}
