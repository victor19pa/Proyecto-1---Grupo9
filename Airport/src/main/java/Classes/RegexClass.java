package Classes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public  class RegexClass {
     public static boolean regexDate(String date) {
        if (!date.isEmpty() && !date.isBlank()) {
            Pattern pattern = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})(\\s)([0-1][0-9]|2[0-3])(:)([0-5][0-9])$");
            Matcher mat = pattern.matcher(date);
            if (mat.find()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

    public static boolean regexDouble(String capacity) {
        if (!capacity.isEmpty() && !capacity.isBlank()) {
            Pattern pattern = Pattern.compile("[+-]?([0-9]*[.])?[0-9]+");
            Matcher mat = pattern.matcher(capacity);
            if (mat.find()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}


