
public class Cat {
	private String name; //�̸�
	private int id;
	
	//����ƽ ���
	public static final String FOOD = "����� ���";
	//����ƽ ����
	static int count = 0;//ī��Ʈ �ʱⰪ 0

	
	public Cat(String name) { //Cat�� �⺻ ������ 
		this.name = name;
		id = count;
		count++;// ��ü ������ count�߰�
	}


	


	@Override
	public String toString() {
		return "Cat [name=" + name + ", id=" + id + "]";
	}





	public static int getCount() { // count���� ���� ������
		return count;			   // ����ƽ �żҵ�� �Ϲ� �ν��Ͻ� ���� ���Ұ�
	}
	
}
