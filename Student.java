class Student {
    String name;
    int rollNo;
    String section;

    // Constructor
    Student(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Method to print details
    void display() {
        System.out.println("Student: " + name + ", Roll No: " + rollNo + ", Section: " + section);
    }
}

class Main {
    public static void main(String[] args) {
        // Creating object
        Student s1 = new Student("Bob", 101, "A");

        // Printing details
        s1.display();
    }
}
