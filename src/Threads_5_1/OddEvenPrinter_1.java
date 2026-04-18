package Threads_5_1;

public class OddEvenPrinter_1 {
    private final int start;
    private final int end;
    private int current;
    private final Object lock = new Object();

    public OddEvenPrinter_1(int start, int end) {
        this.start = start;
        this.end = end;
        this.current = start;
    }

    class EvenThread extends Thread {
        @Override
        public void run() {
            printNumbers(true);
        }

    }

    class OddThread extends Thread {
        @Override
        public void run() {
            printNumbers(false);
        }

    }

    private void printNumbers(boolean printOdd) {
        while (true) {
            synchronized (lock) {
                while (current <= end && (current % 2 == 0) == printOdd) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return;
                    }
                }

                if (current > end) {
                    lock.notifyAll();
                    return;
                }

                if ((current % 2 != 0) == printOdd) {
                    if (printOdd) {
                        System.out.println("Odd Thread: " + current);
                    } else {
                        System.out.println("Even Thread: " + current);
                    }
                    current++;
                    lock.notifyAll();
                }
            }
        }
    }

    public void startPrinting() throws InterruptedException {
        Thread odd = new OddThread();
        Thread even = new EvenThread();

        odd.start();
        even.start();

        odd.join();
        even.join();

        System.out.println("Printing complete.");
    }

    public static void main(String[] args) throws InterruptedException {
        int start = 1;
        int end = 10;

        if (args.length >= 2) {
            try {
                start = Integer.parseInt(args[0]);
                end = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Using default values 1 and 10.");
            }
        }

        if (start > end){
            System.out.println("Indavalid range");
            return;
        }

        new OddEvenPrinter_1(start, end).startPrinting();
    }

}

