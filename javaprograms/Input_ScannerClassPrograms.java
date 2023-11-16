import java.util.Scanner;

public class Input_ScannerClassPrograms {

    public static void main(String[] args) {

        // Input taking class -- scanner class

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter you age:");
            System.out.println("your age is : " + sc.nextInt());

            System.out.println("Enter ur name:");
            // String name = sc.next();
            System.out.println(sc.next());
            // System.out.println(sc.nextLine()); ...this is only working if there no new
            // line after this

            System.out.println("enter your graduation yr :");
            int yr = sc.nextInt();
            System.out.println(yr);
        }

        // System.out.println("name is " + sc.nextInt() + "name is " + sc.next() + "yr
        // is " + yr);

    }

}
