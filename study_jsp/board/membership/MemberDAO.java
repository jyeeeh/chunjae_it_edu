package membership;

import common.JDBConnect;

public class MemberDAO extends JDBConnect {
    //명시한 db로의 연결이 완료된 MemberDAO  객체를 생성함
    public MemberDAO(String drv, String url, String id, String pw){
        super(drv, url, id, pw);
    }

    //명시한 아이디, 패스워드와 일치하는 회원 정보를 반환함
    public MemberDTO getMemberDTO(String uid, String upass){
        MemberDTO dto = new MemberDTO();
        String query = "SELECT * FROM member WHERE id=? AND pass=?";

        try{
            psmt = con.prepareStatement(query);
            psmt.setString(1, uid);
            psmt.setString(2, upass);
            //쿼리문 실행
            rs=psmt.executeQuery();

            //결과 실행
            if(rs.next()){
                dto.setId(rs.getString("id"));
                dto.setPass(rs.getString("pass"));
                dto.setName(rs.getString(3));
                dto.setRegidate(rs.getString(4));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        //DTO 객체 반환
        return dto;
    }
}
