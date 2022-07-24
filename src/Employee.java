import java.util.Date;

public abstract class Employee {
    String name;
    Date dateHired;
    int id;
    boolean managerFlag;
    boolean partTimeFlag;

    Employee(boolean managerFlag, String name, Date dateHired, int id, boolean partTimeFlag) {
        this.managerFlag = managerFlag;
        this.name = name;
        this.dateHired = dateHired;
        this.id = id;
        this.partTimeFlag = partTimeFlag;
    }

    abstract double calculatePay();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPartTimeFlag() {
        return partTimeFlag;
    }

    public void setPartTimeFlag(boolean partTimeFlag) {
        this.partTimeFlag = partTimeFlag;
    }

    public Date getDateHired() {
        return dateHired;
    }

    public void setDateHired(Date dateHired) {
        this.dateHired = dateHired;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isManagerFlag() {
        return managerFlag;
    }

    public void setManagerFlag(boolean managerFlag) {
        this.managerFlag = managerFlag;
    }
}
