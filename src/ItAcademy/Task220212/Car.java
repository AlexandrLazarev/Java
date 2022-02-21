package ItAcademy.Task220212;

import java.util.HashSet;
import java.util.Set;

public class Car {
    private ColorEnum color;
    private final ModelEnum model;
    private final int year;
    private WheelSizeEnum wheelSize;
    private final EngineVolEnum engineVol;
    private Set<OptionEnum> options;

    public Car(ColorEnum color,
               ModelEnum model,
               int year,
               WheelSizeEnum wheelSize,
               EngineVolEnum engineVol,
               Set<OptionEnum> options) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVol = engineVol;
        this.options = options;
        if (options == null){
            this.options = new HashSet<>();
        } else  {
            this.options = options;
        }
    }

    public Car(ColorEnum color,
               ModelEnum model,
               int year,
               WheelSizeEnum wheelSize,
               EngineVolEnum engineVol) {
        this.color = color;
        this.model = model;
        this.year = year;
        this.wheelSize = wheelSize;
        this.engineVol = engineVol;
        this.options = new HashSet<>();
    }

    public void setColor(ColorEnum color) {
        this.color = color;
    }

    public void setWheelSize(WheelSizeEnum wheelSize) {
        this.wheelSize = wheelSize;
    }

    public void setOptions(Set<OptionEnum> options) {
        this.options = options;
    }

    public void addOption(OptionEnum option) {
        this.options.add(option);
    }

    public void deleteOption(OptionEnum option) {
        this.options.remove(option);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color=" + color +
                ", model=" + model +
                ", year=" + year +
                ", wheelSize=" + wheelSize +
                ", engineVol=" + engineVol +
                ", options=" + options +
                '}';
    }
}
