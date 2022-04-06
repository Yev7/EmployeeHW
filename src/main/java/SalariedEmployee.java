public class SalariedEmployee extends Employee{


    public void salary(double salary) {
        System.out.println(salary);

    }

    @Override
    public void name() {
        super.name();
        System.out.println("Name of salaried employee is Jeff");
    }

    @Override
    public void issueBadge() {
        super.issueBadge();
        System.out.println("Hello, my name is Jeff");
    }
    @Override
    public void printPay(){
        System.out.println("Salaried employee has 4 credit cards.");
    }
}
