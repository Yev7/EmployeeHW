public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee();
        salariedEmployee.name();
        salariedEmployee.salary(60000);
        salariedEmployee.printPay();


        HourlyEmployee hourlyEmployee = new HourlyEmployee(25, 18);
        hourlyEmployee.name();
        hourlyEmployee.calculatePay();
        hourlyEmployee.printPay();

        Entrepreneur entrepreneur = new Entrepreneur();
        entrepreneur.name();
        entrepreneur.income(55000);


        Employee[] employees = {salariedEmployee, hourlyEmployee};
        printEachEmployeeBadge(employees);

    }
    public static void printEachEmployeeBadge(Employee[]employees){
        for(Employee e:employees){
            e.issueBadge();
        }
    }
}
