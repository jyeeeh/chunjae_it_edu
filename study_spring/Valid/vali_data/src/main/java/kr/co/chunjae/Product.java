package kr.co.chunjae;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class Product {

    @NotNull
    @Size(min=4, max=10, message = "4~10자 이내로 입력해주세요")
    private String name;

    @Min(value = 0)
    private int price;


}
