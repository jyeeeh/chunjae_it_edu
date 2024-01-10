package kr.co.chunjae;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class Example01Controller {

    @GetMapping("/exam01")
    @ResponseStatus(value= HttpStatus.BAD_REQUEST, reason = "요청 실패했습니다")
    public String requestMethod(Model model){
        System.out.println("chapter10_01 예제");
        model.addAttribute("data", "@ResponseStatus 처리 예제");
        return "webpage10_01";
    }
}
