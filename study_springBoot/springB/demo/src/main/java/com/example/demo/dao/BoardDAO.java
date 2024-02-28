package com.example.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class BoardDAO {

    //싱글톤패턴 - 여러 차례 호출되더라도 실제로 생성되는 객체는 하나
    @Autowired
    @Resource(name="boardSessionTemplate")
    private SqlSession boardSqlSession;

    public List list(){
        return boardSqlSession.selectList("board.list"); //List<QnaVo>
    }

}
