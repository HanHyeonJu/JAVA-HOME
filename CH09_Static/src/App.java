
public class App {

	public static void main(String[] args) {
		// ����ƽ ������ Ŭ������.������ ��ü �������� ���
		// �ַ� ���а��ĵ��� ����ƽ ������ �Ǿ�����
		
		Cat cat1 = new Cat("Į��");
		System.out.println(cat1.toString());
		Cat cat2 = new Cat("��ƿ��");
		System.out.println(cat2.toString());
		Cat cat3 = new Cat("����");
		System.out.println(cat3.toString());
		Cat cat4 = new Cat("����");
		System.out.println(cat4);
		System.out.println(cat4.getCount()); // ����ƽ ������ ��ü�ε� ��밡��? ���డ�� �׳� Ŭ������ �ٷ� ���� ���� ��ü�� ���� ���� ���̰� ���� ����� �� �ߴµ� �����ȴٴ°� ���� ���ε�
		                                     
		
		System.out.println(Cat.FOOD); //����ƽ ���
		System.out.println(Math.PI); // ���а��� ����
		System.out.println(Cat.count); //getCount�� static������ ������־��� �� ��ü �ʿ���� Ŭ���������� ������ �ȴٴ� �� ������ 
		

	}

}
