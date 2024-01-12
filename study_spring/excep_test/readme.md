## [예외처리]

### [결과]
| @ResponseStatus 선언 전| 후 |
| --- | --- |
|![Untitled](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/549e93ea-bcab-415c-9533-1d4a1dcf2497)|![Untitled 1](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/5b03dd22-15cb-42ab-b62d-f1f5e6ed8a56)|


| @ExceptionHandler | @ControllerAdvice |
| --- | --- |
|![Untitled](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/549e93ea-bcab-415c-9533-1d4a1dcf2497)|![Untitled 1](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/5b03dd22-15cb-42ab-b62d-f1f5e6ed8a56)|

<br>

### [TIL]

- 에러의 종류
1. 오타 → (해결)컴파일러
2. 논리적오류 → 디버깅 툴
3. 실행오류 → 예외처리(Exception / throw)

- 예외처리
1. 상태보고
2. 컨트롤 내부(특정 영역)
3. 컨트롤 외부(전체에 영향)

| 애너테이션 |  |
| --- | --- |
| @ExceptionHandler | 특정 영역(컨트롤러 안에) 예외처리 위함 |
| @ControllerAdvice | 여러 컨트롤러에서 발생하는 오류 공통점을 묶어 예외처리 |
| @ResponseStatus | 발생한 예외를 HTTP 상태 코드로 매핑시켜 응답 |

<br>

### [오류발생]

1. Request processing failed; nested exception is kr.co.chunjae.Example03Exception

→ `@ExceptionHandler(Example03Exception.class)` 클래스 설정 오류

<br>
<br>

## [Log4j]



### [결과]

| Log4j 로깅 레벨 동작 |
| --- |
|![Untitled](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/9b51a829-9ae3-4c7f-a76c-3712add8228a)|


### [설정]

- resources/log4j.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE log4j:configuration PUBLIC "-//APACHE//DTD LOG4J 1.2//EN" "log4j.dtd">
<log4j:configuration xmlns:log4j="http://jakarta.apache.org/log4j/">
```

변경 전

```xml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE log4j:configuration PUBLIC "-//APACHE//DTD LOG4J 1.2//EN" "http://logging.apache.org/log4j/1.2/apidocs/org/apache/log4j/xml/doc-files/log4j.dtd">
<log4j:configuration>
```

변경 후

```xml
<properties>
		<java-version>11</java-version>
		<org.springframework-version>5.3.29</org.springframework-version>
		<org.aspectj-version>1.9.6</org.aspectj-version>
		<org.slf4j-version>1.7.25</org.slf4j-version>
	</properties>
```

pom.xml에 <org.slf4j-version> 확인

## [TIL]

<**Log4j**>

- 시스템 성능에 큰 영향을 미치지 않으면서 선택적인 로그를 남김

- 레이아웃 확인 → log4j.xml 에 <!— Appenders —> 부분

![Untitled 1](https://github.com/jyeeeh/chunjae_it_edu/assets/145963612/69068f3f-e18e-433c-a0f7-1402396083e0)

| 클래스 |  |
| --- | --- |
| PatternLayout  | 로그 정보 사용자 정의 패턴에 따라 기록 |
* %c : 카테고리 출력
* %m : 로그 내용
* %n  : 개행 
- @SLF4J - 사용 시 선언 코드 생략 가능

<**log4j 파일 저장 - 로그 파일 저장>**

- log4j.xml 에 아래 추가

```xml
<!-- 날짜별 로그 파일 생성 -->
	<appender name="rollingFile"
			  class="org.apache.log4j.DailyRollingFileAppender">
		<param name="File" value="E:/project_logs/log.log" />
		<param name="Append" value="true" /> <!-- param name="MaxFileSize" value="100MB"/ --> <!-- param name="MaxBackupIndex" value="2"></param -->
		<param name="DatePattern" value="'.'yyyy-MM-dd" />
		<layout class="org.apache.log4j.PatternLayout">
			<param name="ConversionPattern" value="%d %p [%C{10}] %m %n" />
		</layout>
	</appender>

<!-- Root Logger -->
	<root>
		<priority value="warn" />
		<appender-ref ref="console" />
		<appender-ref ref="rollingFile" />
		<appender-ref ref="errFile" />
	</root>
```
