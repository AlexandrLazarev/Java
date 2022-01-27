package Task260122;

public class Task2 {
    public static void main(String[] args) {
        int n = 15;
        int result = 0;
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                result += array[i];
            }
        }
        System.out.println("Сумма четных чисел Фибоначчи данного массива равна " + result);
    }
}