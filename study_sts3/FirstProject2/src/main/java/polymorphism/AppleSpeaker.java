package polymorphism;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("apple")
public class AppleSpeaker implements Speaker {
	public AppleSpeaker() {
		System.out.println("=> AppleSpeaker 按眉积己");
	}
	
	public void volumeUp() {
		System.out.println("AppleSpeaker-家府 棵府扁");
	}	

	public void volumeDown() {
		System.out.println("AppleSpeaker-家府 临捞扁");
	}
}
