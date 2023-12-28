package kr.co.chunjae.controller;

import kr.co.chunjae.dto.BoardDTO;
import kr.co.chunjae.dto.CommentDTO;
import kr.co.chunjae.dto.PageDTO;
import kr.co.chunjae.service.BoardService;
import kr.co.chunjae.service.CommentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
@Log4j
public class BoardController {
    //RequiredArgs.. = 연결하는 관계 설정할 때 필요
    private final BoardService boardService;
    private final CommentService commentService;

    @GetMapping("/save")
    public String saveForm(){
        //save.jsp 리턴
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute BoardDTO boardDTO){
        int saveResult = boardService.save(boardDTO);
        if(saveResult>0){
            //정상적으로 처리
            ///글 작성했을 때 페이지 목록으로 가도록 수정
//            return "redirect:/board/";
            return "redirect:/board/paging";
        }else{
            return "save";
        }
    }

    //리스트 전체 보여주기
    @GetMapping("/")
    public String findAll(Model model){
        List<BoardDTO> boardDTOList = boardService.findAll();
        model.addAttribute("boardList",boardDTOList);
        return "list";
    }

    //리스트 상세 보기
    //페이지정보를 가져와야해서 @RequestParam(value="page", required = false, defaultValue = "1") int page 추가함
    @GetMapping
    public String findById(@RequestParam("id") Long id,
                           @RequestParam(value="page", required = false, defaultValue = "1") int page,
                           Model model){
        //조회수 올리기
        boardService.updateHits(id);
        //---------------------------
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board",boardDTO);
        //페이지 정보 가져와야해서 가져옴
        model.addAttribute("page",page);

        //댓글 리스트 불러오기
        List<CommentDTO> commentDTOList = commentService.findAll(id);
        model.addAttribute("commentList",commentDTOList);

        return "detail";
    }

    //삭제
    @GetMapping("/delete")
    public String delete(@RequestParam("id") Long id){
        boardService.delete(id);
        return "redirect:/board/";
    }


    //수정
    @GetMapping("/update")
    public String updateForm(@RequestParam("id") Long id, Model model){
        //id값으로 해당 수정할 내용 찾기
        BoardDTO boardDTO = boardService.findById(id);
        model.addAttribute("board",boardDTO);

        return "update";
    }
    //수정
    @PostMapping("/update")
    public String update(@ModelAttribute BoardDTO boardDTO, Model model){
        boardService.update(boardDTO);
        //id값 가져오기
        BoardDTO dto = boardService.findById(boardDTO.getId());
        model.addAttribute("board",boardDTO);
        return "detail";
        //아래와 같이 redirect 을 해버리면 수정인데도 조회수 증가가 같이 됨
        //        return "redirect:/board?id="+boardDTO.getId();
    }

    //페이징
    @GetMapping("/paging")
    public String paging(Model model,
                         @RequestParam(value="page", required = false, defaultValue = "1")
                         int page)
    {
        log.info("page="+page);
        List<BoardDTO> pagingList = boardService.pagingList(page);
        System.out.println("pagingList = " + pagingList);
        PageDTO pageDTO = boardService.pagingParam(page);
        model.addAttribute("boardList",pagingList);
        model.addAttribute("paging",pageDTO);
        return "paging";
    }



}
