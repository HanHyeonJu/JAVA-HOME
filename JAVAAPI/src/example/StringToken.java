package example;

import java.util.StringTokenizer;

public class StringToken {

	public static void main(String[] args) {
		// �Է� ���ڿ�
		String str = "ġŲ,����,����,����,�ʹ�,������,������";
		
		//1. �����ڸ� ","�� �ϴ� StringTokenizer ��ü�� ����
		StringTokenizer st = new StringTokenizer(str, ",");
		
		//2. ��� ��ū�� ����Ͻÿ�
		while(st.hasMoreTokens()) {
		System.out.println(st.nextToken()); // ��ū�� �ϳ� ������ �� ���
		} // while���� �̿��ؼ� ��ū�� �����Ѵٸ� ���  ��� ���๮�� �ݺ��ϰ� ����� ��ū�� ��� ���
	}

}
