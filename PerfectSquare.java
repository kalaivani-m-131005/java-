public class Main {
    public static void main(String[] args) {
        int number = 25; // Change this to test other numbers

        // 1. Get the square root
        double sqrt = Math.sqrt(number);

        // 2. Cast to int to remove decimals (e.g., 5.0 becomes 5)
        int root = (int) sqrt;

        // 3. Check if multiplying it by itself gives the original number
        if (root * root == number) {
            System.out.println(number + " is a perfect square!");
        } else {
            System.out.println(number + " is NOT a perfect square.");
        }
    }
}
