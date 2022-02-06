package Task040222;

public class Average2 {
    double num = 0;
    int i = 0;
    double[] array = new double[5];

    double Average2(double num) {
        this.num = num;
        array[i] = num;
        double average = (array[0] + array[1] + array[2] + array[3] + array[4]) / (i + 1.0);
        i++;
        if (i == array.length) {
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            i--;
        }
        return average;
    }
}

class Average2Test {
    public static void main(String[] args) {
        Average2 average = new Average2();
        double s = average.Average2(2);
        double s2 = average.Average2(3);
        double s3 = average.Average2(4);
        double s4 = average.Average2(5);
        double s5 = average.Average2(6);
        double s6 = average.Average2(100);
        double s7 = average.Average2(100);
        System.out.println("Средене значение последних пяти введенных чисел равго " + s7);
    }
}