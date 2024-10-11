public class MultidimensionalArray {
    public static void main(String[] args) {
        int[][] multiArray = { { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 } };
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[0].length; j++) { // Here in j<multiArray[0]: why we input 0 as index??
                System.out.print(multiArray[i][j] + "     ");
            }
            System.out.println("  ");
            System.out.println("  ");

        }
    }
}