package polymorphism;

public class SamsungTV implements TV {

	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("samsungTV ��ü����");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("-->setSpeaker(ȣ��)");	
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("-->setPrice(ȣ��)");	
		this.price = price;
	}
	
//	public void initMethod() {
//		System.out.println("��ü �ʱ�ȭ �۾� ó��");
//	}
//	
//	public void destroyMethod() {
//		System.out.println("��ü ���� �� ó���� ���� ó��");
//	}
//	
	public void powerOn() {
		System.out.println("samsung-����Ű�� / (����:"+ price + ")");
	}
	
	public void powerOff() {
		System.out.println("samsung-��������");
	}
	
	public void volumeUp() {
		System.out.println("samsung-�Ҹ�Ű���");
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		System.out.println("samsung-�Ҹ����̱�");
		speaker.volumeDown();
		
	}
}
