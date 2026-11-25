import java.util.Scanner;
public class Exercise18_10CharOccur {
    public static void main(String[] args) {
        System.out.println("Give me a string...");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();

        System.out.println("Give me a char to count...");
        char ch = input.nextLine().charAt(0);

        System.out.println("'" + ch + "' appears " + count(text, ch) + " times");


    }
    public static int count(String str, char a) {
        if (str.isEmpty()) {
            return 0;
        }
int match = 0;
        if (str.charAt(0) == a) {
            match = 1;
        }
        return match + count(str.substring(1), a);

    }
}
