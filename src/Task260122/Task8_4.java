package Task260122;

public class Task8_4 {
    public static void main(String[] args) {
        int[] array = {3, 2, 1, 3, 2, 1};
        int[] arraySum = new int[array.length];
        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = 1;
        }
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                arraySum[i] = arraySum[i - 1] + 1;
            }
            if (array[i] < array[i - 1]) {
                int j = 0;
                j = i;
                while (array[j] < array[j - 1] && arraySum[j] == arraySum[j - 1]) {
                    arraySum[j - 1]++;
                    j--;
                    if (j==0){
                        break;
                    }
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

