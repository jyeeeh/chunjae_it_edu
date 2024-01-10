package kr.co.chunjae;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Example02Controller {

    @GetMapping("/exam02")
    public void handleRequest() throws Exception{
       throw new Exception(new Example02Exception("Example02Exception 메세지입니다"));
    }
}
