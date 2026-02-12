class EmployeeProblem {
    String name;
    double salary;

    Employee(String n, double s) {
        name = n;
        salary = s;
    }

    void show() {
        System.out.println("Employee: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Ravi", 45000);
        e1.show();
    }
}
