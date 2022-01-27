package Task260122;

public class Task3 {
    public static void main(String[] args) {
        int g = 1;
        int[] array = {2, 5, 6, 9, 23, 56};
        for (int i = 0; i < array.length; i++) {
            int num = array[i];
            array[i] = array[array.length - g];
            array[array.length - g] = num;
            g++;
            if (i >= array.length / 2) {
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}