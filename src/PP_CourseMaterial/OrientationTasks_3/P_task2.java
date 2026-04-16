package PP_CourseMaterial.OrientationTasks_3;

public class P_task2 {
    public static void main(String[] args) {
        final int REITERATIONS = 10000;
        final int MAXAGE = 35;


        int agedistribution[][] = {
                { 20, 20 },
                { 56, 21 },
                { 84, 22 },
                { 96, 23 },
                {100, 24 },
        };

        int[] generatedAges = new int[MAXAGE + 1];


        for (int i = 1; i <= REITERATIONS; i++){
            int x = (int)(Math.random()*100)+1;
            int j = 0;
            while (x > agedistribution[j][0]) j++;
            generatedAges[agedistribution[j][1]]++;
        }

        // --- Output results ---
        System.out.println("=== Age Distribution after " + REITERATIONS + " draws ===\n");
        System.out.printf("%-6s %-10s %-14s %-12s%n",
                "Age", "Count", "Generated %", "Expected %");
        System.out.println("-".repeat(46));


        int[][] expected = { {20, 20}, {21, 36}, {22, 28}, {23, 12}, {24, 4} };
        for (int[] row : expected) {
            int age = row[0];
            int exp = row[1];
            int count = generatedAges[age];
            double pct = (double) count / REITERATIONS * 100;
            System.out.printf("%-6d %-10d %-14.2f %-12d%n", age, count, pct, exp);
        }

        System.out.println("-".repeat(46));
        System.out.printf("%-6s %-10d %-14.2f %-12d%n", "Total", REITERATIONS, 100.0, 100);
    }
}
