package lab9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите количество потоков: ");
        int threadCount = scanner.nextInt();

        ThreadGenerator generator = new ThreadGenerator(threadCount, a);
        generator.execute();

        System.out.println("Произведение четных чисел: " + generator.getResult());
    }
}