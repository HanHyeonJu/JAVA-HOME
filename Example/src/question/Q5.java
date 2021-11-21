package question;

public class Q5 {

	public static void main(String[] args) {
		// 3*3 정수 배열 (1,5,7)(9,6,3)(2,4,6)
		// for문 사용 전체 숫자의 합 구함, total값에 합 출력
		
		int[][] num = {
				{1,5,7},
				{9,6,3},
				{2,4,6},
		};
		
		int total = 0;
		
		for(int i =0; i < num.length; i++) {
			for(int j =0; j < num[i].length; j++) {
				total += num[i][j]; // num i j 선언 안 해도 됨?
				}
			System.out.println("총합은 : "+total);
		}
	}

}
