package windowProgramming;

public class App {

	public static void main(String[] args) {
		// 윈도우 창 클래스 작성하기
		Window w = new Window();
		w.setWidth(300);
		w.setHeight(300);
		w.setVisible(true);
		w.setTop(50);
		w.setLeft(50);
		
		System.out.println(w.getWidth());
		System.out.println(w.getHeight());
		System.out.println(w.isVisible());
		System.out.println(w.getTop());
		System.out.println(w.getLeft());
	}

}
