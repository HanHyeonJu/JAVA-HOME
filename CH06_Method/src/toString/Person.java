package toString;

public class Person {
	// 클래스의 특별한 메소드(?)로 객체를 생성
	private String name;
	private double height;
	// 생성자 메소드 + 생성자 매개변수
	public Person(String name, double height) {
		this.name = name;
		this.height = height;
		System.out.println("한 사람 생성!");
	}
	
	public Person() {
		name = "시로";
		height = 25;
		System.out.println("한 사람 생성!");
	}// 굳이 app클래스에서 값을 넣지않고 기본생성자를 이용해 기본값을 넣을 수 있다.
	
	
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
		String text = "이름: "+name+" 키: "+height;
		return text;
	}
	
	
}
