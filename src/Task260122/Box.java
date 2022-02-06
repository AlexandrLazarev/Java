package Task260122;

public class Box {
    int x;
    int y;
    int z;

    public Box(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    void boxType(Box box) {
        if (box.z == 0) {
            System.out.println("У нас конверт");
            return;
        }
        if (x == y && x == z) {
            System.out.println("У нас куб");
        }
        if (x != y || x != z) {
            System.out.println("У нас простая коробка");
        }
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box box = new Box(5, 3, 5);
        Box box1 = new Box(9, 7);
        box.boxType(box);
    }
}

