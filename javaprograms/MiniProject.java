import java.util.Scanner;

public class MiniProject {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int a = 0;
            int b = (int) (Math.random() * 100);

            do {
                System.out.println("Guess a number between 1 and 100");
                a = sc.nextInt();
                if (a == b) {
                    System.out.println("Wohoo correct number!!!!");
                    break;
                } else if (a > b) {
                    System.out.println("Number too large");
                } else
                    System.out.println("Number too small");
            } while (a >= 0);

            System.out.println("Number is :" + b);
        }

    }
}
