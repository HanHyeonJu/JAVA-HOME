
public class App {

	public static void main(String[] args) {
		// 스테틱 변수는 클래스명.변수로 객체 생성없이 사용
		// 주로 수학공식들은 스테틱 변수로 되어있음
		
		Cat cat1 = new Cat("칼린");
		System.out.println(cat1.toString());
		Cat cat2 = new Cat("마틸다");
		System.out.println(cat2.toString());
		Cat cat3 = new Cat("쿠파");
		System.out.println(cat3.toString());
		Cat cat4 = new Cat("순이");
		System.out.println(cat4);
		System.out.println(cat4.getCount()); // 스테틱 변수는 객체로도 사용가능? 실행가능 그냥 클래스로 바로 했을 때와 객체로 했을 때의 차이가 뭔데 노란거 왜 뜨는데 공유된다는게 무슨 말인데
		                                     
		
		System.out.println(Cat.FOOD); //스텍틱 상수
		System.out.println(Math.PI); // 수학공식 파이
		System.out.println(Cat.count); //getCount를 static변수를 만들어주었을 때 객체 필요없이 클래스만으로 실행이 된다는 걸 보여줌 
		

	}

}
