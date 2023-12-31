package polymorphism;

import org.springframework.stereotype.Component;

@Component("sony")
public class SonySpeaker implements Speaker{

	public SonySpeaker() {
		System.out.println("=> SonySpeaker 按眉积己");
	}
	
	public void volumeUp() {
		System.out.println("SonySpeaker-家府 棵府扁");
	}	
 
	public void volumeDown() {
		System.out.println("SonySpeaker-家府 临捞扁");
	}
		
}
