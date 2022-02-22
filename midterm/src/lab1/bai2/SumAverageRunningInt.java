package lab1.bai2;

//2.1
public class SumAverageRunningInt {
    public static void main(String[] args) {
        int sum = 0;
        double average;
        final int LOWERBOUND = 1;
        final int UPPERBOUND = 100;

        for (int number = LOWERBOUND; number <= UPPERBOUND; ++number) {
            sum += number;
        }
//    1.0 * sum to make it becomes double.
        average = 1.0 * sum / (UPPERBOUND - LOWERBOUND + 1);
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);

//    Modify 1
        {
            sum = 0;
            int number = LOWERBOUND;
            while (number <= UPPERBOUND) {
                sum += number;
                ++number;
            }
            System.out.println("\nModify 1");
            System.out.println("Modify 1, Sum = " + sum);
        }

//    Modify 2
        {
            sum = 0;
            int number = LOWERBOUND;
            do {
                sum += number;
                ++number;
            } while (number <= UPPERBOUND);
            System.out.println("\nModify 2");
            System.out.println("Modify 2, Sum = " + sum);
        }
//    3: So it is no change in result of using while - do or do - while or for loop.

//    Modify 4: Sum from 111 to 8899
        {
            int count = 0;
            sum = 0;
            for (int number = 111; number <= 8899; ++number) {
                sum += number;
                ++count;
            }
            average = 1.0 * sum / (8899 - 111 + 1);
            System.out.println("\nModify 4");
            System.out.println("Sum from 111 to 8899 = " + sum);
            System.out.println("Average = " + average);
            System.out.println("The number within the range = " + count);
        }

//    Modify 5: Sum square from 1 to 100
        {
            sum = 0;
            for (int number = 1; number <= 100; ++number) {
                sum += number * number;
            }
            System.out.println("\nModify 5");
            System.out.println("Sum of the squares = " + sum);
        }

//    Modify 6: Sum of odd numbers, even numbers
        {
            int sumOdd = 0;
            int sumEven = 0;
            int absDiff;

            for (int number = 1; number <= 100; ++number) {
                if (number % 2 == 1) {
                    sumOdd += number;
                } else {
                    sumEven += number;
                }
            }
//
            if (sumOdd > sumEven) {
                absDiff = sumOdd - sumEven;
            } else {
                absDiff = sumEven - sumOdd;
            }
            absDiff = (sumOdd > sumEven) ? sumOdd - sumEven : sumEven - sumOdd;
        }
    }
}
