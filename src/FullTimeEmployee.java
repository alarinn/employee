import java.util.Date;

public class FullTimeEmployee extends Employee {
    double salary;

    FullTimeEmployee(boolean isManager, String name, Date dateHired, int id, double salary) {
        super(isManager, name, dateHired, id, false);
        this.salary = salary;
    }

    @Override
    double calculatePay() {
        return salary;
    }
}
