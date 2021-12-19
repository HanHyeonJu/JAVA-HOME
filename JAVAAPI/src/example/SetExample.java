package example;

import java.util.TreeSet;

//Set은 집합의 형태로 객체를 저장, 저장 시 그 순서를 유지하지 않으며 같은 요소의 중복을 허락하지 않음

public class SetExample {

	public static void main(String[] args) {
		//TreeSet : 정렬이 되어서 저장되는 Set의 형태 
		// 1. String 저장을 위한 TreeSet객체 생성
		TreeSet<String> names =  new TreeSet<String>();
		
		// 객체 추가
		names.add("Daniel");
		names.add("Brian");
		names.add("Eugene");
		names.add("Adam");
		names.add("Cate");
		
		// 정보 출력
		System.out.printf("names.size() -> %d\n",names.size()); // names의 크기
		System.out.printf("names.first() -> %s\n", names.first()); // names의 첫 요소
		System.out.printf("names.last() -> %s\n", names.last()); // names의 끝 요소
		
		// Set의 모든 요소 출력
		System.out.println("==for each 구문 출력==");
		for(String str : names) {
			System.out.println(str);
		}
		
	}

}
