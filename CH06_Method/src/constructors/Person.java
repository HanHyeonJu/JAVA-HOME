package constructors;

public class Person {
	// Ŭ������ Ư���� �޼ҵ�(?)�� ��ü�� ����
	private String name;
	private double height;
	// ������ �޼ҵ� : public Ŭ������(), ����Ÿ�� X
	//public Person(){} : �⺻������
	public Person() {
		System.out.println("�� ��� ����!");
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
