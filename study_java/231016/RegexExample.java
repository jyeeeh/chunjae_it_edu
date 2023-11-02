import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {

        String pattern = "^[0-9]*$"; //숫자만  << 숫자 표현
        String val = "123456789";    //대상문자열

        boolean regex = Pattern.matches(pattern, val);
        System.out.println(regex);
    }
}
