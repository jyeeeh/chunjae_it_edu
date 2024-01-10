package kr.co.chunjae;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/exam04")
public class Example04Controller {

    //ResponseEntity -
    @GetMapping
    public ResponseEntity<Person> submit(){

        Person person = new Person();
        person.setName("Jyeeeh");
        person.setAge("20");
        person.setEmail("jyeeeh@gmail.com");
        System.out.println(person);
        return new ResponseEntity("person", HttpStatus.BAD_REQUEST);

    }

}
