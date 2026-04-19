package Synchronization_5_2.threadSafe_Task2;

public class Main {
    public static void main(String[] args) {
        SafeArrayList safeList = new SafeArrayList();

        Runnable worker = () -> {
            for (int i = 1; i <= 5; i++) {
                String item = "Item-" + i;

                safeList.add(item);

                if (i % 2 == 0) {
                    safeList.remove(item);
                }

                System.out.println(Thread.currentThread().getName()
                        + " size = " + safeList.getSize());
            }
        };

        Thread thread1 = new Thread(worker, "Thread-1");
        Thread thread2 = new Thread(worker, "Thread-2");

        thread1.start();
        thread2.start();

            try {
                thread1.join();
                thread2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
            System.out.println("\nFinal size: " + safeList.getSize());




    }



}
