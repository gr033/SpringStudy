package exam06;

public class SmsSender {
	private String from;
	private String to;
	public SmsSender(String from, String to) {
		super();
		this.from = from;
		this.to = to;
	}
	
	public SmsSender() {
		super();
	}
	
	public void send() {
		System.out.println(from+"이 "+to+"에게 메세지를 전송하였습니다.");
	}
}	
