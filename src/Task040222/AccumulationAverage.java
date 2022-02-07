package Task040222;

public class AccumulationAverage {
    int count = 0;
    double num = 0;
    int i = 0;
    double[] array = new double[6];

    double AccumulationAverage(double num) {
        count++;
        this.num = num;
        array[i] = num;
        i++;
        if (i == array.length) {
            for (int j = 1; j < array.length; j++) {
                array[j - 1] = array[j];
            }
            array[i-1]=0;
            i--;
        }
        return array[i];
    }

    double average() {
        if (count > 5) {
            double average = (array[0] + array[1] + array[2] + array[3] + array[4]) / 5.0;
            return average;
        } else {
            double average = (array[0] + array[1] + array[2] + array[3] + array[4]) / i;
            return average;
        }
    }
}

class AccumulationAverageTest {
    public static void main(String[] args) {
        AccumulationAverage average = new AccumulationAverage();
        double s = average.AccumulationAverage(2);
        double s2 = average.AccumulationAverage(8);
        double s3 = average.AccumulationAverage(20);
        double s4 = average.AccumulationAverage(2);
       
        double averageResult = average.average();
        System.out.println("Среднее арифметическое последних пяти чисел равно " + averageResult);
    }
}

