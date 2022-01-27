package Task260122;

public class Task4 {
    public static void main(String[] args) {
        int negative = 0;
        int positive = 0;
        int array[][] = {{-3, -5}, {4, 0}, {7, 6}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    positive++;
                } else if (array[i][j] < 0) {
                    negative++;
                }
            }
        }
        if (positive > negative) {
            System.out.println("Положительных чисел больше");
        } else if (positive < negative) {
            System.out.println("Отрицательных чисел больше");
        } else {
            System.out.println("Равное количество отрицательных и положительных чисел");
        }
    }
}


