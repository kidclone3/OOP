package lab1.bai2;

//2.3
public class ComputePI {
    public static void main(String[] args) {
        double sum = 0.0;
        int MAX_DENOMINATOR = 1000;
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2) {
            if (denominator % 4 == 1) {
                sum += 1.0 / denominator;
            } else if (denominator % 4 == 3) {
                sum -= 1.0 / denominator;
            } else {
                System.out.println("Impossible!!!");
            }
        }
        System.out.println("Our PI is: " + 4 * sum);

//    Try 1:
        {
            int MAX_TERM = 10000;
            sum = 0.0;
            for (int term = 1; term <= MAX_TERM; ++term) {
                if (term % 2 == 1) {
                    sum += 1.0 / (2 * term - 1);
                } else {
                    sum -= 1.0 / (2 * term - 1);
                }
            }
            System.out.println("\nTry 1");
            System.out.println("Our PI is: " + 4 * sum);
        }

        //    Compare with the built-in PI:
        double exactPercent = 4 * sum / Math.PI * 100;
        System.out.println("Exactly percent: " + exactPercent + " %");
    }
}
