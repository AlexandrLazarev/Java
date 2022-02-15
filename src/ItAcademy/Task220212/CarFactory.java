package ItAcademy.Task220212;

import java.util.ArrayList;
import java.util.Arrays;


public class CarFactory extends Car implements CarService {
    public static void main(String[] args) {
       CarColor black = CarColor.BLACK;
    }
    String[] arrayModel = {"BMW", "AUDI", "SKODA"};
    double[] arrayEngine = {1.8, 2.0, 2.2};
    String[] arrayColor = {"BLACK", "RED", "WHITE"};
    int[] arrayWheelSize = {18, 20, 22};
    ArrayList<Car> carWarehouse = new ArrayList<>();
    Car[] accumulation = {new Car("BLACK", "BMW", 2020, 20, 2.0),
            new Car("RED", "AUDI", 2022, 22, 2.2)};

    void infoCarFactory() {
        System.out.println("Возможные модели " + Arrays.toString(arrayModel));
        System.out.println("Возможные объемы двигателей " + Arrays.toString(arrayEngine));
        System.out.println("Возможные цвета автомобилей " + Arrays.toString(arrayColor));
        System.out.println("Возможные диаметры колес " + Arrays.toString(arrayWheelSize));

    }

    public void setColor() {
    }

    public void setWheelSize() {

    }

    public void setOptionList() {

    }
}
