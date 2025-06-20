import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("1) 1.1");
        System.out.println("2) 1.2");
        System.out.println("3) 1.3");
        System.out.println("4) 1.4");
        System.out.println("5) Индивидуальное");
        System.out.print("Выбирите часть задания:");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                FuzzBuzz fuzzBuzz = new FuzzBuzz();
                break;

            case 2:
                make_install makeInstall = new make_install();
                break;
            case 3:
                Fibonachi fibonachi = new Fibonachi();
                break;
            case 4:
                Factorial factorial = new Factorial();
                break;
            case 5:
                Individual individual = new Individual();
                break;
        }
    }
}