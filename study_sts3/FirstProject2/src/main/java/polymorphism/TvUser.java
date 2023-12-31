package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TvUser {
	public static void main(String[] args) {
	

		// 1. Spring 컨테이너를 구동
		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
		
		// 2. Spring 컨테이너로 부터 필요한 요청(Lookup)
		TV tv = (TV)factory.getBean("tv");
		
		/*
  		TV tv2 = (TV)factory.getBean("tv");
		TV tv3 = (TV)factory.getBean("tv");
		*/
	
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
		
		
		//3. Spring 컨테이너를 종료
		factory.close();

				
	}	
}
