package game;

import java.util.Random;

import gameobject.GameObject;
import gameobject.Paper;
import gameobject.Rock;
import gameobject.Scissors;

public class Game { // 게임 클래스에 가위, 바위, 보 객체 생성
	// 가위 바위 보 객체에 아이디를 생성하여 랜덤 숫자로 가위 바위 보를 선택할 수 있게 함(id는 gameobject 패키지에 있는 클래스들로 생성)
	GameObject[] objects = { new Scissors(), new Rock(), new Paper() };
	Random random = new Random(); // Random 객체를 생성하여 가위 바위 보를 랜덤으로 선택할 수 있게 함
	
	public void run() {
		System.out.println("게임 시작...");
//		for(GameObject ob : objects) {
//			System.out.println(ob); // for문을 이용해 gameobject의 toString 출력
//		}
		int num = random.nextInt(objects.length);// objects의 배열 크기 만큼 랜덤으로 숫자 추출
		GameObject ob = objects[num];
		System.out.println(ob); // 가위 바위 보 중 랜덤으로 선택 된 한 가지 출력
	}
}
