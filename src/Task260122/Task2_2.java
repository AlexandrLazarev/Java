package Task260122;

public class Task2_2 {
    public static void main(String[] args) {
        int var = 7; // Позиция, до которой высчитываются числа Фибоначчи
        int num = 0;
        int num2 = 1;
        int buf;
        int result = 0;
        for (int i = 0; i < var; i++) {
            buf = num2 + num;
            num = num2;
            num2 = buf;
            if (buf % 2 == 0) {
                result += buf;
            }
        }
        System.out.println(result);
    }
}
