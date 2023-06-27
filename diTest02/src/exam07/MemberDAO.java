package exam07;

//MemberDAO 객체를 생성하는 스프링 환경설정을 만들고 
//그것을 확인하는 메인 메소드를 작성하여 결과를 확인
public class MemberDAO {
	private String dbms;
	private Member member;
	
	public MemberDAO(String dbms, Member member) {
		super();
		this.dbms = dbms;
		this.member = member;
	}
	
	public MemberDAO() {
		super();
	}
	
	public void insert() {
		System.out.println("dbms: "+dbms+"에 등록하였습니다.");
		member.info();
	}
}
