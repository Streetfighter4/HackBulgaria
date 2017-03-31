package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "delivery 4 2016-10-25 12:31 420,369 23 5";
        Pattern p = Pattern.compile("([a-z]+)\\s([0-9])+\\s[0-9]+\\-[0-9]+\\-[0-9]+\\s[0-9]+//:[0-9]+\\s([0-9]+)\\,([0-9]+)\\s([0-9]+)\\s([0-9]+)");
        Matcher m = p.matcher(text);
        while(m.find()) {
            System.out.println(m.group());
        }
    }
}