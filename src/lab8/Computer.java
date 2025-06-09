package lab8;

public class Computer {
    private double cpuFrequency;
    private int ram;
    private String gpu;
    private double performance;

    public Computer(double cpuFrequency, int ram, String gpu) {
        this.cpuFrequency = cpuFrequency;
        this.ram = ram;
        this.gpu = gpu;
        this.performance = calculatePerformance();
    }

    public double getPerformance() {
        return performance;
    }

    public double getCpuFrequency() {
        return cpuFrequency;
    }

    public int getRam() {
        return ram;
    }

    public String getGpu() {
        return gpu;
    }

    public double calculatePerformance() {
        return cpuFrequency * ram * 1.5;
    }

    public static Computer parseComputer(String line) {
        String[] parts = line.split(", ");
        double cpuSpeed = Double.parseDouble(parts[0].split("= ")[1].replace(" GHz", ""));
        int ram = Integer.parseInt(parts[1].split("= ")[1].replace(" GB", ""));
        String gpu = parts[2].split("= ")[1];
        return new Computer(cpuSpeed, ram, gpu);
    }

    @Override
    public String toString() {
        return "Компьютер: " +
                "Частота процессора = " + cpuFrequency + " GHz" +
                ", Оперативная память = " + ram +  " GB" +
                ", Видеокарта = " + gpu +
                ", Производительность = " + calculatePerformance();
    }
}
