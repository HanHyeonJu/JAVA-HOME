package example;

import java.util.HashMap;

public class Marathon {
	/*
	 *  �� �Ѹ��� ������ �����ϰ�� ��� ������ ������ ����
	 *  participant : �����濡 ������ �������� �̸��� ��� �迭
	 *  completion : ������ �������� �̸��� ��� �迭
	 *  �������� ���� �������� �̸��� return�ϵ��� solution�Լ� �ۼ�
	 *  ������ ��⿡ ������ ������ 1�� �̻� 100,000�� ����
	 *  completion�� ���̴� participant�� ���̺��� �۴�.
	 *  ������ �߿��� ���������� ���� �� �ִ�.
	 */
	public static void main(String[] args) {
		// ������ ������ "����","����","�¾�"
		//1. "����"�� ������ ��ܿ��� ������ �������� ����["����","����","�¾�"]
		//2. "�¾�"�� ������ ��ܿ��� ������ �������� ����["����","����","�¾�","�۱�"]
		//3. "����"�� ������ ��ܿ� �� �� ������ ������ ��ܿ��� �� ��ۿ� ����["����","����","�¾�","����"]
		
		System.out.println(solution(new String[] {"����","����","�¾�"}, new String[]{"����","�¾�"}));
		System.out.println(solution(new String[] {"����","����","�¾�","�۱�"}, new String[]{"����","����","�۱�"}));
		System.out.println(solution(new String[] {"����","����","�¾�","����"}, new String[]{"����","����","�¾�"}));
		// ������ String �迭 ��ü���� Solution �Լ��� ����Ǳ� ������ �迭�� �Էµ� ���� ���� ��µ��� �ʰ� Solution���� return ���� ���� ��µȴ�.
		
	}
	
	public static String solution(String[] participant, String[] completion) { // StringŸ���� �迭 participans�� completion Ÿ�Կ� ���� ������ �Լ� solution
		// String �迭 participant�� completion ����
		String answer = ""; // solution�� return ���� ���� answer
		// HashMap hm ����, ������ �̸��� �ο����� �Բ� ���� �� �ֵ��� �ڷ����� �����
		HashMap<String, Integer> hm = new HashMap<>();
		
		// ������ �迭���� �̸��� �ϳ��� ������ �̸��� ���� 1�� HashMap�� �߰�
		// �ߺ��Ǵ� �̸��� �ߺ��Ǵ� ��ŭ ���ڸ� ���Ѵ�
		for(String name : participant) { // �����ڵ��� �̸��� ��� �迭�� name������ �����Ͽ� for���� ����� HashMap hm�� �����Ų��.
			if(hm.get(name) == null) { // ������ HashMap hm�� name�� null���̶�� = hm�� String key���� ���ٸ�
				hm.put(name,1); // String���� name�� Integer���� 1�� �־��ش�
			}else { // �ݴ�� String key ���� �ִٸ�(�ߺ��Ǵ� �̸�)
				int value = hm.get(name)+1; // key���� �ߺ��Ǵ� �̸��� ������ value���� +1�ǵ��� ������Ʈ �ǵ��� ���ش�(Map�� �ߺ��� ������� �ʱ� ������) 
				hm.put(name, value); // hm���� name�� +1�� value���� �־��ش�
			}
		}/*
		������� participant�迭�� �ִ� "����"��� �̸��� ����ǰ� �� �̸��� �����ͼ� ������ �� null���̸� HashMap hm�� key������ "����", value������ 1�� ����ǰ� 
		�Ѵ�. ����ؼ� participant�� �ִ� ���� �ִٰ� ���� �̸��� �߰ߵǸ� Map�� �ߺ��� ������� �ʱ� ������ ������ �� �� �ִ�. �׷��� value���� +1�Ͽ� ���� ��� key��
		�� �״�� �����ϰ� value���� �������� ����� �ش�. value���� �ο� ���� �ǹ��ϱ� ������ value���� +1 �ƴٴ� ���� ���� �̸��� ���� ����� 2���̶�� ���� �� �� �ְ� ���ش�.
		�̷��� ���־�� ������ ��ܿ� ���������� �ߺ��̶� �����Ǵ� ���� �Ͼ�� �ʴ´�. 
		*/
		
		//������ ������ �̸��� HashMap���� -1 ���ش�
		for(String name : completion) { // ������ �������� �̸��� ��� �迭 name������ �����Ͽ� for���� ����� HashMap hm�� �����Ų��.
			hm.put(name, hm.get(name)-1); // completion�迭�� ��� name�� key���� �־��ָ� value���� -1�Ѵ�
		} 
		
		for(String name : hm.keySet()) { // �ؽø� ��Ҹ� ��ü �ݺ�
			if(hm.get(name) == 1) answer = name; // �̸��� �ش��ϴ� ���� 1�̸� ���ϰ� answer�� �Ѵ�.(�������� ���� ������)
		}// if���� { } �̰� �� �ص� �������?
		
		return answer; // �������� ���� �������� �̸��� return�ȴ�.
	}// return �޴� answer������ String Ÿ���̱� ������ int���� value ���� return���� �ʴ´�.
	// hm.get(name)�� �ϴ� ���� : for������ int���� ���� �ʰ� String Ÿ���� ���� �޾Ƶ鿴�� ������ String Ÿ���� key ���� ���ؼ� value���� �������� ���̴�.
	// + name�� key�� �� �״�� value���� �������ִ� ��ȣ ���� ���̱� ������ �� ��ȣ�� ��������  �� ��ȣ�� �ش��ϴ� value���� ������ ��
}
