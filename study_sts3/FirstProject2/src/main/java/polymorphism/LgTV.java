package polymorphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	//Qualifier 에서 객체 지정해주기("LgTV.java" 에서 바꿔주기)
	//애너테이션 위치(위아래)는 상관없음
	@Autowired
	@Qualifier("apple")
	private Speaker speaker;
	
	@Override
	public void powerOn() {
		System.out.println("LgTV-전원키기");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV-전원끄기");
	}
	@Override
	public void volumeUp() {
//		System.out.println("LgTV-소리키우기");
		speaker.volumeUp();
	}
	@Override
	public void volumeDown() {
//		System.out.println("LgTV-소리줄이기");
		speaker.volumeDown();
	}
}
