public class Matrices {
    public static void main (String[] args) {
        int[][] matrix = new int[10][4];
        int[][] multiplicationTable12 = new int[12][12];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print("row " + row + " col " + col + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int row = 0; row < multiplicationTable12.length; row++) {
            for (int col = 0; col < multiplicationTable12[row].length; col++) {
                System.out.print((row + 1) * (col + 1) + "\t\t");
            }
            System.out.println();
        }

    }
}
