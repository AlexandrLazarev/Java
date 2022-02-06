package Task040222;

public class Average2 {
    double num = 0;
    int i = 0;
    int count = 0;
    double[] array = new double[5];

    double Average2(double num) {
        this.num = num;
        array[i] = num;
        if (i == array.length - 1 || count > 0) {
            double average = (array[0] + array[1] + array[2] + array[3] + array[4]) / 5.0;
            i = 0;
            count++;
            return average;
        } else {
            double average = (array[0] + array[1] + array[2] + array[3] + array[4]) / (i + 1.0);
            i++;
            return average;
        }
    }
}

class Average2Test {
    public static void main(String[] args) {
        Average2 average = new Average2();
        double s = average.Average2(2);
        System.out.println(s);
        double s2 = average.Average2(4);
        System.out.println(s2);
       
    }
}