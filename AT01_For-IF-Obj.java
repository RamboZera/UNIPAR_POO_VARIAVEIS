public class At1 {
    public static void main(String[] args) {
        for (int y = 1; y <= 50; y++) {
            if (y % 3 == 0 && y % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (y % 3 == 0) {
                System.out.println("Fizz");
            } else if (y % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(y);
            }
        }
    }
}
