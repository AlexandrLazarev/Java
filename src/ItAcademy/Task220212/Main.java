package ItAcademy.Task220212;


public class Main {
    public static void main(String[] args) {
        Service carService = new Service();
        Factory carFactory = new Factory(carService);
        Showroom showroom = new Showroom(carFactory, carService);

        carFactory.getFromStorage(
                ColorEnum.GREEN,
                ModelEnum.MODEL_1,
                WheelSizeEnum.BIG,
                EngineVolEnum.NORMAL,
                null);
    }
}
