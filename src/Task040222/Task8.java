package Task040222;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task8 {
    public static void main(String[] args) {
        String str = "Номер карточки 5464-5484-8562-6859 нельзя сообщать";
        Pattern p = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
        Matcher m = p.matcher(str);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}
