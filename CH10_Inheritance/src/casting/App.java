package casting;

public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new HouseCat();
		cat1.vocal(); 
		cat1.hunt();
		//cat1.call(); ���� ��ü�� housecat������ ����Ŭ������ catŸ������ ��ĳ������ �Ǿ� cat�� �޼ҵ常 ����� �����ϴ�.
		// �������̵��� �����ϱ� ������ cat1.vocal(); ���� �̾߿�~�� ��°���
		
		HouseCat cat2 = (HouseCat)cat1; //�ٿ�ĳ����(��Ÿ�� ���� �Ͼ �� ����)
		cat2.call();
		//�Ͽ콺Ĺ�� �ٽ� �ٿ� ĳ�����ؼ� Ĺ2������ ���� ��°���
		
		

	}

}
