package kr.co.chunjae;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class PersonValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Person.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        //target 형태를 (Person)의 형태로 강제 형변환 -> casting
        Person person = (Person) target;
        String name = person.getName();
        if(name==null||name.trim().isEmpty()){
            errors.rejectValue("name", "name.not.empty");
        }

        String age = person.getAge();
        if(age==null||age.trim().isEmpty()){
            errors.rejectValue("age", "age.not.inrange");
        }

        String email = person.getEmail();
        if(email==null||email.trim().isEmpty()){
            errors.rejectValue("email", "email.not.correct");
        }
    }
}
