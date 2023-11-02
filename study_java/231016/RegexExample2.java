import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Matcher 클래스 (주어진 패턴과 일치하는지 판별할 때 주로 사용)
public class RegexExample2 {
    public static void main(String[] args) {
         Pattern pattern = Pattern.compile("^[a-zA-Z]*$"); // 영문자만
         String val = "abcdef"; // 대상문자열

         Matcher matcher = pattern.matcher(val);
        System.out.println(matcher.find());
        //find() : 대상문자열과 패턴이 일치하는 경우 true 반환

        //결과 => true
    }
}
