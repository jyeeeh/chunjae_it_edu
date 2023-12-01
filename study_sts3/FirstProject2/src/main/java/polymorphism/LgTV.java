package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	//Qualifier ���� ��ü �������ֱ�("LgTV.java" ���� �ٲ��ֱ�)
	//�ֳ����̼� ��ġ(���Ʒ�)�� �������
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("LgTV-����Ű��");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV-��������");
	}
	@Override
	public void volumeUp() {
//		System.out.println("LgTV-�Ҹ�Ű���");
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
//		System.out.println("LgTV-�Ҹ����̱�");
		speaker.volumeDown();
	}
}
