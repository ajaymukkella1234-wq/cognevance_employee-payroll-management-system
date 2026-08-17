// Main.java
public class Main {
    public static void main(String[] args) {
        DatabaseConnection db = new DatabaseConnection();
        db.connect();

        Employee employee = new Employee(1, "Ajay", 50000);

        Payroll payroll = new Payroll();
        payroll.generateSalary(employee);
    }
}
