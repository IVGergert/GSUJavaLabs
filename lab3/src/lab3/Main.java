package lab3;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Меню: ");
            System.out.println("1. Добавить треугольник");
            System.out.println("2. Добавить прямоугольник");
            System.out.println("3. Добавить окружность");
            System.out.println("4. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    addTriangle(scanner);
                    break;
                case 2:
                    addRectangle(scanner);
                    break;
                case 3:
                    addCircle(scanner);
                    break;
                case 4:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите действие из меню.");
            }
        }
    }

    private static void addTriangle(Scanner scanner) {
        System.out.print("Введите координаты центра (x y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();

        System.out.print("Введите стороны треугольника (side1 side2 side3): ");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Введите тип треугольника: ");
        String type = scanner.nextLine();
        Triangle triangle = new Triangle(x, y, side1, side2, side3, type);
        triangle.printInfo();
    }

    private static void addRectangle(Scanner scanner){
        System.out.print("Введите координаты центра (x, y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.print("Введите ширину и высоту прямоугольника: ");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(x, y, width, height);
        rectangle.printInfo();
    }

    private static void addCircle(Scanner scanner) {
        System.out.print("Введите координаты центра (x, y): ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        System.out.print("Введите радиус окружности: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(x, y, radius);
        circle.printInfo();
    }
}