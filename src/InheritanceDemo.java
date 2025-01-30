import java.util.ArrayList;

public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Creating Worker objects
        workers.add(new Worker("John", "Doe", "001", "Mr.", 1985, 20.0));
        workers.add(new Worker("Jane", "Smith", "002", "Ms.", 1990, 22.5));
        workers.add(new Worker("Alex", "Johnson", "003", "Dr.", 1980, 25.0));

        // Creating SalaryWorker objects
        workers.add(new SalaryWorker("Emily", "Brown", "004", "Prof.", 1988, 52000));
        workers.add(new SalaryWorker("Michael", "Davis", "005", "Hon.", 1975, 65000));
        workers.add(new SalaryWorker("Sarah", "Wilson", "006", "Mrs.", 1992, 58000));

        // Simulating 3 weekly pay periods
        int[] hoursWorked = {40, 50, 40};

        for (int week = 0; week < 3; week++) {
            System.out.printf("\n--- Week %d ---\n", week + 1);
            for (Worker worker : workers) {
                worker.displayWeeklyPay(hoursWorked[week]);
            }
        }
    }
}
