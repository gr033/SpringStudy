package exam14;

public class JobExecutor {
	public JobExecutor(String name, int seconds) {
		System.out.println("생성자 호출1");
	}
	
	public JobExecutor(String name, long seconds) {
		System.out.println("생성자 호출2");
	}
	public JobExecutor(String name, String seconds) {
		System.out.println("생성자 호출3");
	}
}
