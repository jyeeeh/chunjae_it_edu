import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Matcher 클래스 (주어진 패턴과 일치하는지 판별할 때 주로 사용)
public class RegexExample3 {
    public static void main(String[] args) {
        String name="jyeeeh";
        String tel ="010-1234-5678";
        String email="test@naver.com";

        boolean name_check = Pattern.matches("^[가-힣]*$",name);
        boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\{4})-\\d{4}$",tel);
        boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);

        System.out.println("이름: "+name_check);
        System.out.println("전화번호: "+tel_check);
        System.out.println("이메일: "+email_check);
    }
}
