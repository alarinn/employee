import java.util.Date;

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee emp1 = new PartTimeEmployee(false, "Patrick Dezenzio", new Date(), 1, 25d);
        Employee emp2 = new FullTimeEmployee(true, "Michael Smith", new Date(), 2, 100000d);
        System.out.println("Part-time employee pay is: $" + emp1.calculatePay());
        System.out.println("Full-time employee pay is: $" + emp2.calculatePay());
    }
}
