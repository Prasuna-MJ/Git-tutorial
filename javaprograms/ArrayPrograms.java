import java.util.Arrays;
import java.util.Scanner;

public class ArrayPrograms {
    public static void main(String[] args) {
        // int age = 30;

        System.out.println("unsorted age.................................................");
        int[] marks = { 97, 90, 99 };
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("sorted age.................................................");
        Arrays.sort(marks);
        System.out.println(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        System.out.println("unsorted styudents rollnos.................................................");

        int[] students = new int[8];
        students[0] = 1239;
        students[1] = 1235;
        students[2] = 1238;
        students[3] = 1237;
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);

        }

        System.out.println("sorted students rollnos.................................................");
        Arrays.sort(students);
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("unsorted names.................................................");

        char[] names = { 'a', 'q', 'h', 's', 'b' };
        System.out.println(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("sorted names.................................................");

        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("2d array............................................");

        int[][] ages = { { 99, 98, 97 }, { 90, 99, 91 } };
        System.out.println(ages);
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(ages[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("2D array with sizes as input from user..............");
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the array size:");

        int arr[][] = new int[2][5];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Enter the " + (i + 1) + " and " + (j + 1) + "element in a 2 by 5 matrix");
                arr[i][j] = s.nextInt();

            }

            System.out.println(" ");
        }

        for (int i = 0; i < 2; i++) {
            // System.out.println("Elements of " + (i + 1) + "row");
            for (int j = 0; j < 5; j++) {
                System.out.print(arr[i][j] + " ");

            }

            System.out.println(" ");
        }

    }
}
