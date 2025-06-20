import java.util.Scanner;

public class Fibonachi {

    public Fibonachi() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел Фибоначчи:");
        int n = scanner.nextInt();

        int[] fib = new int[n];

        System.out.println("Введите числа:");
        for (int i = 0; i < 2; i++) {
            System.out.print("Введите число" + " " + (i + 1) + ":");
            fib[i] = scanner.nextInt();
        }

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
}
