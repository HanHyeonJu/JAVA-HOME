package game;

import java.util.Random;

import gameobject.GameObject;
import gameobject.Paper;
import gameobject.Rock;
import gameobject.Scissors;

public class Game { // ���� Ŭ������ ����, ����, �� ��ü ����
	// ���� ���� �� ��ü�� ���̵� �����Ͽ� ���� ���ڷ� ���� ���� ���� ������ �� �ְ� ��(id�� gameobject ��Ű���� �ִ� Ŭ������� ����)
	GameObject[] objects = { new Scissors(), new Rock(), new Paper() };
	Random random = new Random(); // Random ��ü�� �����Ͽ� ���� ���� ���� �������� ������ �� �ְ� ��
	
	public void run() {
		System.out.println("���� ����...");
//		for(GameObject ob : objects) {
//			System.out.println(ob); // for���� �̿��� gameobject�� toString ���
//		}
		int num = random.nextInt(objects.length);// objects�� �迭 ũ�� ��ŭ �������� ���� ����
		GameObject ob = objects[num];
		System.out.println(ob); // ���� ���� �� �� �������� ���� �� �� ���� ���
	}
}
