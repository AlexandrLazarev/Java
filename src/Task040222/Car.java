package Task040222;

public class Car {
    String brand;
    String color;

    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    void CarColor(String color) {
        if (this.brand.equalsIgnoreCase("Audi") && (color.equalsIgnoreCase("синий") || color.equalsIgnoreCase("красный") || color.equalsIgnoreCase("зеленый"))) {
            this.color = color;
        }

        if (this.brand.equalsIgnoreCase("BMW") && (color.equalsIgnoreCase("оранжевый") || color.equalsIgnoreCase("черный") || color.equalsIgnoreCase("фиолетовый"))) {
            this.color = color;
        }

        if (this.brand.equalsIgnoreCase("KIA") && (color.equalsIgnoreCase("желтый") || color.equalsIgnoreCase("серый") || color.equalsIgnoreCase("белый"))) {
            this.color = color;
        }
    }
}

class CarTest {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "красный");
        Car bmw = new Car("BMW", "черный");
        Car kia = new Car("KIA", "серый");

        audi.CarColor("белый");

        System.out.println(audi.color);
    }
}
