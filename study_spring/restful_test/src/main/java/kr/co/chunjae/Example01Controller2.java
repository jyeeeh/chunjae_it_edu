package kr.co.chunjae;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;

@Controller
public class Example01Controller2 {

    @GetMapping("/json")
    public String showForm(){
        return "webpage14_02";
    }

    @PostMapping("/test")
    public void submit(@RequestBody HashMap<String, Object> map){
        System.out.println(map);
    }

}
