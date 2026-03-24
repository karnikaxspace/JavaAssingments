class Student {

    int id;
    String name;

    // Default constructor
    Student() {
        this(101);   // calls parameterized constructor
        System.out.println("Default constructor");
    }

    // Constructor with one parameter
    Student(int id) {
        this(id, "Karnika");   // calls another constructor
        System.out.println("Constructor with id");
    }

    // Constructor with two parameters
    Student(int id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("Constructor with id and name");
    }
}

public class Main {
    public static void main(String[] args) {
        Student s = new Student();
    }
}