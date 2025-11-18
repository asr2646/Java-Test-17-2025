class Employee {
    private int id;
    private String name;
    private double salary;

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();

        // Using setters to set values
        emp.setId(1);
        emp.setName("John Doe");
        emp.setSalary(50000);

        // Using getters to print values
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
    }
}
