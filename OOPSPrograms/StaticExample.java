package OOPSPrograms;

class Person {
    static String cityName;
    public String name;
}

public class StaticExample {
    public static void main(String[] args) {
        System.out.println("Hi");

        Person.cityName = "Delhi";
        Person p1 = new Person();
        Person p2 = new Person();

        p1.name = "Ram";
        p2.name = "Bheem";

        Person.cityName = "Delhi";

        System.out.println(p1.name + " lives in " + " Person.cityName");
        System.out.println(p2.name + " lives in " + "Person.cityName");

    }
}
