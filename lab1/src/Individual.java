import java.util.Scanner;

public class Individual {

    public Individual() {

        Scanner scan = new Scanner(System.in);
        int[] mass = new int[3];
        System.out.println("Введите 3 числа");

        int maxNumber;
        int i;
        for (maxNumber = 0; maxNumber < mass.length; ++maxNumber) {
            System.out.print("Введите число " + (maxNumber + 1) + ": ");
            i = scan.nextInt();
            mass[maxNumber] = i;
        }

        System.out.print("Весь массив чисел:");

        for (maxNumber = 0; maxNumber < mass.length; ++maxNumber) {
            System.out.print(" " + mass[maxNumber]);
        }

        maxNumber = mass[0];

        for (i = 0; i < mass.length; ++i) {
            if (mass[i] > maxNumber) {
                maxNumber = mass[i];
            }
        }

        System.out.println("\nМаксмальное число в массиве:" + maxNumber);
    }
}
