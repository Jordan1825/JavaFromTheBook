public class scrap_code {
    public static void main (String[] args) {


                int[][] x = new int[3][4];

                System.out.println("Floors (rows): " + x.length);
                System.out.println("Spots on floor 0: " + x[0].length);

                for (int floor = 0; floor < x.length; floor++) {
                    for (int spot = 0; spot < x[floor].length; spot++) {
                        System.out.print("[" + floor + "][" + spot + "] ");
                    }
                    System.out.println();
                }


    }

}