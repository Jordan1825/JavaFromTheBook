import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercise12_16 {
    public static void main (String[] args) throws Exception {
        // expect 3 command line arguments file, oldstring, newString.
        if (args.length != 3) {
            System.out.println("Usage: java Exercise12_16 file oldString newString");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exist");
            System.exit(2);
        }

        StringBuilder newText = new StringBuilder();        // collects the changed text

        try (Scanner input = new Scanner(sourceFile)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String replaced = line.replaceAll(args[1], args[2]);        // swap old for new
                newText.append(replaced).append("\n");      // add it to the collection
            }
        }
        try (PrintWriter output = new PrintWriter(sourceFile)) {
            output.print(newText);
        }
        System.out.println("Replaced \"" + args[1] + "\" with \"" + args[2] + "\" in " + args[0]);
    }
}
