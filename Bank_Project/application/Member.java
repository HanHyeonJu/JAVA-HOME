package application;
//회원 클래스
public class Member {

	private String name; // 회원의 이름
	private String id; // 회원 아이디
	private String password; // 회원 비밀번호
	
	public Member() {
		
	}
	
	public Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public boolean success(String id, String password) { // 아이디와 비밀번호 모두가 맞을 경우 true 아닐 경우 false를 return할 메소드 필요
		boolean value = false;
		if(this.id.equals(id) && this.password.equals(password)) { // 멤버 클래스의 인스턴스 변수에 저장 된 아이디와 비밀번호와 사용자가 입력한 아이디와 비밀번호를 비교해야 하기 때문에 this 사용
			value = true;
		}
		return value;
	}
	
	// 로그인 후에 고객의 정보를 볼 수 있도록 보여주는 메소드
	public void memberdisplay() { 
		System.out.println("ID : " + id);
		System.out.println("성함 : "+ name);
		
	            }
	
	// private 변수 접근을 위해 get, set메소드 생성
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
