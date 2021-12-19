package school;

public class Student {
	//변수
	private String name;
	private int age;
	private boolean isVisible; //집체 : true, 원격 : flase
	private double temperature;
		
	//생성자
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
		return "Student [이름=" + name + ", 나이=" + age + ", 집체=" + isVisible + ", 온도=" + temperature
				+ "]";
	}
	
	
	
	
}
