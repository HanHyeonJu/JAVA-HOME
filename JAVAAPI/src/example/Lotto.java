package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lotto {

	public static void main(String[] args) {
		// 45���� �� �����
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		for(int i = 1; i <= 45; i++) {
			numbers.add(i); // 1 ~45 
		} // for���� �̿��ؼ� numbers�� 1~45���� ���� �������.
		
		// ���´�
		Collections.shuffle(numbers);
		
		// �̴´�
		int[] picked = new int[6];
		for(int i = 0; i < 6; i++) { // numbers�� ����ִ� ���� 6���� ���ڸ� ������
			picked[i] = numbers.get(i);
		}
		
		System.out.printf("�ڵ� ���� ��ȣ : %s", Arrays.toString(picked));
	}

}// �׳� toString�ϸ� �迭�� ���� �ƴ� �ּҰ� ��µǱ� ������ ������ ����ϱ� ���� Arrays.toString()���
