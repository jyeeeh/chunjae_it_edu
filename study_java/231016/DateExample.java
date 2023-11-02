import java.text.SimpleDateFormat;
import java.util.Date;

//날짜와 시간 클래스
//Date = 날짜 정보를 전달하기 위해 사용

public class DateExample {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow1 = now.toString(); //문자열로 받기
        System.out.println(strNow1);


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
        String strNow2= sdf.format(now);
        System.out.println(strNow2);
    }
}
