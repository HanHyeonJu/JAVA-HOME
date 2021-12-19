package school;

public class Student {
	//����
	private String name;
	private int age;
	private boolean isVisible; //��ü : true, ���� : flase
	private double temperature;
		
	//������
	public Student(String name, int age) {
		
		this.name = name;
		this.age = age;
		this.isVisible = true;
		this.temperature = 0;
	}
	
	// set, get
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean IsVisible() {
		return isVisible;
	}
	public void setIsVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	//toString
	@Override
	public String toString() {
		return "Student [�̸�=" + name + ", ����=" + age + ", ��ü=" + isVisible + ", �µ�=" + temperature
				+ "]";
	}
	
	
	
	
}
