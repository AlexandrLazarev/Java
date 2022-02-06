package Task040222;

public class Average {
    double fiveEnd;
    double fourEnd;
    double threeEnd;
    double twoEnd;
    double oneEnd;
    private double[] v;

    void Receiving(double... v) {
        this.fiveEnd = v[v.length - 1];
        this.fourEnd = v[v.length - 2];
        this.threeEnd = v[v.length - 3];
        this.twoEnd = v[v.length - 4];
        this.oneEnd = v[v.length - 5];

    }

    double Average() {
        double average = (fiveEnd + fourEnd + threeEnd + twoEnd + oneEnd) / 5.0;
        System.out.println(average);
        return average;
    }
}

class Task3AverageTest {
    public static void main(String[] args) {
        Average average = new Average();
        average.Receiving(5, 1, 6, 8, 9, 50);
        average.Average();
    }
}
