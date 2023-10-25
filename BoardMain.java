import java.util.Scanner;
import java.sql.*;

public class BoardMain {
    //필드
    private Scanner sc = new Scanner(System.in); //키보드 입력
    //DB연결 필요로 Connection 필드 추가
    private Connection conn;

    //생성자에서 DB연결

    public BoardMain() {
        try {
            //JDBC Driver를 메모리로 로딩
            //Class.forName() 메소드는 JDBC Driver 클래스를 BuildPath에서 찾고 메모리로 로딩함
            Class.forName("org.mariadb.jdbc.Driver");

            //연결하기 , "url/root/비밀번호"
            conn = DriverManager.getConnection(
                    "jdbc:mariadb://127.0.0.1:3306/project_mb", //project_mb : 스키마 이름
                    "root",
                    "12345"
            );
        }
        catch (Exception e) {
            e.printStackTrace(); //오류 print
            exit();
        }
    }

    public void list(){
        //게시물 목록 리스트 보여주기
        System.out.println("[게시물 목록]");
        System.out.println("-------------------------------------------------------");
        //ex)%-6s => 자릿수가 6보다 작으면 출력이 오른쪽에 채워짐(자릿수 맞추고 왼쪽 정렬)
        System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer","date","title");
        System.out.println("-------------------------------------------------------");

        //boards 테이블에서 게시물 정보 가져와서 출력
        try{
            //select sql 문 boards 테이블에서 bno, btitle, bcontent, bwriter, bdate 출력
            String sql = ""+
                    "SELECT bno, btitle, bcontent, bwriter, bdate "+
                    "FROM boards";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            //executeQuery : 수행결과로 ResultSet 객체 값 반환 / 결과 값을 담을 수 있음
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                Board board = new Board();
                board.setBno(rs.getInt("bno"));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                System.out.printf("%-6s%-12s%-16s%-40s\n",
                        // 입력받은 값 board.get 저장
                        board.getBno(),
                        board.getBwriter(),
                        board.getBdate(),
                        board.getBtitle());
            }
            rs.close();
            pstmt.close();
        }

        catch(SQLException e){
            e.printStackTrace();
        }

