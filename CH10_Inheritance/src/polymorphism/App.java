package polymorphism;
// 다형성 : 자식 클래스 타입을 부모 타입으로 형 변환
public class App {

	public static void main(String[] args) {
		// 모두 Cat 클래스를 상속받았기 때문에 Cat 클래스로 선언가능
		Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		Cat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Cat cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		
		// Cat 클래스의 배열 cats를 만들어 사용해보기
		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger()};
		
		cats[0].vocal();
		cats[0].hunt();
		
		cats[1].vocal();
		cats[1].hunt();
		
		cats[2].vocal();
		cats[2].hunt();
		
		//반복문 사용
		for(int i =0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		//for each 반복문
		for(Cat cat : cats) {
			cat.vocal();
			cat.hunt();
		}
		
		//기본형의 캐스팅(형변환)
		//int a = 1.2345; //에러
		int b = (int)1.2345; // 캐스팅 => 변환은 되지미나 데이터가 잘림
		System.out.println(b);
		
		//참조형의 캐스팅
		//업캐스팅
		Cat cat4 = new HouseCat(); // 자식클래스인 housecat을 부모클래스인 cat으로 형변환
		//다운 캐스팅 : 업캐스팅된 객체를 다시 다운캐스팅
		HouseCat cat5 = (HouseCat)cat4;
		
	}

}
