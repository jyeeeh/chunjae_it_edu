package polymorphism;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� ����
		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//CollectionBean���� ����ȯ
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");

	}

}
