package example;

import java.util.TreeSet;

//Set�� ������ ���·� ��ü�� ����, ���� �� �� ������ �������� ������ ���� ����� �ߺ��� ������� ����

public class SetExample {

	public static void main(String[] args) {
		//TreeSet : ������ �Ǿ ����Ǵ� Set�� ���� 
		// 1. String ������ ���� TreeSet��ü ����
		TreeSet<String> names =  new TreeSet<String>();
		
		// ��ü �߰�
		names.add("Daniel");
		names.add("Brian");
		names.add("Eugene");
		names.add("Adam");
		names.add("Cate");
		
		// ���� ���
		System.out.printf("names.size() -> %d\n",names.size()); // names�� ũ��
		System.out.printf("names.first() -> %s\n", names.first()); // names�� ù ���
		System.out.printf("names.last() -> %s\n", names.last()); // names�� �� ���
		
		// Set�� ��� ��� ���
		System.out.println("==for each ���� ���==");
		for(String str : names) {
			System.out.println(str);
		}
		
	}

}
