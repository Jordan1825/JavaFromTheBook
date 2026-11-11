import java.util.Scanner;

public class TheLocationClass9_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns in the array: ");
        int rows = input.nextInt();
        int columns = input.nextInt();

        double[][] a = new double[rows][columns];
        System.out.println("Enter the array:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = input.nextDouble();
            }
        }

        Location loc = locateLargest(a);
        System.out.println("The location of the largest element is " + loc.maxValue + "at (" + loc.row + ", " + loc.column + ")");
    }

    public static Location locateLargest(double[][] a) { //Any method with a return type other than void must end by returning that type!!!
        int maxRow = 0;
        int maxColumn = 0;
        double maxValue = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxValue) {
                    maxValue = a[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }
        return new Location(maxRow, maxColumn, maxValue);
    }
}

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }
}

















