
public class FullTimeEmp extends Employee {

    public FullTimeEmp() {
        super();
    }

    public double getPay() {
        double temp = 0;
        if (hours > 40) {
            temp += (hours - 40) * (rate * 2);
            temp += 40 * (rate * 2);
            totalPay += temp;
            return temp;
        } else {
            totalPay += hours*rate;
            return hours * rate;
        }
    }
}
