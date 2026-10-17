
public class Booking {
    public static int calculateCost(int hours, int rate) {
        return hours * rate;
    }

    public static void main(String[] args) {
        System.out.println(calculateCost(3, 200));
    }
}
