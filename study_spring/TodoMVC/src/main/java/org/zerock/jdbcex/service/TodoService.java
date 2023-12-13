package org.zerock.jdbcex.service;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVO;
import org.zerock.jdbcex.dto.TodoDTO;
import org.zerock.jdbcex.util.MapperUtil;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
public enum TodoService {
    INSTANCE;

    private TodoDAO dao;
    private ModelMapper modelMapper;

    TodoService(){
        dao = new TodoDAO();
        modelMapper = MapperUtil.INSTANCE.get();
    }

    //등록
    public void register(TodoDTO todoDTO) throws Exception{
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        //log4j2 등록 후 로깅 정보 출력은 아래로 대체
        log.info(todoVO);
        // System.out.println("todoVO: "+todoVO);
        dao.insert(todoVO);
    }

    //전체목록
    public List<TodoDTO> listAll()throws Exception{
        List<TodoVO> voList = dao.selectAll();
        log.info("voList-----------");
        log.info(voList);

        List<TodoDTO> dtoList = voList.stream()
                .map(vo -> modelMapper.map(vo,TodoDTO.class))
                .collect(Collectors.toList());

        return dtoList;
    }

    //상세조회
    public TodoDTO get(Long tno)throws Exception{
        log.info("tno: "+tno);
        TodoVO todoVO = dao.selectOne(tno);
        TodoDTO todoDTO = modelMapper.map(todoVO, TodoDTO.class);
        return todoDTO;
    }

    //삭제
    public void remove(Long tno)throws Exception{
        log.info("tno: "+tno);
        dao.deleteOne(tno);
    }

    //수정
    public void modify(TodoDTO todoDTO)throws Exception{
        log.info("todoDTO: "+todoDTO);
        TodoVO todoVO = modelMapper.map(todoDTO, TodoVO.class);
        dao.updateOne(todoVO);
    }

}
