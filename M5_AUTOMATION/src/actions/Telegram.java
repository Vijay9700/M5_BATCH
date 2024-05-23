package actions;
public class Telegram {
	public String send() {
		String s1="No data found :) ";
		return s1;
	}
	public String send(String sms) {
		System.out.println("Sending message "+sms); //1
		return sms;
	}
	
	public long send(long num) {
		System.out.println("Sending number "+num); //1
		return num;
	}

}
