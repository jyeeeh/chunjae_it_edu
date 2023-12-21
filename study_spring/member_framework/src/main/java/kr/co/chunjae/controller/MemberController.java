package kr.co.chunjae.controller;

import kr.co.chunjae.dto.MemberDTO;
import kr.co.chunjae.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
@Log4j2
public class MemberController {

    private final MemberService memberService;

    //회원가입 (get,post)
    @GetMapping("/save")
    public String saveForm(){
        return "save";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute MemberDTO memberDTO){
        int saveResult = memberService.save(memberDTO);
        if(saveResult>0){
            //데이터가 있으면 login.jsp 로
            return "login";
        }else{
            //데이터가 없으면 save.jsp로
            return "save";
        }
    }

    //로그인 (get,post)
    @GetMapping("/login")
    public String loginForm(){
        //login.jsp 로 이동
        return "login";
    }

    //로그인버튼 클릭
    //세션 필요
    @PostMapping("/login")
    public String login(@ModelAttribute MemberDTO memberDTO, HttpSession session){
        //로그인 결과
        boolean loginResult = memberService.login(memberDTO);
        if(loginResult){
            //성공 시 MemberEmail만 세션에 저장
            session.setAttribute("loginEmail",memberDTO.getMemberEmail());
            //main 으로 이동
            return "main";
        }else {
            //실패
            return "login";
        }
    }

    //[조회] 데이터를 가져와야하니까 -> Model model
    @GetMapping("/")
    public String findAll(Model model){
        List<MemberDTO> memberDTOList = memberService.findAll();
        model.addAttribute("memberList",memberDTOList);
        return "list";
    }

    //ex) member?id=1
    @GetMapping
    public String findById(@RequestParam("id") Long id, Model model){
        log.info(id);
        MemberDTO memberDTO = memberService.findById(id);
        model.addAttribute("member",memberDTO);
        return "detail";
    }


}
