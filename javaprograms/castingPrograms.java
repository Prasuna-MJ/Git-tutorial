public class castingPrograms {
    public static void main(String[] args) {
        double a = 118.89;
        double d = a + 9;// implicit conversion
        System.out.println(d);

        int s = 9;
        int g = s + (int) 8.9;// explicit conversion
        System.out.println(g);

        /*
         * constants are those whose values are fixed like pi, for which we have to
         * assign final keyword
         */

        final float PI = 3.14F;
        System.out.println(PI);

        int age = 1;
        age = 2;
        age = 3;
        System.out.println(age);

        /*
         * once u assign final keyword then u cant change the value otherwise u can
         * change
         */
    }
}
