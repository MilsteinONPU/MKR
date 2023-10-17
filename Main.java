import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        if (!inputScanner.hasNextDouble()) {
            System.out.println("Введене значення не є числом.");
        } else {
            double userInput = inputScanner.nextDouble();

            if (isFractional(userInput)) {
                System.out.println("Введене число є дробовим.");
            } else {
                long longValue = (long) userInput;

                if (longValue <= 0) {
                    System.out.println("Введене число не є натуральним.");
                } else {
                    long originalNumber = longValue;
                    long sum = 0;

                    while (longValue > 0) {
                        long digit = longValue % 10;
                        sum += digit;
                        longValue /= 10;
                    }

                    System.out.println("Сума цифр числа " + originalNumber + " дорівнює " + sum);
                }
            }
        }

        inputScanner.close();
    }

    public static boolean isFractional(double number) {
        // Перевірка, чи число має дробову частину
        return number % 1 != 0;
    }
}
