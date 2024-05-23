 package actions;

public class WhatsApp {
	
	public void send() {
		System.out.println("no argument Method :) ");
	}
	
	public void send(long number) {
		System.out.println("Sending Number "+number);
	}
	
	public void send(String sms) {
		System.out.println("Sending Sms "+sms);
	}
	
	public void send(double money) {
		System.out.println("Sending Money "+money);
	}

}
