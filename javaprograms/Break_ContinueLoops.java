public class Break_ContinueLoops {
    public static void main(String[] args) {
        // Break and continue

        // without break only using while statement
        int a = 0;
        while (a <= 5) {
            System.out.println(a);
            a++;

        }

        System.out.println(".................................");
        // while using break printing same output

        int b = 0;
        while (true) {
            System.out.println(b);
            b++;
            if (b > 5) {
                break;
            }
        }

        System.out.println(".................................");
        // using continue for not printing a number in the order and also using break

        int c = 0;
        while (true) {
            if (c == 3) {
                c++;
                continue;
            }
            System.out.println(c);
            c++;
            if (c > 5) {
                break;
            }
        }
        System.out.println(".................................");
        // using while without break and only using continue
        int d = 0;
        while (d <= 5) {
            if (d == 3) {
                d++;
                continue;
            }
            System.out.println(d);
            d++;

        }

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            if (i == 2) {
                break;
            }
            i++;
        }

        int a1 = 0;
        while (a1 < 5) {
            System.out.println(a1);
            a1++;
            if (a1 == 2) {
                break;
            }

        }
        int g = 0;
        while (g < 10) {
            System.out.println(g);
            g++;
            if (g == 5) {
                g++;
                continue;
            }

        }

        int g1 = 0;
        while (g1 < 10) {

            if (g1 == 5) {
                g1++;
                continue;
            }

            System.out.println(g1);
            g1++;

        }

    }
}
