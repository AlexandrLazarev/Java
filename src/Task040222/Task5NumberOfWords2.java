package Task040222;

import java.util.Arrays;
import java.lang.String;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5NumberOfWords2 {
    public static void main(String[] args) {

        int num = 0;
        String str = "Искусс ссылаться";
        Pattern p = Pattern.compile("с[^\s]*с[^\s]*с[^\s]*");
        Matcher m = p.matcher(str);
        while (m.find()) {
            num++;
        }
        System.out.println(num);
    }

}