        mainMenu();        //메인메뉴 호출
    }
    public void mainMenu(){
        //메인메뉴 출력창

        System.out.println("------------------------------------------------------");
        System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();  //키보드입력받기 위해서 nextLine() 호출
        switch (menuNo){
            case "1" : create();    //1번을 누르면 create 실행
            case "2" : read();      //2번을 누르면 read 실행
            case "3" : clear();     //3번을 누르면 clear 실행
            case "4" : exit();      //4번을 누르면 exit 실행
        }
    }

    private void exit() {
        //4. Exit 선택 시 exit() 메소드 수행 => 게시판 종료
        System.out.println("***exit() 실행됨***");
        if(conn != null){
            try{
                conn.close();
            }
            catch (SQLException e){   //예외처리
            }
        }

        System.out.println("** 게시판 종료 **");
        System.exit(0); //종료
    }

    private void clear() {
        //3. Clear 선택 후 보조메뉴 Ok 선택 시 boards 테이블의 전체 게시물 정보를 삭제함
        System.out.println("[게시물 전체 삭제]");
        System.out.println("--------------------------------");
        System.out.println("보조메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo=sc.nextLine();

        if(menuNo.equals("1")){
            //"1" 누를 시 테이블 게시물 정보 전체 삭제
            try{
                String sql="TRUNCATE TABLE boards"; //구조는 남기고 내용만 전체 삭제
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.executeUpdate();
                pstmt.close();
            }
            catch(Exception e){   //예외처리
                e.printStackTrace();
                exit();
            }
        }

        list();
    }

    private void read() {
        //게시물의 번호를 키보드로 입력받고 boards 테이블에있는 해당 게시물을 가져와서 출력

        System.out.println("[게시물 읽기]");
        System.out.print("bno: ");
        int bno = Integer.parseInt(sc.nextLine());
        //boards 테이블에서 해당 게시물을 가져와 출력
        try{
            String sql=""+
                    "SELECT bno, btitle, bcontent, bwriter, bdate " +
                    "FROM boards "+
                    "WHERE bno=?"; //bno 번호에 따라 bno, btitle, bcontent, bwriter, bdate 출력
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setInt(1, bno);
            ResultSet rs = pstmt.executeQuery();
            if(rs.next()){
                Board board = new Board();
                board.setBno((rs.getInt("bno")));
                board.setBtitle(rs.getString("btitle"));
                board.setBcontent(rs.getString("bcontent"));
                board.setBwriter(rs.getString("bwriter"));
                board.setBdate(rs.getDate("bdate"));
                System.out.println("####################");
                System.out.println("번호: "+board.getBno());
                System.out.println("제목: "+board.getBtitle());
                System.out.println("내용: "+board.getBcontent());
                System.out.println("작성자: "+board.getBwriter());
                System.out.println("날짜: "+board.getBdate());
                System.out.println("####################");

                //보조메뉴 출력
                System.out.println("--------------------------------");
                System.out.println("보조 메뉴: 1. Update | 2. Delete | 3. List");
                System.out.print("메뉴 선택: ");
                String menuNo = sc.nextLine(); // 메뉴선택 번호 받기
                System.out.println();

                if(menuNo.equals("1")){
                    //보조메뉴 1 선택, 수정 내용 입력으로 이동
                    update(board);
                }
                else if(menuNo.equals("2")){
                    //보조메뉴 2 선택, 게시물 정보 삭제
                    delete(board);
                }
            }
            rs.close();
            pstmt.close();
        }
        catch(Exception e){ //예외처리
            e.printStackTrace();
            exit();
        }

        list();     //게시물 목록 출력
    }

    public void update(Board board){
        //게시물 정보 수정 내용 입력 란
        //제목, 내용, 작성자 정보 수정 입력
        System.out.println("[수정 내용 입력]");
        System.out.println("제목: ");
        board.setBtitle(sc.nextLine());
        System.out.println("내용: ");
        board.setBcontent(sc.nextLine());
        System.out.println("작성자: ");
        board.setBwriter(sc.nextLine());

        //보조 메뉴 출력
        System.out.println("--------------------------------");
        System.out.println("보조메뉴: 1. Ok | 2. Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine();
        //menuNo로 외부 입력 값(보조메뉴 선택값) 받음 1 or 2

        if(menuNo.equals("1")){
            //boards 테이블에서 게시물 정보 수정
            try{
                //sql문 : btitle, bcontent, bwriter 에 수정 값 입력
                String sql=""+
                        "UPDATE boards SET btitle=?, bcontent=?, bwriter=? "+
                        "WHERE bno=?"; //
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, board.getBtitle());
                pstmt.setString(2, board.getBcontent());
                pstmt.setString(3, board.getBwriter());
                //Btitle, Bcontent, Bwriter에 저장
                pstmt.setInt(4, board.getBno());
                pstmt.executeUpdate(); // Update
                pstmt.close();
            }
            catch(Exception e ){  //예외처리
                e.printStackTrace();
                exit();
            }
        }

        list(); //게시물 목록 출력
    }

    public void delete(Board board){
        //boards 테이블 게시물 정보 삭제
        try{
            //bno 입력값을 받아 행 삭제
            String sql="DELETE FROM boards WHERE bno=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            //bno받아서
            pstmt.setInt(1, board.getBno());
            //실행
            pstmt.executeUpdate();
            pstmt.close();
        }
        catch(Exception e){
            e.printStackTrace();
            exit();
        }

        list(); //게시물 목록 출력
    }

    private void create() {
        //boards 테이블에 새로운 게시물이 저장되도록 하기

        Board board=new Board();
        System.out.println("[새 게시물 입력]");
        System.out.print("제목: ");
        board.setBtitle(sc.nextLine());         //입력받은 값 제목에 저장
        System.out.print("내용: ");
        board.setBcontent(sc.nextLine());       //입력받은 값 내용에 저장
        System.out.print("작성자: ");
        board.setBwriter(sc.nextLine());        //입력받은 값 작성자에 저장

        //보조 메뉴 출력
        System.out.println("--------------------------------");
        System.out.println("보조메뉴: 1.0k | 2. Cancel");
        System.out.print("메뉴 선택: ");
        String menuNo = sc.nextLine(); //1번, 2번 선택 中
        if(menuNo.equals("1")){
            //1 선택 시 boards 테이블에 게시물 정보 저장
            try{
                //sql문 : 입력값을 btitle, bcontent, bwriter 순서대로 받아 저장
                String sql = ""+
                        "INSERT INTO boards (btitle, bcontent, bwriter, bdate) "+
                        "VALUES (?,?,?,now())";
                PreparedStatement pstmt = conn.prepareStatement(sql);
                pstmt.setString(1, board.getBtitle());
                pstmt.setString(2, board.getBcontent());
                pstmt.setString(3, board.getBwriter());
                //Btitle, Bcontent, Bwriter에 저장
                pstmt.executeUpdate(); // Update
                pstmt.close();
            }
            catch (Exception e){   //예외처리
                e.printStackTrace();
                exit(); //나가기
            }

        }
        //게시물 목록 출력
        list();
    }

    public static void main(String[] args) {
        BoardMain board1 = new BoardMain();
        board1.list();      //리스트 보여주기 시작
    }
}
