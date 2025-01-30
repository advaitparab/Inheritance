public class SalaryWorker extends Worker {
    private double annualSalary;

    public SalaryWorker(String firstName, String lastName, String ID, String title, int YOB, double annualSalary) {
        super(firstName, lastName, ID, title, YOB, annualSalary / 2080);
        this.annualSalary = annualSalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    @Override
    public void displayWeeklyPay(double hoursWorked) {
        System.out.printf("%s %s - Weekly Salary: $%.2f%n", firstName, lastName, calculateWeeklyPay(hoursWorked));
    }

    @Override
    public String toCSV() {
        return super.toCSV() + "," + annualSalary;
    }

    @Override
    public String toXML() {
        return super.toXML().replace("</Person>", "<AnnualSalary>" + annualSalary + "</AnnualSalary></Person>");
    }

    @Override
    public String toJSON() {
        return super.toJSON().replace("}", ", \"AnnualSalary\": " + annualSalary + " }");
    }
}
