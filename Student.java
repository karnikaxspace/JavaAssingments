class Student {
    int id;
    String name;
    int age;

    // Default constructor
    Student() {
        this(101, "Naomi", 20);  // calling parameterized constructor
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
