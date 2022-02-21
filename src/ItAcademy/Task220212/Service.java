package ItAcademy.Task220212;

public class Service {
    public Service() {
    }

    public void changeColor(Car car, ColorEnum color) {
        car.setColor(color);
    }

    public void changeWheel(Car car, WheelSizeEnum wheelsize) {
        car.setWheelSize(wheelsize);
    }

    public void addOption(Car car, OptionEnum option) {
        car.addOption(option);
    }

    public void deleteOption(Car car, OptionEnum option) {
        car.deleteOption(option);
    }
}
