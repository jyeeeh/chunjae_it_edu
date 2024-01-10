package kr.co.chunjae;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogExample01Controller {

    //Log4j Example
    //Log4j 로깅 레벨 동작
    public static Logger logger = LoggerFactory.getLogger(LogExample01Controller.class);

    @GetMapping("/logExam01")
    public String requestLogMethod(Model model){
        logger.trace("Trace 메세지");
        logger.debug("Debug 메세지");
        logger.info("Info 메세지");
        logger.warn("Warn 메세지");
        logger.error("Error 메세지");
        return "webpage11_01";
    }


}
