package Task040222;

public enum Month {
    January("January", 1),
    February("February", 2),
    March("March", 3),
    April("April", 4),
    May("May", 5),
    June("June", 6),
    July("July", 7),
    August("August", 2),
    September("September", 3),
    October("October", 4),
    November("November", 5),
    December("December", 12);

    private final String name;
    private final int number;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    Month(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public static String getNameByNumber(int number) {
        for (Month value : values()) {
            if (value.number == number) {
                return value.name;
            }
        }
        return null;
    }

    public static int getNumberByName(String name) {
        for (Month value : values()) {
            if (value.name.equals(name)) {
                return value.number;
            }
        }
        return 0;
    }
}

class MonthTest {

    public static void main(String[] args) {
        System.out.println(Month.June);
        System.out.println(Month.getNameByNumber(3));
    }
}