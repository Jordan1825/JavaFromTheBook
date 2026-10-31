import java.util.Scanner;
public class Exercise06_31 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number as a long integer: ");
        long number = input.nextLong();
        if (isValid(number)) {
            System.out.println(number + " is valid");
        } else {
            System.out.println(number + " is invalid");
        }


    }
/***************step 2 **********/
        /* Return this number if it is a single digit, otherwise the sum of the two digits */
        public static int getDigit(int number) {
            if (number < 10) {
                return number;
            }
            return number / 10 + number % 10;
        }
        /* Return the number of digits in d */
        public static int getSize(long d){
            int size = 0;
            while (d > 0) {
                size++;
                d /= 10;  //take out last digit
            }
            return size;
        }
        /** Get the result from step 2 **/
        public static int sumOfDoubleEvenPlace(long number) {
            int sum = 0;
            number /= 10;
            while (number > 0) {
                int digit = (int) (number % 10);
                sum += getDigit(digit * 2);
                number /= 100;
            }
            return sum;
        }
        public static int sumOfOddPlace(long number) {
            int sum = 0;
            while (number > 0){
                sum += (int) (number % 10);
                number /= 100;
            }
            return sum;
        }
        /*****step 4*****/
        public static long getPrefix(long number, int k) {
            while (getSize(number) > k) {
                number /= 10;
            }
            return number;
        }

        public static boolean prefixMatched(long number, int d){
            return getPrefix(number, getSize(d)) == d;
        }
        /*****step 5*****/
        public static boolean isValid(long number){
            int size = getSize(number);
            boolean rightLength = size >= 13 && size <= 16;
            boolean rightPrefix = prefixMatched(number, 4) || prefixMatched(number, 5) ||prefixMatched(number, 37) || prefixMatched(number, 6);
            int total = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
            boolean passesLuhn = total % 10 == 0;
            return rightLength && rightPrefix && passesLuhn;
        }
    }




















