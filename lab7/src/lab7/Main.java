package lab7;

import Exceptions.InvalidFieldValueException;
import Exceptions.StudentNotFoundException;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    private static final String FILENAME = "students.dat";

    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<Student> students = loadStudents();

            while (true) {
                System.out.println("\nМеню:");
                System.out.println("1. Добавить студента");
                System.out.println("2. Удалить студента");
                System.out.println("3. Показать всех студентов");
                System.out.println("4. Подсчитать средний возраст студентов");
                System.out.println("5. Подсчитать количество студентов с задолженностями");
                System.out.println("6. Выйти");
                System.out.print("Выберите действие: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        students = addStudent(scanner, students);
                        saveStudents(students);
                        break;
                    case 2:
                        students = removeStudent(scanner, students);
                        saveStudents(students);
                        break;
                    case 3:
                        showAllStudents(students);
                        break;
                    case 4:
                        calculateAverageAge(students);
                        break;
                    case 5:
                        countStudentsWithArrears(students);
                        break;
                    case 6:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка ввода/вывода: " + e.getMessage());
        } catch (InvalidFieldValueException e) {
            System.err.println("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Неизвестная ошибка: " + e.getMessage());
        }
    }


    private static List<Student> loadStudents() throws IOException,ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILENAME))) {
            return (List<Student>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new ArrayList<>();
    }

    private static void saveStudents(List<Student> students) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            oos.writeObject(students);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Student> addStudent(Scanner scanner, List<Student> students) throws InvalidFieldValueException {
        System.out.print("Введите фамилию студента: ");
        String lastName = scanner.nextLine();
        System.out.print("Введите возраст студента(сколько лет): ");
        int age = scanner.nextInt();
        if (age < 0 || age > 150) {
            throw new InvalidFieldValueException("Возраст не может быть отрицательным и более 150 лет.");
        }
        System.out.print("Есть ли задолженности? (да/нет): ");
        boolean arrears = scanner.nextLine().equalsIgnoreCase("да");
        scanner.nextLine();

        Student newStudent = new Student(lastName, age, arrears);
        students.add(newStudent);

        System.out.println("Студент добавлен.");
        return students;
    }

    private static List<Student> removeStudent(Scanner scanner, List<Student> students) throws StudentNotFoundException {
        System.out.print("Введите фамилию студента для удаления: ");
        String lastName = scanner.nextLine();

        boolean removed = students.removeIf(student -> student.getLastName().equalsIgnoreCase(lastName));

        if (!removed){
            throw new StudentNotFoundException("Студент с фамилией " + lastName + " не найден.");
        }

        System.out.println("Студент удален.");
        return students;
    }

    private static void showAllStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void calculateAverageAge(List<Student> students) {
        int averageAge = (int) Student.calculateAverageAge(students);
        System.out.println("Средний возраст студентов: " + averageAge);
    }

    private static void countStudentsWithArrears(List<Student> students) {
        long arrearsCount = Student.countStudentsWithArrears(students);
        System.out.println("Количество студентов с задолженностями: " + arrearsCount);
    }
}