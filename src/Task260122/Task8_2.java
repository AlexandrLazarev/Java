package Task260122;

public class Task8_2 {
    public static void main(String[] args) {
        int sum = 0;
        int[] array = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int[] arraySum = new int[array.length];
        for (int i = 0; i < arraySum.length; i++) {
            arraySum[i] = 1;
        }
        int n1 = 0;  //
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1]) {
                n1++;
                arraySum[i] += n1;
                int n2 = 1;  //
                for (int j = array.length; j != 0; j--) {
                    if (array[i - n2--] > array[i - n2]) {
                        arraySum[i - n2] += 1;
                        n2 += 2;
                        n1 = 0;
                    } else break;
                }
            }
            if (array[i] > array[i + 1]) {
                int n3 = 1;
                for (int j = array.length; j != 0; j--) {
                    if (array[i - n3--] > array[i - n3]) {
                        arraySum[i - n3] += 1;
                        n3 += 2;
                        n1 = 0;
                    } else break;
                }
            }
            if (i == array.length - 1 && array[i] > array[i - 1]) {
                arraySum[i] += 1;
            }
        }
        for (int i = 0; i < arraySum.length; i++) {
            System.out.print(arraySum[i] + " ");
            sum += arraySum[i];
        }
        System.out.println("Сумма " + sum);

    }
}


