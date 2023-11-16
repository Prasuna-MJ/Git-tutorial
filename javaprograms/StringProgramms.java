public class StringProgramms {
    public static void main(String[] args) {

        String name = "Prasu";
        System.out.println(name);
        System.out.println(name.length());

        String s1 = "Prasuna";
        System.out.println(s1);
        System.out.println(s1.length());

        System.out.println(name + s1);
        System.out.println(name);// two strings are concatenated using + operator

        System.out.println(name.concat(s1));
        System.out.println(name.length());

        String newname = name + s1;
        System.out.println(newname);
        System.out.println(newname.length());

        for (int i = 0; i < newname.length(); i++) {
            char aa = newname.charAt(i); // method for iterating a string and printing the values
            System.out.print(i + "-");
            System.out.println(aa);

            System.out.println(i + newname.charAt(i) + " ascii value");
            System.out.println("find out how to concat a integer with a char value");
            System.out.println(i + aa);
            // when concatenated a integer with a character the ascii value is printed
        }

        String replaceName = name.replace('u', 'o');// replace a single char
        System.out.println(replaceName);

        String hello = "Hey u r beautiful";// substrings begin with the index u need and end with 1 extra
        System.out.println(hello.substring(4, 8));
    }

}
