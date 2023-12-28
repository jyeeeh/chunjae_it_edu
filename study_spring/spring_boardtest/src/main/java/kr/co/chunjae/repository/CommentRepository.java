package kr.co.chunjae.repository;

import kr.co.chunjae.dto.CommentDTO;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CommentRepository {
    //Database와 access하는게 Repository

    private final SqlSessionTemplate sql;


    public void save(CommentDTO commentDTO) {
        sql.insert("Comment.save",commentDTO);
    }

    //댓글 list 불러와주기
    public List<CommentDTO> findAll(Long boardId) {
        return sql.selectList("Comment.findAll",boardId);
    }

}
