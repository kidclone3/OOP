package lab1.bai2;

//2.2
public class HarmonicSum {
    public static void main(String[] args) {
        final int MAX_DENOMINATOR = 50000;
        double sumL2R = 0.0;  // sum from left-to-right
        double sumR2L = 0.0;  // sum from right-to-left
        double absDiff;

//    for-loop for summing from left-to-right
        for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
            sumL2R += 1.0 / denominator;
        }
        System.out.println("The sum from left-to-right is: " + sumL2R);

//    for-loop for summing from right-to-left
        for (int denominator = MAX_DENOMINATOR; denominator >= 1; --denominator) {
            sumR2L += 1.0 / denominator;
        }
        System.out.println("The sum from right-to-left is: " + sumR2L);

        absDiff = (sumL2R > sumR2L) ? sumL2R - sumR2L : sumR2L - sumL2R;
        System.out.println("Absolute difference is: " + absDiff);
    }
}
