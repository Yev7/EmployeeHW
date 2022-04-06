public class HourlyEmployee extends Employee implements IPayable{
    public HourlyEmployee(double hoursWorked, double hourlyRate){
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }
    private double hoursWorked;
    private double hourlyRate;

    @Override
    public void name() {
        super.name();
        System.out.println("Name of hourly employee is Louie");
    }

    @Override
    public void issueBadge() {
        super.issueBadge();
        System.out.println("Hello, my name is Louie");
    }

    @Override
    public void calculatePay() {
        System.out.println(this.hourlyRate*this.hoursWorked);
    }
    @Override
    public void printPay(){
        System.out.println("Hourly employee has one credit card.");
    }
}
