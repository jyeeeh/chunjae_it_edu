package kr.co.chunjae;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/exam02")
public class Example02Controller {

    //@ResponseBody -> view 필요 x
    @GetMapping
    public @ResponseBody Person submit(){

        Person person = new Person();
        person.setName("Jyeeeh");
        person.setAge("20");
        person.setEmail("jyeeeh@gmail.com");
        System.out.println(person);
        return person;

    }

}
