import java.io.File;
import java.util.Scanner;
public class Exercise18_29NumFilesDir {
    public static void main (String[] args) {
System.out.println("What is your directory?");
Scanner input = new Scanner(System.in);
String path = input.nextLine();

File directory = new File(path);

if (!directory.exists()) {
    System.out.println("That directory does not exist.");
    return;
}
System.out.println("Number of files: " + getNumberOfFiles(directory));
    }

    public static int getNumberOfFiles(File file){
if (file.isFile()) {
    return(1);
}
int total = 0;
File[] contents = file.listFiles();

if (contents != null) {
    for (File f : contents) {
        total += getNumberOfFiles(f);
    }
}
return total;
    }
}
