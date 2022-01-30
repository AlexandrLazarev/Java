package Task260122;

public class Task5 {
    public static void main(String[] args) {
        int num = 4;          //указать размер квадратной матрицы
        int[][] array = {
                {2, 0, 0, 0},
                {6, 4, 0, 0},
                {2, 5, 8, 0},
                {1, 3, 7, 9}
        };
        for (int i = 0; i < array.length; i++) {
            num--;
            for (int j = array[i].length - num; j < array[i].length; j++) {
                if (array[i][j] != 0) {
                    System.out.println("Массив не является нижней треугольной матрицей");
                    return;
                }
            }
        }
        System.out.println("Нижняя треугольная матрица");
    }
}

