package kr.co.chunjae;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Example03Exception extends RuntimeException{

    private String errMsg; //에러메세지


    //생성자 + getter,setter
    public Example03Exception() {
        super();
        this.errMsg = "Example03Exception 메세지입니다";
    }

}
