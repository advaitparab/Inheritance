import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WorkerTest {
    @Test
    public void testCalculateWeeklyPay() {
        Worker worker = new Worker("John", "Doe", "001", "Mr.", 1985, 20.0);
        assertEquals(800, worker.calculateWeeklyPay(40));  // Regular pay
        assertEquals(1100, worker.calculateWeeklyPay(50)); // Overtime pay
    }
}

