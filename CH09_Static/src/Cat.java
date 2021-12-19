
public class Cat {
	private String name; //이름
	private int id;
	
	//스테틱 상수
	public static final String FOOD = "고양이 사료";
	//스테틱 변수
	static int count = 0;//카운트 초기값 0

	
	public Cat(String name) { //Cat의 기본 생성자 
		this.name = name;
		id = count;
		count++;// 객체 생성시 count추가
	}


	


	@Override
	public String toString() {
		return "Cat [name=" + name + ", id=" + id + "]";
	}





	public static int getCount() { // count값을 리턴 시켜줌
		return count;			   // 스테틱 매소드는 일반 인스턴스 변수 사용불가
	}
	
}
