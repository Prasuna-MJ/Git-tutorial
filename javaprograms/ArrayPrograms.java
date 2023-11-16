import java.util.Arrays;

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
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("sorted names.................................................");

        Arrays.sort(names);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("2d array");
        int[][] ages = { { 99, 98, 97 }, { 90, 99, 91 } };
        for (int i = 0; i < ages.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(ages[i][j]);
            }
        }

    }
}
