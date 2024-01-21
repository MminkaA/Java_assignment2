class Employee extends Person {
    private String position;
    private double salary;

    public Employee() {
        super();
    }

    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return "Employee";
    }


    public double getPaymentAmount() {
        return salary;
    }


    public String toString() {
        return String.format("Employee: %s", super.toString());
    }
}
