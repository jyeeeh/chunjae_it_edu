# ErrorHandling

날짜: 2024년 1월 24일

- ErrorController
- ExeptionHandler
- ControllerAdvice(우선순위1)


**For**

보안, 다양한 Exception처리


**1. ErrorController**

```java
package kr.co.sloop.daily.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DailyErrorController implements ErrorController {

    @GetMapping("/error")
    public String handlerError() throws Exception{
        return "/error"; //커스텀 에러페이지 경로
    }
}
```


**2. ExeptionHandler** - 한 컨트롤러내에서 잡고싶은 Exception 설정



```java
@Target(ElementType.METHOD)
//...

@GetMapping("/check/exception") <- 없어도 O
	@ExceptionHandler(value = Exception.class)
	public String whtToDoException() throws Exception{
		return "notfound";
	}
```

: 단점) 컨트롤러마다 설정해주기 때문에 유지보수성이 힘듬(수정할 때 각각 수정해야함)



**3. @ControllerAdvice**

 *`By default, the methods in an {@code @ControllerAdvice} apply globally to all controllers.`*

*@ResponseStatus(HttpStatus.FORBIDDEN) 으로 500이더라도 404로 발생시킬수있음

---

**Error 와 Exception 차이**

Error : 컴퓨터가 발생(컴파일링을 하면서)

Exception : 개발자가 발생
