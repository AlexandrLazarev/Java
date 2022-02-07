package Task040222;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String str = "Солнаце, Антарктида, яблоня а ара ";
        Pattern p = Pattern.compile("\\b[Аа]\\S*[Аа]\\b");
        Pattern p2 = Pattern.compile("\\bа\\b");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
        Matcher m2 = p2.matcher(str);
        while (m2.find()) {
            System.out.println(m2.group());
        }
    }
}
