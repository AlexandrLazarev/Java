package ItAcademy.Task220212;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Factory {
    private static final int YEAR = 2022;

    private final Service carService;
    private final ModelEnum[] models = ModelEnum.values();
    private final EngineVolEnum[] engines = EngineVolEnum.values();
    private final ColorEnum[] colors = ColorEnum.values();
    private final WheelSizeEnum[] wheels = WheelSizeEnum.values();

    private final Car[] storage = new Car[2];

    public Factory(Service carService) {
        this.carService = carService;
        storage[0] = new Car(
                ColorEnum.GREEN,
                ModelEnum.MODEL_1,
                YEAR,
                WheelSizeEnum.BIG,
                EngineVolEnum.NORMAL
        );

        Set<OptionEnum> options = new HashSet<>();
        options.add(OptionEnum.ABS);
        options.add(OptionEnum.CONDITION);

        storage[1] = new Car(
                ColorEnum.RED,
                ModelEnum.MODEL_2,
                YEAR,
                WheelSizeEnum.SMALL,
                EngineVolEnum.RACING,
                options
        );
    }

    public void print() {
        System.out.println(
                Arrays.toString(models) +
                        Arrays.toString(colors) +
                        Arrays.toString(wheels) +
                        Arrays.toString(engines)
        );
    }

    public Car createCar(ColorEnum color,
                         ModelEnum model,
                         WheelSizeEnum wheelSize,
                         EngineVolEnum engineVol,
                         Set<OptionEnum> options) {
        Car car = getFromStorage(color, model, wheelSize, engineVol, options);
        if (car == null) {
            return new Car(color, model, YEAR, wheelSize, engineVol);
        }
        return car;
    }

    public Car getFromStorage(ColorEnum color,
                              ModelEnum model,
                              WheelSizeEnum wheelSize,
                              EngineVolEnum engineVol,
                              Set<OptionEnum> options) {
        for (int i = 0; i < storage.length - 1; i++) {
            if (model == ModelEnum.MODEL_1 &&
                    engineVol == EngineVolEnum.NORMAL &&
                    color == ColorEnum.GREEN &&
                    wheelSize == WheelSizeEnum.BIG) {
                return storage[0];

            }
            if (model == ModelEnum.MODEL_2 &&
                    engineVol == EngineVolEnum.RACING &&
                    color == ColorEnum.RED &&
                    wheelSize == WheelSizeEnum.SMALL) {
                return storage[1];
            }
        }
        return null;
    }
}