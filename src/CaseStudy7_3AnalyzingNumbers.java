import java.util.Scanner;

public class CaseStudy7_3AnalyzingNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int n = input.nextInt();
        double[] numbers = new double[n];
        double sum = 0;

        System.out.print("Enter the numbers: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextDouble();
            sum += numbers[i];
        }

        double average = sum / n;

        int count = 0;
        for (int i = 0; i < n; i++){
            if (numbers[i] > average) {
                count++;
            }
        }
        System.out.println("Sum is " + sum);
        System.out.println("Average is " + average);
    }
}
