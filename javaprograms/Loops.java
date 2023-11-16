import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        // printing 1 to 100
        System.out.println("for loop exapmles..........");
        for (int i = 1; i <= 100; i++)
            System.out.println(i);

        for (int i = 100; i >= 1; i--)
            System.out.println(i);

        System.out.println("while loop examples..........");
        int i = 200;
        while (i >= 180) {
            System.out.println(i);
            i = i - 1;
        }

        int j = 2;
        while (j <= 20) {
            System.out.println(j);
            j++;
        }
        System.out.println("do while loop...........");

        // do while loop...
        System.out.println("do while loop : do first then check for condition........");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k <= 20);

        try (Scanner sc = new Scanner(System.in)) {
            int num = 0;
            do {
                System.out.println("Enter a positive number to printing:");
                num = sc.nextInt();
                System.out.println("The number is:" + num);

            } while (num >= 0);
        }
        System.out.println("Negative number and hence ended....");

    }
}
