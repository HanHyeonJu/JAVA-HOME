package overridingMethod;

public class HouseCat extends Cat {
	@Override // 오버라이딩 했다고 표시(어노테이션)
	public void vocal() { // 오버라이딩, 상속받은 고양이 클래스의 메소드이름과 틀리면 오버라이딩 안 됨
		System.out.println("미야우~");
	}
}
