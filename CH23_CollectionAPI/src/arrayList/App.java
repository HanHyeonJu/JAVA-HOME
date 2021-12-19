package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// 제네틱 타입을 이용한 ArrayList
		ArrayList<Integer> list = new ArrayList<>(); // 정수타입의 ArrayList 배열 생성
		
		//리스트에 정수추가
		list.add(7);
		list.add(9);
		list.add(123);
		
		//get으로 인덱스번호 리턴
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}

}
