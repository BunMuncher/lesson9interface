
public class PartTimeEmp extends Employee {

    public PartTimeEmp() {
        super();
    }

    public double getPay() {
        totalPay+= hours*rate;
        return hours * rate;
    }
}
