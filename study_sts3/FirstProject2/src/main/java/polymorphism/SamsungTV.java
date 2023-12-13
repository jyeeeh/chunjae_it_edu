package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("samsungTV 객체생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("-->setSpeaker(호출)");	
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("-->setPrice(호출)");	
		this.price = price;
	}
	
//	public void initMethod() {
//		System.out.println("객체 초기화 작업 처리");
//	}
//	
//	public void destroyMethod() {
//		System.out.println("객체 삭제 전 처리할 로직 처리");
//	}
//	
	public void powerOn() {
		System.out.println("samsung-전원키기 / (가격:"+ price + ")");
	}
	
	public void powerOff() {
		System.out.println("samsung-전원끄기");
	}
	
	public void volumeUp() {
		System.out.println("samsung-소리키우기");
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		System.out.println("samsung-소리줄이기");
		speaker.volumeDown();
		
	}
}
