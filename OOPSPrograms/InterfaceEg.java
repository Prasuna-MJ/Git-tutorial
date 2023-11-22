package OOPSPrograms;

// all fields are public, static, final interfaces by default

// all methods are public and abstract in interfaces by default 
// interfaces support multiple inheritance 

interface Person {
    void talk();
}

class Student implements Person {
    public void talk() {
        System.out.println("Person is talking");
    }
}

public class InterfaceEg {
    public static void main(String[] args) {
        Student s = new Student();
        s.talk();
    }
}
