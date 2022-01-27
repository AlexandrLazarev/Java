package Task260122;

public class Task1 {
    public static void main(String[] args) {
        int n = 25;
        int result = 0;
        int[] array = {4, 6, 9, 12, 25};
        for (int i : array) {
            result += i;
            if (i == n) {
                result -= n;
            }
        }
        System.out.println("Сумма чисел массива без числа \"n\" равна " + result);
    }
}

