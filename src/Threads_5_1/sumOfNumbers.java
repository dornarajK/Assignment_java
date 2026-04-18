package Threads_5_1;

import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class sumOfNumbers {
    private static final int ARRAY_SIZE = 1000;
    private static final int MAX_VALUE = 100;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int[] number  = new int[ARRAY_SIZE];
        Random random = new Random();

        for (int i = 0; i < number.length; i ++){
            number[i] = random.nextInt(MAX_VALUE);
        }

        int corse = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = java.util.concurrent.Executors.newFixedThreadPool(corse);

        int chunckSize = (int) Math.ceil((double) number.length / corse);
        Future<Long>[] futures = new Future[corse];

        for (int i = 0; i < corse; i++ ){
            final int start = i * chunckSize;
            final int end = Math.min(start + chunckSize, number.length);

            futures[i] = executor.submit(() -> {
                long sum = 0;
                for (int j = start; j < end; j++) {
                    sum += number[j];
                }
                return sum;
            });
        }

        long paralerSum = 0;
        for ( int i = 0; i < corse; i++){
            paralerSum += futures[i].get();

        }
        executor.shutdown();

        long sequentialSum = 0;
        for (int n : number) {
            sequentialSum += n;
        }

        System.out.println("Available processors: " + corse);
        System.out.println("Parallel sum:   " + paralerSum);
        System.out.println("Sequential sum: " + sequentialSum);
        System.out.println("Match: " + (paralerSum == sequentialSum));



    }
}
