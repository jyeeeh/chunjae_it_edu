package common;

import javax.servlet.ServletContext;
import java.sql.*;

public class JDBConnect {
    public Connection con;
    public Statement stmt;
    public PreparedStatement psmt;
    public ResultSet rs;

    public JDBConnect() {
        try{
            Class.forName("org.mariadb.jdbc.Driver");

            String url = "jdbc:mariadb://localhost:3306/mytestone";
            String id="root";
            String pwd = "12345";
            con = DriverManager.getConnection(url,id,pwd);

            System.out.println("DB연결 성공(기본 생성자)");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    //두번째 생성자
    public JDBConnect(String driver, String url, String id, String pwd){
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,id,pwd);

            System.out.println("DB연결 성공(인수 생성자 1)");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // 세 번째 생성자
    public JDBConnect(ServletContext application) {
        try {
            // JDBC 드라이버 로드
            String driver = application.getInitParameter("mariaDBDriver");
            Class.forName(driver);

            // DB에 연결
            String url = application.getInitParameter("mariaDBURL");
            String id = application.getInitParameter("mariaDBId");
            String pwd = application.getInitParameter("mariaDBPwd");
            con = DriverManager.getConnection(url, id, pwd);

            System.out.println("DB 연결 성공(인수 생성자 2)");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    //연결 해제
    public void close(){
        try {
            if(rs!=null) rs.close();
            if(stmt!=null) stmt.close();
            if(psmt!=null) psmt.close();
            if(con!=null) con.close();

            System.out.println("JDBC 자원 해제");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }



}
