package Task260122;

public class Task7 {
    public static void main(String[] args) {
        int[] array = {1, 0, 4, 3, 8, 9};
        int max = 0;
        int sum = 0;
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[j] > max) {
                    max = array[j];
                    num = j;
                }
            }
            sum += max;
            max = 0;
            if (num == array.length - 1) {
                array[num] = 0;
                array[num - 1] = 0;
            } else if (num == 0) {
                array[num] = 0;
                array[num + 1] = 0;
            } else {
                array[num] = 0;
                array[num - 1] = 0;
                array[num + 1] = 0;
            }
        }
        System.out.println("Максимально возможная сумма массива по условию задачи равна " + sum);
    }
}
