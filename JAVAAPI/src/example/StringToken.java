package example;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// 입력 문자열
		String str = "치킨,피자,보쌈,족발,초밥,떡볶이,탕수육";
		
		//1. 구분자를 ","로 하는 StringTokenizer 객체를 생성
		StringTokenizer st = new StringTokenizer(str, ",");
		
		//2. 모든 토큰을 출력하시오
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken()); // 토큰을 하나 꺼내온 뒤 출력
		} // while문을 이용해서 토큰이 존재한다면 계속  출력 실행문을 반복하게 만들어 토큰을 모두 출력
	}

}
