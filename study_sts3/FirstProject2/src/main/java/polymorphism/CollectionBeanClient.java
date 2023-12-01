package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		
		// 1. Spring 컨테이너를 구동
		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//CollectionBean으로 형변환
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");

	}

}
