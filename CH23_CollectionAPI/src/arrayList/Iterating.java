package arrayList;

import java.util.ArrayList;

public class Iterating {
	public static void main(String[] args) {
		// 저장된 요소를 읽어오는 방법
		// 컬렉션을 반복하고 그 안의 데이터에 접근하기 위한 반복문?
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(7);
		list.add(9);
		list.add(123);
		
		//반복문 사용
		for(Integer n : list) {
			System.out.println(n);
		} // list에 저장되어 있는 값들을 순차적으로 변수 n에 대입하여 정수형이면 출력하는 for each문, 간단하게 값만 출력 
		System.out.println(); //한 칸 띄우기용 별 의미 없음
		
		for(int i = 0; i < list.size(); i++) {
			Integer n = list.get(i); // Integer n 변수에 list의 값을 get으로 인덱스 번호(i) 순서대로 return
			
			System.out.println(i + ": "+n);
		}	// index번호를 함께 출력하고 싶을 때는 for문 사용	
		System.out.println(); 
		
		// method reference
		// 메서드를 참조해서 매개변수의 정보 및 리턴 타입을 미리 알아내어, 매개변수를 생략하는 방식(람다식에서 사용)하는 방식의 표현법
		list.forEach(System.out::println); 
		// 대상::메소드, 대상에서 메소드의 정보 추출하여 익명 구현객체 생성(람다식처럼), 참조하는 메소드의 매개변수 생략 가능(?)
		// (::) = 메소드 참조
		// 컬랙션 객체.forEach(각각반복),람다식?
		System.out.println();
		
		// method reference, 람다식?
		list.forEach(e->{
			System.out.println(e);
		});
	}	
}
