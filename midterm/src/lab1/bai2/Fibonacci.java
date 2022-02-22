package lab1.bai2;

//2.4
public class Fibonacci {
    public static void main(String[] args) {
        int n = 3;
        int fn, fnMinus1, fnMinus2, nMax, sum;
        fnMinus1 = fnMinus2 = 1;
        nMax = 20;
        sum = fnMinus1 + fnMinus2;
        double average;

        System.out.println("The first " + nMax + " Fibonacci numbers are: ");

        while (n <= nMax) {
            fn = fnMinus1 + fnMinus2;
            sum += fn;

            ++n;
            fnMinus2 = fnMinus1;
            fnMinus1 = fn;
        }
        System.out.println(sum);
        System.out.println("Average is: " + 1.0 * sum / nMax);
    }
}
