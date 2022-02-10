package Task040222;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Box {
   private int count = 0;
   private int x = 5;
   private int y = 5;
   private int z = 0;

    public Box(String name) {
        Pattern p = Pattern.compile("\\d*\\d");
        Matcher m = p.matcher(name);
        while (m.find()) {
            count++;
            if (count == 1) {
                this.x = Integer.parseInt(m.group());
            }
            if (count == 2) {
                this.y = Integer.parseInt(m.group());
            }
            if (count == 3) {
                this.z = Integer.parseInt(m.group());
            }
        }
    }

    public Box(int x) {
        this.x = x;
    }

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
            System.out.println("У нас конверт с размерами " + this.x + " x " + this.y);
        }
        if (x == y && x == z) {
            System.out.println("У нас куб с длиной ребра равной " + this.x);
        }
        if ((x != y || x != z) && z != 0) {
            System.out.println("У нас простая коробка с размерами " + this.x + " x " + this.y + " x " + this.z);
        }
    }
}

class BoxTest {
    public static void main(String[] args) {
        Box box = new Box("Box [222,222,222]");
        box.boxType(box);
    }
}

