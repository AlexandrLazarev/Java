package Task040222;

import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5NumberOfWords2 {
    public static void main(String[] args) {

        int num = 0;
        String str = "Искусство Ссылаться";
        Pattern p = Pattern.compile("[Сс][^\s]*[Сс][^\s]*[Сс][^\s]*");
        Matcher m = p.matcher(str);
        while (m.find()) {
            num++;
        }
        System.out.println(num);
    }
}


