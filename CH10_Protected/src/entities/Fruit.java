package entities;

public class Fruit {
	protected int id; // protected : 같은 패키지에 있는 클래스들에서만 사용가능할 수 있게 만드는 접근지정자

	@Override
	public String toString() {
		return "Fruit [id=" + id + "]";
	}

	
}
