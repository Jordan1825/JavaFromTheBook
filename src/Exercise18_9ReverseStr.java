import java.util.Scanner;

public class Exercise18_9ReverseStr {
    public static void main (String[] args) {
        System.out.println("Give a random string to reverse!");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();
        reverseDisplay(value);
        System.out.println();

    }

    public static void reverseDisplay(String value) {
        if (value.isEmpty()){
            return;
        }
        reverseDisplay(value.substring(1));
        System.out.print(value.charAt(0));
    }
}


