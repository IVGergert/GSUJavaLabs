package lab9;

public class ThreadGenerator {
    private int threadCount;
    private int a;
    private long finalResult = 1;

    public ThreadGenerator(int threadCount, int a) {
        this.threadCount = threadCount;
        this.a = a;
    }

    public void execute() {
        CalculatorThread[] threads = new CalculatorThread[threadCount];
        int chunkSize = a / threadCount;
        int start = 1;

        for (int i = 0; i < threadCount; i++) {
            int end = start + chunkSize - 1;
            if (i == threadCount - 1) {
                end = a;
            }

            threads[i] = new CalculatorThread(start, end);
            threads[i].start();
            start = end + 1;
        }

        try {
            for (CalculatorThread thread : threads) {
                thread.join();
                finalResult *= thread.getResult();
            }
        } catch (InterruptedException e) {
            System.out.println("Ошибка: потоки были прерваны");
        }
    }

    public long getResult() {
        return finalResult;
    }
}
