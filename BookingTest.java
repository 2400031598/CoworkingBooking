
public class BookingTest {
    public static void main(String[] args) {
        int result = Booking.calculateCost(3, 200);

        if (result == 600) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test Failed");
        }
    }
}
