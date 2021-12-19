package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lotto {

	public static void main(String[] args) {
		// 45개의 공 만들기
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 1; i <= 45; i++) {
			numbers.add(i); // 1 ~45 
		} // for문을 이용해서 numbers에 1~45번의 공을 만들었다.
		
		// 섞는다
		Collections.shuffle(numbers);
		
		// 뽑는다
		int[] picked = new int[6];
		for(int i = 0; i < 6; i++) { // numbers에 들어있는 앞의 6개의 숫자를 가져옴
			picked[i] = numbers.get(i);
		}
		
		System.out.printf("자동 생성 번호 : %s", Arrays.toString(picked));
	}

}// 그냥 toString하면 배열의 값이 아닌 주소가 출력되기 때문에 내용을 출력하기 위해 Arrays.toString()사용
