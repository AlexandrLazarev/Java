package Task260122;

public class Task1 {
    public static void main(String[] args) {
        int n = 4;
        int result = 0;
        int[] array = {4, 6, 9, 12, 25};
        for (int i : array) {
            if (i == n) {
                continue;
            }
            result += i;
        }
        System.out.println("Сумма чисел массива без числа \"n\" равна " + result);
    }
}

