package model1.board;

import common.JDBConnect;

import javax.servlet.ServletContext;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class BoardDAO extends JDBConnect {
    //부모클래스의 생성자 호출
    //application 내장 객체를 받는 생성자 이용
    public BoardDAO(ServletContext application) {
        super(application);
    }


    //board 테이블에 저장된 개시물의 개수 반환
    //목록에서 번호를 출력하기 위해 사용
    public int selectCount(Map<String, Object> map) {
        int totalCount = 0;

        //게시물 수 얻어오는 쿼리문 작성
        String query = "SELECT COUNT(*) FROM board";
        if (map.get("searchWord") != null) {
            query += " WHERE " + map.get("searchField") + " "
                  +  " LIKE '%"+ map.get("searchWord") + "%'";
        }
        try {
            //쿼리문 실행 위해 Statement 객체 생성
            stmt = con.createStatement();     //쿼리문 생성
            //select 쿼리문 실행. 실행결과는 ResultSet 객체로 반환
            rs = stmt.executeQuery(query);    //쿼리 실행
            //커서를 이동 시켜 결과값이 있는지 확인
            rs.next();  // 커서를 첫 번째 행으로 이동
            totalCount = rs.getInt(1); //첫 번째 컬럼 값을 가져옴
        } catch (Exception e) {
            System.out.println("게시물 수를 구하는 중 예외 발생");
            e.printStackTrace();
        }
        return totalCount;
    }

    //board 테이블의 레코드를 가져와서 반환
    //이 메서드가 반환한 ResultSet객체로부터 게시물 목록을 반복하여 출력하게 됨
    public List<BoardDTO> selectList(Map<String, Object> map) {
        List<BoardDTO> bbs = new Vector<BoardDTO>();
        //게시물 목록을 담을 변수

        String query = "SELECT * FROM board ";
        if (map.get("searchWord") != null) {
            query += " WHERE " + map.get("searchField") + " "
                  +  " LIKE '%"+ map.get("searchWord") + "%' ";
        }
        query += " ORDER BY num DESC ";

        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);

            while(rs.next()){
                BoardDTO dto = new BoardDTO();

                dto.setNum(rs.getString("num")); //일련번호
                dto.setTitle(rs.getString("title")); //제목
                dto.setContent(rs.getString("content")); //내용
                dto.setPostdate(rs.getDate("postdate")); //작성일
                dto.setId(rs.getString("id"));            //작성자 아이디
                dto.setVisitcount(rs.getString("visitcount")); //조회수

                //결과 목록에 저장
                bbs.add(dto);
            }
        }
        catch (Exception e) {
            System.out.println("게시물 조회 중 예외 발생");
            e.printStackTrace();
        }
        return bbs;
    }

    //게시물 데이터를 받아 DB에 추가
    public int insertWrite(BoardDTO dto){
        int result=0;

        try{
            String query = "INSERT INTO board ( "
                         +" title, content, id, visitcount) "
                         +" VALUES ( "
                         +" ?,?,?,0)";

            psmt = con.prepareStatement(query);

            psmt.setString(1, dto.getTitle());
            psmt.setString(2, dto.getContent());
            psmt.setString(3, dto.getId());
//            psmt.setDate(4,dto.getPostdate());

            result=psmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("게시물 입력 중 예외 발생");
        }
        return result;
    }

    //지정한 게시물을 찾아 내용을 반환함
    public BoardDTO selectView(String num){
        BoardDTO dto = new BoardDTO();

        String query = "SELECT B.*, M.name "
                +" FROM member M INNER JOIN board B "
                +" ON M.id=B.id "
                +" WHERE num=?";

        try{
            psmt=con.prepareStatement(query);
            psmt.setString(1, num);
            rs=psmt.executeQuery();

            if(rs.next()){
                dto.setNum(rs.getString(1));
                dto.setTitle(rs.getString(2));
                dto.setContent(rs.getString("content"));
                dto.setPostdate(rs.getDate("postdate"));
                dto.setId(rs.getString("id"));
                dto.setVisitcount(rs.getString(6));
                dto.setName(rs.getString("name"));
            }
        }
        catch (Exception e){
            System.out.println("게시물 상세보기 중 예외발생");
            e.printStackTrace();
        }
        return dto;
    }

    //지정한 게시물의 조회수를 1 증가시킴
    public void updateVisitCount(String num){
        //쿼리문 준비
        String query = "UPDATE board SET "
                +" visitcount=visitcount+1 "
                +" WHERE num=?";

        try {
                psmt=con.prepareStatement(query);
                //인파라미터를 일련번호로 설정
                psmt.setString(1, num);
                //쿼리 실행
                psmt.executeQuery();
        }
        catch (Exception e) {
            System.out.println("게시물 조회수 증가 중 예외 발생");
            e.printStackTrace();
        }

    }

    //지정 게시물 수정
    public int updateEdit(BoardDTO dto){
        int result=0;

        try{
            String query = "UPDATE board SET "
                    +" title=?, content=? "
                    +" WHERE num=?";

            psmt = con.prepareStatement(query);
            psmt.setString(1, dto.getTitle());
            psmt.setString(2, dto.getContent());
            psmt.setString(3, dto.getNum());

            result=psmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("게시물 수정 중 예외 발생");
            e.printStackTrace();
        }
        return result; //결과 반환
    }

    public int deletePost(BoardDTO dto){
        int result=0;

        try{
            String query="DELETE FROM board WHERE num=?";

            psmt=con.prepareStatement(query);
            psmt.setString(1, dto.getNum());

            result=psmt.executeUpdate();
        }
        catch (Exception e){
            System.out.println("게시물 삭제 중 예외 발생");
            e.printStackTrace();
        }
        return result; //결과 반환
    }
}