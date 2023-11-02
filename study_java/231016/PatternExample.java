import java.util.regex.Pattern;

public class PatternExample {
    public static void main(String[] args) {
        String regExp ="(02|010)-\\d{3,4}-\\d{4}";
        //02-123-1234 or 010-1234-1234
        // {3,4} = 3개부터 4개까지, {4} = 정확히 4개
        String data = "010-123-4567";
        boolean result= Pattern.matches(regExp,data); //.matches(정규식, 검증할 문자열)

        if(result)
            System.out.println("정규식과 일치합니다");
        else
            System.out.println("정규식과 일치하지않음");

        regExp ="\\w+@\\w+\\.\\w+(\\.\\+)?";
        //      \w = 한개의 알파벳 또는 숫자
        //         \\-> 이스케이프문자로 (\)역슬래시 하나를 문자열로 포함시킴
        data = "angel@mycompanycom";
        result = Pattern.matches(regExp, data);

        if(result)
            System.out.println("정규식과 일치합니다");
        else
            System.out.println("정규식과 일치하지 않음");
        }
    }
