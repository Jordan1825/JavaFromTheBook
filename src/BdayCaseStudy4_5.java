import java.util.Scanner;

public class BdayCaseStudy4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = 0;

        for (int setValue = 1; setValue <= 16; setValue *= 2){
            System.out.println("Is your birthday in this set?");
            for (int n = 1; n <= 31; n++) {
                if ((n / setValue) % 2 == 1) {
                    System.out.println(n + " ");
                }
            }
            System.out.println();

            System.out.print("Enter 0 for No and 1 for Yes:" );
            int answer = input.nextInt();
            if (answer == 1 ){
                day += setValue;
            }
        }
        System.out.println("Your birthday is " + day + "!");
    }
}
