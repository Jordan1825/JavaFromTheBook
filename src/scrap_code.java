import java.util.Scanner;
public class scrap_code {
    public static void main(String[] args) {
        System.out.println((double) (5 / 2));
        boolean even = false;
        if (even) {
            System.out.println("It is even!");
        }

        int count = 0;
        do {
            System.out.println("Welcome to Java");
        } while (count++ < 9);
        System.out.println(count);
// SEPARATED


        double sum = 0;
        for (double d = 0; d < 10; sum += sum + d) {
            d += 0.1;
        }


/// SEPARATED

        int balance = 10;

        while (balance >= 1) {
            if (balance < 9)
                break;
            balance = balance - 9;
            System.out.println(balance);
        }


        //SEPARATED

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            i++;
            System.out.println(i);
        }


        // NEXT ONE
        (char)('a' + Math.random() * ('z' - 'a' + 1))


        // NEXT ONE
        int[] list1 = {1, 2, 3};
        int[] list2 = {1, 2, 3};
        list2 = list1;
        list1[0] = 0; list1[1] = 1; list2[2] = 2;

        for (int i = 0; i < list2.length; i++)
            System.out.print(list2[i] + " ");

        //NEXT ONE
        int[] x = new int[3];
        System.out.println("x[0] is " + x[0]);

        //next one

        int[][] values = {{3, 4, 5, 1}, {33, 6, 1, 2}};

        int v = values[0][0];
        for (int[] list : values)
            for (int element : list)
                if (v > element)
                    v = element;

        System.out.print(v);

        //NEXT ONE

        int[][] values = {{3, 4, 5, 1}, {33, 6, 1, 2}};

        for (int row = 0; row < values.length; row++) {
            System.out.print(m(values[row]) + " ");
        }
    }

    public static int m(int[] list) {
        int v = list[0];
        for (int i = 1; i < list.length; i++)
            if (v < list[i])
                v = list[i];
        return v;

        //NEXT ONE

        int[][] values = {{3, 4, 5, 1}, {33, 6, 1, 2}};

        int v = values[0][0];
        for (int row = 0; row < values.length; row++)
            for (int column = 0; column < values[row].length; column++)
                if (v < values[row][column])
                    v = values[row][column];

        System.out.print(v);


        //NEXT ONE, FIX AND WHAT IS SECOND PRINT STATEMENT
        public class Foo {
            static int i = 0;
            static int j = 0;

            public static void main(String[] args) {
                int i = 2;
                int k = 3;
                {
                    int j = 3;
                    System.out.println("i + j is " + i + j);
                }

                k = i + j;
                System.out.println("k is " + k);
                System.out.println("j is " + j);
            }
        }

        // QUESTION 13

        for (int i = 1; i <= 6; i++) {
            for (int j = 6; j >= 1; j--)
                System.out.print(j <= i ? j + " " : " " + " ");
            System.out.println();
        }
        }

    }

