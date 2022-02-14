package ItAcademy.Task220212;


import java.util.ArrayList;
import java.util.Arrays;


public class CarFactory {
    String[] arrayModel = {"BMW", "AUDI", "SKODA"};
    double[] arrayEngine = {1.8, 2.0, 2.2};
    String[] arrayColor = {"BLACK", "RED", "WHITE"};
    int[] arrayWheelSize = {18, 20, 22};
    ArrayList<Car> carWarehouse = new ArrayList<>();

    void infoCarFactory() {
        System.out.println("Возможные модели " + Arrays.toString(arrayModel));
        System.out.println("Возможные объемы двигателей " + Arrays.toString(arrayEngine));
        System.out.println("Возможные цвета автомобилей " + Arrays.toString(arrayColor));
        System.out.println("Возможные диаметры колес " + Arrays.toString(arrayWheelSize));

    }
}
