package Task260122;

public class Task6 {
    public static void main(String[] args) {

        int[][] array = {
                {2, 2, 2, 2},
                {3, 3, 3, 3},
                {4, 4, 4, 4},
                {5, 5, 5, 5}
        };
        int[][] array2 = {
                {5, 5, 5, 5},
                {9, 9, 9, 9},
                {11, 11, 11, 11},
                {15, 15, 15, 15}
        };
        int[][] arraySum = new int[4][4];
        int[][] arrayDiff = new int[4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arraySum[i][j] = array2[i][j] + array[i][j];
            }
        }
        System.out.print("Сумма двух массивов ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(arraySum[i][j] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                arrayDiff[i][j] = array2[i][j] - array[i][j];
            }
        }
        System.out.print("Разность двух массивов ");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(arrayDiff[i][j] + " ");
            }
        }
    }
}