## [RESTful 웹 서비스]

### [결과]

| <@RequestBody 적용> 입력 |   결과 |
| --- | --- |
|![Untitled](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/d75d280e-bc2f-4a05-894d-1a1d54f25aac) |![Untitled 1](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/1c69ad54-e79c-45e3-8f45-5ce6f682eaa8)|

<br>


| @RequestBody + JSON 전달 결과 |
| --- |
|![Untitled 2](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/f00aae16-762d-42fd-99c6-267bfb0e5481)|
<br>

| @RestController 결과 |
| --- |
|![Untitled 3](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/b2e4bd43-caf2-4dce-8622-77503533b6ad)|
<br>

### [TIL]

**초기설정**

```xml
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.9.10</version>
		</dependency>
		<!-- https://mvnrepository.com/artifact/org.codehaus.jackson/jackson-mapper-asl -->
		<dependency>
			<groupId>org.codehaus.jackson</groupId>
			<artifactId>jackson-mapper-asl</artifactId>
			<version>1.9.13</version>
		</dependency>
```

pom.xml에 라이브러리 추가(JSON 형태로 데이터 주고받기 위함)

REST 구성 요소 : 리소스(URI) / 메서드 / 리소스 형태(JSON,XML, 등)

| 애너테이션 |  |
| --- | --- |
| @RestController | @Controller+@ResponseBody |
| @RequestBody | 요청된 HTTP 요청 body를 해당 매개변수에 바인딩 |
| @ResponseBody | 반환 값을 응답 HTTP 응답 body에 바인딩 |

**@RequestBody** 사용 이유 : XML, JSON처럼 형식을 갖춘 문자열 형태라면 @RequestParam, @ModelAttribute 로 전달받을 수 없음
