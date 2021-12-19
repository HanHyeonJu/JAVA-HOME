package arrayList;

import java.util.ArrayList;

public class Iterating {
	public static void main(String[] args) {
		// ����� ��Ҹ� �о���� ���
		// �÷����� �ݺ��ϰ� �� ���� �����Ϳ� �����ϱ� ���� �ݺ���?
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(7);
		list.add(9);
		list.add(123);
		
		//�ݺ��� ���
		for(Integer n : list) {
			System.out.println(n);
		} // list�� ����Ǿ� �ִ� ������ ���������� ���� n�� �����Ͽ� �������̸� ����ϴ� for each��, �����ϰ� ���� ��� 
		System.out.println(); //�� ĭ ����� �� �ǹ� ����
		
		for(int i = 0; i < list.size(); i++) {
			Integer n = list.get(i); // Integer n ������ list�� ���� get���� �ε��� ��ȣ(i) ������� return
			
			System.out.println(i + ": "+n);
		}	// index��ȣ�� �Բ� ����ϰ� ���� ���� for�� ���	
		System.out.println(); 
		
		// method reference
		// �޼��带 �����ؼ� �Ű������� ���� �� ���� Ÿ���� �̸� �˾Ƴ���, �Ű������� �����ϴ� ���(���ٽĿ��� ���)�ϴ� ����� ǥ����
		list.forEach(System.out::println); 
		// ���::�޼ҵ�, ��󿡼� �޼ҵ��� ���� �����Ͽ� �͸� ������ü ����(���ٽ�ó��), �����ϴ� �޼ҵ��� �Ű����� ���� ����(?)
		// (::) = �޼ҵ� ����
		// �÷��� ��ü.forEach(�����ݺ�),���ٽ�?
		System.out.println();
		
		// method reference, ���ٽ�?
		list.forEach(e->{
			System.out.println(e);
		});
	}	
}
