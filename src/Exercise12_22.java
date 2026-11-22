import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
public class Exercise12_22 {
    public static void main(String[] args) throws Exception {
        if (args.length != 3) {
            System.out.println("Usage: JavaExercise12_22 dir oldString newString");
            System.exit(1);
        }

        File dir = new File(args[0]);
        if (!dir.isDirectory()) {           // input validation: Is  it really a folder?
            System.out.println(args[0] + " is not a directory");
            System.exit(2);
        }

        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            if (files[i].isFile()) {
                replaceInFile(files[i], args[1], args[2]);
            }
        }
    }
        // the 12.16 logic moved into its own method so it can run once per file
    public static void replaceInFile(File file, String oldStr, String newStr) throws Exception {
        StringBuilder newText = new StringBuilder();

        try (Scanner input = new Scanner(file)) {
            while (input.hasNextLine()) {
                String line = input.nextLine();
                String replaced = line.replaceAll(oldStr, newStr);
                newText.append(replaced).append("\n");
            }
        }

        try (PrintWriter output = new PrintWriter(file)) {
            output.print(newText);
        }
        System.out.println("--- " + file.getName() + " ---");
        System.out.print(newText);
    }
}
