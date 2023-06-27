package exam06;

public class SystemMonitor {
	private int peroidTime;
	private SmsSender sender;
	
	public SystemMonitor(int peroidTime, SmsSender sender) {
		super();
		this.peroidTime = peroidTime;
		this.sender = sender;
	}
	public SystemMonitor() {
		super();
	}
	
	public void monitor() {
		System.out.print(peroidTime+"분 간격으로 ");
		sender.send();
	}
}
