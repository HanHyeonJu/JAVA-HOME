package question;

public class Q5 {

	public static void main(String[] args) {
		// 3*3 ���� �迭 (1,5,7)(9,6,3)(2,4,6)
		// for�� ��� ��ü ������ �� ����, total���� �� ���
		
		int[][] num = {
				{1,5,7},
				{9,6,3},
				{2,4,6},
		};
		
		int total = 0;
		
		for(int i =0; i < num.length; i++) {
			for(int j =0; j < num[i].length; j++) {
				total += num[i][j]; // num i j ���� �� �ص� ��?
				}
			System.out.println("������ : "+total);
		}
	}

}
