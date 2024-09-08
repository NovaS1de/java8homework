public class Main {

    public static void main(String[] args) {
        // Задание 1
        displayFormattedText();

        // Задание 2
        displayEvenNumbers(3, 10);

        // Задание 3
        drawLine(10, "horizontal", '*');
        drawLine(5, "vertical", '#');

        // Задание 4
        System.out.println("Max: " + findMax(5, 10, 15, 3));

        // Задание 5
        System.out.println("Sum: " + sumInRange(1, 5));

        // Задание 6
        System.out.println("Is prime: " + isPrime(17));

        // Задание 7
        System.out.println("Is lucky number: " + isLuckyNumber(123420));
    }

    // Задание 1
    public static void displayFormattedText() {
        System.out.println("Someone's sitting in the shade today because someone planted a tree a long time ago. - Warren Buffet");
    }

    // Задание 2
    public static void displayEvenNumbers(int start, int end) {
        System.out.print("Even numbers between " + start + " and " + end + ": ");
        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Задание 3
    public static void drawLine(int length, String direction, char symbol) {
        if (direction.equalsIgnoreCase("horizontal")) {
            for (int i = 0; i < length; i++) {
                System.out.print(symbol);
            }
            System.out.println();
        } else if (direction.equalsIgnoreCase("vertical")) {
            for (int i = 0; i < length; i++) {
                System.out.println(symbol);
            }
        } else {
            System.out.println("Invalid direction. Use 'horizontal' or 'vertical'.");
        }
    }

    // Задание 4
    public static int findMax(int a, int b, int c, int d) {
        return Math.max(Math.max(a, b), Math.max(c, d));
    }

    // Задание 5
    public static int sumInRange(int start, int end) {
        int sum = 0;
        for (int i = Math.min(start, end); i <= Math.max(start, end); i++) {
            sum += i;
        }
        return sum;
    }

    // Задание 6
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Задание 7
    public static boolean isLuckyNumber(int number) {
        if (number < 100000 || number > 999999) {
            throw new IllegalArgumentException("Number must be a six-digit number.");
        }

        int firstHalf = (number / 1000) % 10 + (number / 10000) % 10 + (number / 100000) % 10;
        int secondHalf = (number % 10) + (number / 10 % 10) + (number / 100 % 10);

        return firstHalf == secondHalf;
    }
}