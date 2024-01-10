# 유효성 검사

[설정]

pom.xml에 버전확인

```xml
<!-- https://mvnrepository.com/artifact/jakarta.validation/jakarta.validation-api -->
		<dependency>
			<groupId>jakarta.validation</groupId>
			<artifactId>jakarta.validation-api</artifactId>
			<version>2.0.2</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.hibernate.validator/hibernate-validator -->
		<dependency>
			<groupId>org.hibernate.validator</groupId>
			<artifactId>hibernate-validator</artifactId>
			<version>6.1.5.Final</version>
		</dependency>
```
pom.xml

```java
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
    @Size(min=4, max=10)
    private String name;

    @Min(value = 0)
    private int price;

}
```
Product.java
```java
NotNull.Product.name=\uAC12\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694
Min.Product.price=0 \uC774\uC0C1\uC758 \uAC12\uC744 \uC785\uB825\uD574\uC8FC\uC138\uC694
```
messages.properties


## [결과]

![Untitled](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/00fd3741-5977-42e0-89cb-ec314197eb85)

webpage13_01 결과

---

![Untitled 1](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/dc5526f8-1eb1-4d4d-84de-51bcf492e5e6)

webpage13_03 결과

## [TIL]

자바 : jsr-380

스프링 : @Valid

스프링부트 : @Valid, @Validated

| 이름 | 용도 |
| --- | --- |
| @Component | 스프링등록 |
| @InitBinder | @InitBinder가 선언된 메서드에 Validator 미리 등록하면 해당 컨트롤러 모든 메서드에서 유효성 검사 기능 사용 가능 |

## [오류발생]

1. 유효성 검사 미진행

→ @Valid 선언 누락
