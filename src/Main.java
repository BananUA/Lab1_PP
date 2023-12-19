import java.util.Scanner;

public class Main {
    // Функція для обчислення числа Люка за індексом
    public static int lucas(int n) {
        if (n == 0) {
            return 2;
        } else if (n == 1) {
            return 1;
        } else {
            return lucas(n - 1) + lucas(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел Люка (N): ");
        int N = scanner.nextInt();

        int sumOfSquares = 0;


        for (int i = 0; i < N; i++) {
            int lucasNumber = lucas(i);
            int square = lucasNumber * lucasNumber;
            sumOfSquares += square;
            System.out.println("Число Люка " + i + ": " + lucasNumber + ", його квадрат: " + square);
        }

        System.out.println("Сума квадратів перших " + N + " чисел Люка: " + sumOfSquares);


        scanner.close();
    }
}
