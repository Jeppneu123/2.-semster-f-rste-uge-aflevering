public class Employee {
    String firstName;
    String lastName;
    double salary;

    public Employee (String firstName, String lastName, double salary){
        this.firstName = firstName;
        this.lastName = lastName;
        if (salary > 0) {
            this.salary = salary;
        } else {
            this.salary = 0.0;
        }
    }

    public double getYearlySalary (){
        return salary * 12;
    }

    public void salaryRaise (){
        salary *= 1.10;
    }
}
