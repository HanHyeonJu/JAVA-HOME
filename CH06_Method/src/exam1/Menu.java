package exam1;

public class Menu {
	String[] options = {"아이템 보기","아이템 추가","아이템 삭제","종료"};
	void display(){
		System.out.println("메뉴를 선택: ");
		for(int i = 0; i < options.length; i++) {
			System.out.printf("%d. %s \n", i, options[i]); // 옵션의 몇 번째를 출력할지가 있어야 값이 출력됨 options만 하면 주소만 출력됨
		}
	}
}
