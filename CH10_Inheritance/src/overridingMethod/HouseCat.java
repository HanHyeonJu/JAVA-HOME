package overridingMethod;

public class HouseCat extends Cat {
	@Override // �������̵� �ߴٰ� ǥ��(������̼�)
	public void vocal() { // �������̵�, ��ӹ��� ����� Ŭ������ �޼ҵ��̸��� Ʋ���� �������̵� �� ��
		System.out.println("�̾߿�~");
	}
}
