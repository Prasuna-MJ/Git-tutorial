import java.util.Scanner;

public class Conditional_Statements {
    public static void main(String[] args) {

        System.out.println("Conditional operators....................................");

        boolean isSunUp = false;
        if (isSunUp == true)
            System.out.println("day");
        else
            System.out.println("night");

        int age = 16;
        if (age > 18)
            System.out.println("Can vote");
        else if (age < 18 && age > 0)
            System.out.println("Cant vote");
        else
            System.out.println("enter valid age");

        // using if, else if, if for checking mre than 2 conditions
        System.out.println("using if, else if, if for checking mre than 2 conditions");
        System.out.println("Enter a integer value ranging 0 to 100 and above for testing");

        try (Scanner sc = new Scanner(System.in)) {
            int cash = sc.nextInt();
            if (cash < 10) {
                System.out.println("cant buy anything");
                System.out.println("get more cash");
            } else if (cash > 10 && cash < 100)
                System.out.println("can buy uo to 10 chocolates costing 10 rs each");
            else
                System.out.println("can buy anything");
        }

        // Switch
        // statements....................................................................
        System.out.println("Switch statements...........................");
        System.out.println(
                "In switch statements if case 1 is matched and if we dont write break keyword then all the cases statements will also be printed.......");

        int day = 7;

        switch (day) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesdaty");
                break;
            default:
                System.out.println("wed - sun");
        }

    }
}
