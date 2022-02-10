package Task040222;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task9 {
    public static void main(String[] args) {
        String str = "Номер карточки 5464-5484-8562-6859 нельзя СообЩать";
        Pattern p = Pattern.compile("\\bсообщать\\b");
        Matcher m = p.matcher(str.toLowerCase());
        while (m.find()) {
            System.out.println("Искомое слово начинается с индекса " + m.start());
        }
    }
}
