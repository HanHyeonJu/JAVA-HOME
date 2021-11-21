package application;

public class LookArray {

	public static void main(String[] args) {
		// for 반복문과 문자열의 인덱스 i를 이용해 문자열의 첫번째부터 끝까지 출력
		String[] animals = {"개","고양이","닭","사자","양","말"};
		for(int i = 0; i < 3; i++) {
			System.out.println(animals[i]);
		}
		
		
		
		for(int i = 0; i < animals.length; i++) {
//			System.out.println(animals[i]);
			System.out.printf("인덱스 %d : %s \n", i, animals[i]);
		}
// 자바스크립트처럼 자바는 그 때 그 때 인덱스를 추가할 수 없고 처음 선어한 배열 고정됨(?)
// 초기 선언을 바꾸는 방법 말고는 new 함수를 사용해서 배열칸을 추가한다.
	}

}
