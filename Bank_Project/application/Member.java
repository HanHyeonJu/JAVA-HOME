package application;
//ȸ�� Ŭ����
public class Member {

	private String name; // ȸ���� �̸�
	private String id; // ȸ�� ���̵�
	private String password; // ȸ�� ��й�ȣ
	
	public Member() {
		
	}
	
	public Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public boolean success(String id, String password) { // ���̵�� ��й�ȣ ��ΰ� ���� ��� true �ƴ� ��� false�� return�� �޼ҵ� �ʿ�
		boolean value = false;
		if(this.id.equals(id) && this.password.equals(password)) { // ��� Ŭ������ �ν��Ͻ� ������ ���� �� ���̵�� ��й�ȣ�� ����ڰ� �Է��� ���̵�� ��й�ȣ�� ���ؾ� �ϱ� ������ this ���
			value = true;
		}
		return value;
	}
	
	// �α��� �Ŀ� ���� ������ �� �� �ֵ��� �����ִ� �޼ҵ�
	public void memberdisplay() { 
		System.out.println("ID : " + id);
		System.out.println("���� : "+ name);
		
	            }
	
	// private ���� ������ ���� get, set�޼ҵ� ����
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
