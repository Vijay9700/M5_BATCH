package actions;

public class TelegramDriver {

	public static void main(String[] args) {
		Telegram t1=new Telegram ();
		String sms=t1.send("Hi Student");
		System.out.println(sms);
		//String sms=t1.send("Hello friends");

	}

}
