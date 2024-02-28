package com.example.demo.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository
public class MemberDAO {

    //싱글톤패턴 - 여러 차례 호출되더라도 실제로 생성되는 객체는 하나
    @Autowired
    @Resource(name="memberSessionTemplate")
    private SqlSession memberSqlSession;

    public List list(){
        return memberSqlSession.selectList("member.list");
    }

}
