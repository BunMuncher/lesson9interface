
public abstract class Employee {

    protected String name;
    protected double rate;
    protected int hours;
    protected static double totalPay = 0;
    static double lowRate = 7.75;
    static double highRate = 30.5, lowHours = 1, highHours = 60;

    public Employee() {
        name = "";
        rate = 0;
    }

    public static String getNameRules() {
        return "must be nonblank";
    }

    public static String getRateRules() {
        return "must be between 6.75 and 30.50, inclusive";
    }

    public static String getHoursRules() {
        return "must be between 1 and 60, inclusive";
    }
    public static double getTotalPay(){
        return totalPay;
    }

    public boolean setName(String nm) {
        if (nm.equals("")) {
            return false;
        } else {
            name = nm;
            return true;
        }
    }

    public boolean setRate(double rt) {
        if (rt < 6.75 || rt > 30.50) {
            return false;
        } else {
            rate = rt;
            return true;
        }
    }

    public boolean setHours(int hrs) {
        if (hrs < 1 || hrs > 60) {
            return false;
        } else {
            hours = hrs;
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public abstract double getPay();
}
