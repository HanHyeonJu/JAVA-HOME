package toString;

public class Person {
	// Ŭ������ Ư���� �޼ҵ�(?)�� ��ü�� ����
	private String name;
	private double height;
	// ������ �޼ҵ� + ������ �Ű�����
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("�� ��� ����!");
	}
	
	public Person() {
		name = "�÷�";
		height = 25;
		System.out.println("�� ��� ����!");
	}// ���� appŬ�������� ���� �����ʰ� �⺻�����ڸ� �̿��� �⺻���� ���� �� �ִ�.
	
	
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
	
	public String toString() {
		String text = "�̸�: "+name+" Ű: "+height;
		return text;
	}
	
	
}
