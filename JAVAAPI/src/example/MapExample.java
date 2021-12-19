package example;

import java.util.HashMap;
// Map : 키와 값의 쌍으로 객체를 저장, 표현의 예로는 사전이나 단어장을 생각하면 됨

public class MapExample {

	public static void main(String[] args) {
		// HashMap : Map의 형태 중 정렬이 되지 않는 형태의 Map
		// 1. 이름을 키로, 이메일은 값으로 담을 HashMap
		HashMap<String, String> emails = new HashMap<String, String>();
		
		// 2. HashMap에 담을 데이터를 저장하시오
		emails.put("나리", "nari@cloudstudying.kr");
		emails.put("정애", "jungae@cloudstudying.kr");
		emails.put("홍팍", "sehong@cloudstudying.kr");
		
		// 3. key 목록 출력
		System.out.println("\n== key set ==");
		for(String key : emails.keySet()) {
			System.out.println(key);
		}
		
		// 4. value 목록 출력
		System.out.println("\n== value set ==");
		for(String value : emails.values()) {
			System.out.println(value);
		}
	}
}
