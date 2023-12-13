package polymorphism;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CollectionBeanClient {

	public static void main(String[] args) {
		
		// 1. Spring �����̳ʸ� ����
		AbstractApplicationContext factory=
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//CollectionBean���� ����ȯ
		CollectionBean bean = (CollectionBean) factory.getBean("collectionBean");
		//addressList = applicationContext property name="addressList" < name �̸��� �����ϰ� �����ؾ���
		List<String> addressList = bean.getAddressList();
		
		for(String address : addressList) {
			System.out.println(address.toString());
		}
		
		factory.close();
	}

}
