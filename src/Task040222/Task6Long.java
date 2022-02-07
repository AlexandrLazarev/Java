package Task040222;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6Long {
    public static void main(String[] args) {
        String max = "";
        String str = "Регулярные выражения — тема, которую программисты, даже опытные, зачастую откладывают на потом.";
        Pattern p = Pattern.compile("[а-яА-Яa-zA-Z0-9]*");
        Matcher m = p.matcher(str);
        while (m.find()) {
            if (m.group().length() > max.length()) {
                max = m.group();
            }
        }
        System.out.println("Наибелее длинное слово из предложения - " +  max);
    }
}