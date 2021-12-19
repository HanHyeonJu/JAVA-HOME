package school;

public class App {

	public static void main(String[] args) {
		// 1. 변수 2. 생성자 3. 게터세터 4. toString
		Student s1 = new Student("펭수", 7);
		Student s2 = new Student("순이", 7);
		Student s3 = new Student("시학", 7);
		Student s4 = new Student("도치", 7);
		
		s1.setIsVisible(false); // 펭수는 원격
		s2.setTemperature(36.2); // 순이 열 체크했더니 온도 36.2
		s3.setTemperature(35.6);
		s4.setIsVisible(false);
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		
		
		
		

	}

}
