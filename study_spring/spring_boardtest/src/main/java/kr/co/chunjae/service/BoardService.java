package kr.co.chunjae.service;

import kr.co.chunjae.dto.BoardDTO;
import kr.co.chunjae.dto.PageDTO;
import kr.co.chunjae.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Log4j
@RequiredArgsConstructor
public class BoardService {
    //Service = 중간 연계다리 역할
    private final BoardRepository boardRepository;

    public int save(BoardDTO boardDTO) {
        return boardRepository.save(boardDTO);
    }
    //전체 리스트 보기
    public List<BoardDTO> findAll() {
        return boardRepository.findAll();
    }
    //상세(검색) 보기
    public BoardDTO findById(Long id) {
        return boardRepository.findById(id);
    }

    public void updateHits(Long id) {
        boardRepository.updateHits(id);
    }

    //삭제하기
    public void delete(Long id) {
        boardRepository.delete(id);
    }

    public void update(BoardDTO boardDTO) {
        boardRepository.update(boardDTO);
    }

    //페이징
    int pageLimit = 3; // 한 페이지당 보여줄 글 갯수
    int blockLimit = 3; // 하단에 보여줄 페이지 번호 갯수
    public List<BoardDTO> pagingList(int page) {
        /*
        1페이지당 보여지는 글 갯수 3
            1page => 0
            2page => 3
            3page => 6
         */
        int pagingStart = (page - 1) * pageLimit;
        Map<String, Integer> pagingParams = new HashMap<>();
        pagingParams.put("start", pagingStart);
        pagingParams.put("limit", pageLimit);
        List<BoardDTO> pagingList = boardRepository.pagingList(pagingParams);

        return pagingList;
    }


    public PageDTO pagingParam(int page) {
        // 전체 글 갯수 조회
        int boardCount = boardRepository.boardCount();
        // 전체 페이지 갯수 계산(10/3=3.33333 => 4)
        int maxPage = (int) (Math.ceil((double) boardCount / pageLimit));
        // 시작 페이지 값 계산(1, 4, 7, 10, ~~~~)
        int startPage = (((int)(Math.ceil((double) page / blockLimit))) - 1) * blockLimit + 1;
        // 끝 페이지 값 계산(3, 6, 9, 12, ~~~~)
        int endPage = startPage + blockLimit - 1;
        if (endPage > maxPage) {
            endPage = maxPage;
        }
        PageDTO pageDTO = new PageDTO();
        pageDTO.setPage(page);
        pageDTO.setMaxPage(maxPage);
        pageDTO.setStartPage(startPage);
        pageDTO.setEndPage(endPage);
        return pageDTO;
    }
}
