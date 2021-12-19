package polymorphism;
// ������ : �ڽ� Ŭ���� Ÿ���� �θ� Ÿ������ �� ��ȯ
public class App {

	public static void main(String[] args) {
		// ��� Cat Ŭ������ ��ӹ޾ұ� ������ Cat Ŭ������ ���𰡴�
		Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		Cat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Cat cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		
		// Cat Ŭ������ �迭 cats�� ����� ����غ���
		Cat[] cats = { new HouseCat(), new RoadCat(), new Tiger()};
		
		cats[0].vocal();
		cats[0].hunt();
		
		cats[1].vocal();
		cats[1].hunt();
		
		cats[2].vocal();
		cats[2].hunt();
		
		//�ݺ��� ���
		for(int i =0; i < cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		//for each �ݺ���
		for(Cat cat : cats) {
			cat.vocal();
			cat.hunt();
		}
		
		//�⺻���� ĳ����(����ȯ)
		//int a = 1.2345; //����
		int b = (int)1.2345; // ĳ���� => ��ȯ�� �����̳� �����Ͱ� �߸�
		System.out.println(b);
		
		//�������� ĳ����
		//��ĳ����
		Cat cat4 = new HouseCat(); // �ڽ�Ŭ������ housecat�� �θ�Ŭ������ cat���� ����ȯ
		//�ٿ� ĳ���� : ��ĳ���õ� ��ü�� �ٽ� �ٿ�ĳ����
		HouseCat cat5 = (HouseCat)cat4;
		
	}

}