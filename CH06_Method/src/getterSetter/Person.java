package getterSetter;

public class Person {
	// �ν��Ͻ� ������ private Ÿ��(?)���� �����ϸ� ������ �������� ������ �Ұ�����, �� �� get set�Լ��� ���
	private String name;
	private int age;
	
	//get, set �޼ҵ�� �ν��Ͻ� ������ ����
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name; //this�� �ν��Ͻ� ������ ��Ÿ����.
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
