import java.util.Scanner;

public class Factorial {

    public Factorial(){

        long factorial = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число:");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }

        System.out.print("Факториал числа" + " " + number + " " + "равен:" + factorial);
    }
}
