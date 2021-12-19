package constructors;

public class Person {
	// 클래스의 특별한 메소드(?)로 객체를 생성
	private String name;
	private double height;
	// 생성자 메소드 : public 클래스명(), 리턴타입 X
	//public Person(){} : 기본생성자
	public Person() {
		System.out.println("한 사람 생성!");
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
