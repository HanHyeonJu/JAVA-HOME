package casting;

public class HouseCat extends Cat {
	@Override // �������̵� �ߴٰ� ǥ��(������̼�)
	public void vocal() { // �������̵�, ��ӹ��� ����� Ŭ������ �޼ҵ��̸��� Ʋ���� �������̵� �� ��
		System.out.println("�̾߿�~");
	}
	public void call() {// �Ͽ콺Ĺ�� ���� �޼ҵ�
		System.out.println("���縦 �θ���~");
	}
}
