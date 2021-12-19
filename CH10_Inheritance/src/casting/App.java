package casting;

public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new HouseCat();
		cat1.vocal(); 
		cat1.hunt();
		//cat1.call(); 실제 객체는 housecat이지만 상위클래스인 cat타입으로 업캐스팅이 되어 cat의 메소드만 사용이 가능하다.
		// 오버라이딩은 가능하기 때문에 cat1.vocal(); 에서 미야우~가 출력가능
		
		HouseCat cat2 = (HouseCat)cat1; //다운캐스팅(런타임 오류 일어날 수 있음)
		cat2.call();
		//하우스캣을 다시 다운 캐스팅해서 캣2에서는 콜이 출력가능
		
		

	}

}
