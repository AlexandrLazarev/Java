package ItAcademy.Task220212;

import java.util.ArrayList;
import java.util.Arrays;

public class Car {
    private String color;
    private final String model;
    private final int year;
    private int wheelSize;
    private final double engineCapacity;
    ArrayList<String> optionList = new ArrayList<>();

    Car(String color, String model, int year, int wheelSize, double engineCapacity) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineCapacity = engineCapacity;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        this.wheelSize = wheelSize;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public ArrayList<String> getOptionList() {
        return optionList;
    }

    public void infoCar() {
        System.out.println("Модель - " + model + "\nГод выпуска - " + year +
                "\nЦвет - " + color + "\nОбъем двигателя - " + engineCapacity +
                "\nРазмер колес - " + wheelSize + "'" + "\nОпции: " + optionList);
    }
}



