package kr.co.chunjae;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exam03")
public class Example03Controller {

    //@ResponseBody 삭제 후 @Controller -> @RestController 변경
    //@RestController = Controller+ResponseBody => JSON 형태 반환
    @GetMapping
    public Person submit(){

        Person person = new Person();
        person.setName("Jyeeeh");
        person.setAge("20");
        person.setEmail("jyeeeh@gmail.com");
        System.out.println(person);
        return person;

    }

}
