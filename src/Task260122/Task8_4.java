package Task260122;

public class Task8_4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int[] arraySum = new int[array.length];
        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = 1;
        }
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1]) {
                arraySum[i] = arraySum[i - 1] + 1;
            }
            if (array[i] < array[i - 1]) {
                int j = 0;
                j = i;
                while (array[j] < array[j - 1] && arraySum[j] == arraySum[j - 1]) {
                    arraySum[j - 1]++;
                    j--;
                }
            }
        }
        int sum = 0;
        for (int i = 0; i < arraySum.length; i++) {
            sum += arraySum[i];
            System.out.print(arraySum[i] + " ");
        }
        System.out.println("Сумма " + sum);
    }
}

