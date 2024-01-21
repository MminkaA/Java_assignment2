class Student extends Person {
    private double gpa;
    private static final double STIPEND_AMOUNT = 41898.00;

    public Student() {
        super();
    }

    public Student(String name, String surname, double gpa) {
        super(name, surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getPosition() {
        return "Student";
    }


    public double getPaymentAmount() {
        return (gpa > 2.67) ? STIPEND_AMOUNT : 0.00;
    }


    public String toString() {
        return String.format("Student: %s", super.toString());
    }
}
