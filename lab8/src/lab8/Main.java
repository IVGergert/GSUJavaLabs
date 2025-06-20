package lab8;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Создаем список компьютеров
        List<Computer> computers = new ArrayList<>();
        computers.add(new Computer(3.5, 16, "NVIDIA RTX 3070"));
        computers.add(new Computer(4.0, 32, "AMD Radeon RX 6800"));
        computers.add(new Computer(2.5, 32, "Intel HD Graphics"));

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Computer.txt"))) {
            for (Computer computer : computers) {
                writer.write(computer.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("Computer.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("SortedComputers.txt"))) {

            String line;
            List<Computer> readComputers = new ArrayList<>();

            while ((line = reader.readLine()) != null) {
                readComputers.add(Computer.parseComputer(line));
            }

            readComputers.sort(Comparator.comparingDouble(Computer::getRam));

            for (Computer computer : readComputers) {
                writer.write(computer.toString());
                writer.newLine();
            }

            System.out.println("Данные успешно отсортированы и записаны в SortedComputers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}