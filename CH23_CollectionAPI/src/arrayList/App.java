package arrayList;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// ����ƽ Ÿ���� �̿��� ArrayList
		ArrayList<Integer> list = new ArrayList<>(); // ����Ÿ���� ArrayList �迭 ����
		
		//����Ʈ�� �����߰�
		list.add(7);
		list.add(9);
		list.add(123);
		
		//get���� �ε�����ȣ ����
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));

	}

}
