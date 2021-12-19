package example;

import java.util.HashMap;
// Map : Ű�� ���� ������ ��ü�� ����, ǥ���� ���δ� �����̳� �ܾ����� �����ϸ� ��

public class MapExample {

	public static void main(String[] args) {
		// HashMap : Map�� ���� �� ������ ���� �ʴ� ������ Map
		// 1. �̸��� Ű��, �̸����� ������ ���� HashMap
		HashMap<String, String> emails = new HashMap<String, String>();
		
		// 2. HashMap�� ���� �����͸� �����Ͻÿ�
		emails.put("����", "nari@cloudstudying.kr");
		emails.put("����", "jungae@cloudstudying.kr");
		emails.put("ȫ��", "sehong@cloudstudying.kr");
		
		// 3. key ��� ���
		System.out.println("\n== key set ==");
		for(String key : emails.keySet()) {
			System.out.println(key);
		}
		
		// 4. value ��� ���
		System.out.println("\n== value set ==");
		for(String value : emails.values()) {
			System.out.println(value);
		}
	}
}
