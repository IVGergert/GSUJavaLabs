package lab9;

public class CalculatorThread extends Thread {
    private final int start;
    private final int end;
    private long result;

    public CalculatorThread(int start, int end) {
        this.start = start;
        this.end = end;
        this.result = 1;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result *= i;
            }
        }
    }

    public long getResult() {
        return result;
    }
}