import java.util.Date;

public class PartTimeEmployee extends Employee {
    double rate;
    int hoursWorked = 1040;

    PartTimeEmployee (boolean isManager, String name, Date dateHired, int id, double rate) {
        super(isManager, name, dateHired, id, true);
        this.rate = rate;
    }

    /*
    Although calculating pay isn't different than full-time, it could be.  This method could change
    using a formula for part-time workers.
    rate * 1040 hours = Yearly pay based on the rate * the number of hours worked
     */
    @Override
    double calculatePay() {
        return this.rate * this.hoursWorked;
    }
}
