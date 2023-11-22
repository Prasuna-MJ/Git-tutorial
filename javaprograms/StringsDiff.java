public class StringsDiff {
    public static void main(String[] args) {
        String s = "Prasuna";
        String sDup = s;
        String s1Dup = s;
        String s2Dup = s;

        s = "PRAsuna";

        System.out.println(s);
        System.out.println(sDup);
        System.out.println(s1Dup);
        System.out.println(s2Dup);

        String s2 = new String("Prasuna");
        String s3 = new String("Prasuna");

        s2 = "PRASUNA";
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(
                "1st method is string literals:memory stored in string pool in stack memory and 2nd one is object creation :memory stored in heap memory. In these 2 methods we mean 1st method only as strings and they are immutable and cant be changed. whereas in 2nd method these can be changed.");

        System.out.println("....................");
        System.out.println(
                "There aRE 3 classes for storing sequence of characters in java: they are string; stringbufer; string builder .In these strings cant be modified which means they are immutable i.e once created it is there forever and u cant erase it from memory whereas string buffer and string builder can be modified");
        System.out.println("Stringbuffer can support multithreading and stringbuilder doesnt multithreading");

        System.out.println(s.equals(s1Dup));
        System.out.println(s == s1Dup);

        System.out.println(s1Dup.equals(sDup));
        System.out.println(s1Dup == sDup);

        System.out.println(sDup.equals(s3));
        System.out.println(sDup == s3);
        System.out.println(
                ".equals compares the content inside and == operator compares the addresses or the references pointing it");

        System.out.println(sDup.compareTo(s3));
        System.out.println(sDup.compareTo(s1Dup));

    }

}
