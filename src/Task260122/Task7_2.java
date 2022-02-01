package Task260122;

public class Task7_2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,2,1,2,6,5,4,3,3,2,1,1,3,3,3,4,2};  //1,0,4,3,8,9 //1,2,3,4,5,3,2,1,2,6,5,4,3,3,2,1,1,3,3,3,4,2
        int sum = 0;
        if (array.length == 1) {
            System.out.println("Максимально возможная сумма массива по условию задачи равна " + array[0]);
            return;
        }
        if (array.length == 0) {
            System.out.println("Массив не заполнен");
            return;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                continue;
            }
            if (i + 2 == array.length - 1 && array[i] + array[i + 2] > array[i + 1]) {
                sum += (array[i] + array[i + 2]);
                break;
            }
            if (i + 1 == array.length - 1 && array[i] > array[i + 1]) {
                sum += array[i];
                break;
            }
            if (i + 1 == array.length - 1 && array[i + 1] > array[i]) {
                sum += array[i + 1];
                break;
            }
            if (array[i] >= array[i + 1] || array[i + 2] > array[i + 1]) {
                sum += array[i];
                array[i] = array[i + 1] = 0;
            } else {
                sum += array[i + 1];
                array[i] = array[i + 1] = array[i + 2] = 0;
            }
        }
        System.out.println("Максимально возможная сумма массива по условию задачи равна " + sum);
    }
}
