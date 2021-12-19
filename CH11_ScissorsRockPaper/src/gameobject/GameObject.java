package gameobject;

public class GameObject { // rock, paper, scissors�� ���� Ŭ����
	private int id; 
	private String name;
	
	//���߹迭 (����, ����, �� / �̱� �� �й�)
	/*			����    ����    ��
	 * ����(0)  { 0,     -1,   1} // 0 ��� -1 �� 1 �̱� ������ ���� ����
	 * ����(1)  { 1,     0,   -1}
	 * ��(2)   { -1,    1,    0}
	 */
	private int[][] comparison = {
			{0, -1, 1},
			{1, 0, -1},
			{-1, 1, 0}
	};
	// private�� �ν��Ͻ� ������ �����߱� ������ ���� ���� �� Ŭ�������� id�� �̸��� ������ �� �ְ� get set �޼ҵ� ���
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "GameObject [id=" + id + ", name=" + name + "]";
	} // ���� ���� �� ���� return���·� ���
	
	
}
