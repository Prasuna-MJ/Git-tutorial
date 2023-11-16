import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        /*
         * Arithmetic
         * Assignment
         * logical
         * bitwise
         */

        // Arithmetic
        double a1 = 2;
        double b1 = 3;
        double c = a1 / b1;
        double d = a1 % b1;

        System.out.println(c);
        System.out.println(d);

        int e = 2;
        int f = 3;
        int g = e / f;
        int h = e % f;

        System.out.println(g);
        System.out.println(h);
        System.out.println(e * f);
        System.out.println(e + f);
        System.out.println(e - f);

        System.out.println(".........................................");
        System.out.println("Assignment operator............");

        System.out.println("Assigning the values to the variables is called assignment opr.");
        System.out.println("a=2");

        System.out.println(".............................................");
        System.out.println("Unary operator");
        System.out.println("no need of two variables can be done with one variable");

        int num = 1;
        System.out.println("Increment opeartor:...........num = num +1 can be witten as num++...");
        System.out.println("first the number is assigned then added");

        System.out.println(num++);
        System.out.println(num);

        System.out.println("first the number is added then assigned");

        System.out.println(++num);
        System.out.println(num);
        System.out.println("same for decrement operator as well......................");
        System.out.println(num--);
        System.out.println(num);

        System.out.println(--num);
        System.out.println(num);

        // Maths class
        System.out.println("Maths class.................................");
        System.out.println(Math.max(2, 6));
        System.out.println(Math.min(2, 6));

        System.out.println(
                "random fn gives random values between 0.0 to 1.0 of double type so to convert in to int type cast to int ");
        System.out.println(Math.random());

        System.out.println((int) (Math.random() * 100));

        System.out.println("Comparision operators.......................................");
        System.out.println("== is equals ");
        System.out.println("!= not equals");
        System.out.println(">  greater than");
        System.out.println("<  lesser than");
        System.out.println(">= greater than or equal to");
        System.out.println("<=  lesser than or equal to");

        // LOGICAL OPERATORS.........................................
        System.out.println("Logical operators....................................");
        System.out.println("&& -- and, || -- or ");
        int a = 70;
        int b = 30;

        if (a > 50 && b < 20)
            System.out.println("valid");
        else
            System.out.println("invalid");
        if (a < 50 || b < 20)
            System.out.println("valid");
        else
            System.out.println("invalid");

        System.out.println("Logical operators...................");

        boolean isAdult = false;
        System.out.println("even if we dont write isAdult == true it will check for true condition by default ie 0");
        if (isAdult)
            System.out.println("adult"); // same as below if condition

        if (isAdult == true)
            System.out.println("is Adult");
        else
            System.out.println("not adult");

        if (!isAdult)
            System.out.println("not adult");

        // using if, else if, if for checking mre than 2 conditions
        System.out.println("using if, else if, if for checking mre than 2 conditions");

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

    }
}
