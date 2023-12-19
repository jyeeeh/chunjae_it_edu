package com.springmvc.chap06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class Example02Controller {

    @GetMapping("/exam02/{category}/")
    public String requestMethod(@PathVariable String bookId, Model model){
        System.out.println("도서 ID : "+bookId);
        return "webpage06";
    }
}
