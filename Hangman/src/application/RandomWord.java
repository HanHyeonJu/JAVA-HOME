package application;

import java.util.Random;

// 컴퓨터에서 제공할 랜덤단어 클래스 만들기
public class RandomWord {
	// 단어들을 books 문자열에 입력, 배열X(랜덤단어제공 사이트 이용)
	private String books = "bathroom chimpanzee disappoint recommendation presence goalkeeper elephant appreciate beautiful paralyzed photography champion predator cigarette classroom liability qualification insurance prosecution pedestrian describe remember interrupt football concrete cultural practice overview priority offensive gradient admission perception registration convention understanding development empirical freighter hardship cooperation feminist attention economic distortion nonsense commemorate triangle talented mistreat";
	// 긴 문자열로 이루어진 단어들을 split 메소드로 분리 후 words 배열에 저장
	private String[] words = books.split(" ");
	// 랜덤으로 선택해서 출력될 단어에 관한 인스턴스 변수
	private String selectWord; // 랜덤으로 선택된 단어
	private Random random = new Random();// 랜덤단어를 생성하는 생성자를 만들긴 위한 변수
	// 문자배열 (철자를 맞으면 저장)
	private char[] characters;
	
	// 랜덤 클래스의 기본 생성자 : 랜덤단어를 생성(
	public RandomWord() { // 랜덤 클래스의 기본생성자
		selectWord = words[random.nextInt(words.length)]; // 랜덤으로 선택된 번호의 글자를 selectWord에 저장
		characters = new char[selectWord.length()];//선택된 단어의 길이만큼 문자 배열의 크기로 생성한 것을 characters에 저장
	}
	
	public void getWords() {// 사용자가 랜덤 단어를 맞추면 그 단어를 가져와서 출력할 수 있게 하는 메소드 
		for(String word : words) {
			System.out.println(word);
		}
	} 
	
	public String toString() { // _와 단어 출력을 위한 메소드
		//String text = " ";
		StringBuilder sb = new StringBuilder(); // text문자열을 StringBuilder sb 객체로 바꿈(StringBuilder가 문자열을 하나하나 문자열로 분리하는 건데 행맨게임은 문자 하나하나 확인해서 맞추는 게임이기 때문에 StringBuilder 사용)
		for(char c : characters) {
		//	if(c =='\u0000') { //널문자 유니코드
		//	text += '_';} // 단어가 characters의 값이 아니라면 _ 출력
		//	else {
		//		text += c;
		//	}
		//	text += ' '; // 단어를 하나씩 띄어서 보기좋게 보여주기 위함
			sb.append(c=='\u0000'? '_' : c); // 삼항 연산자를 이용함 (변수 c가 널문자라면 _가 출력 아니라면 변수 c가 출력)
			sb.append(' '); // 철자를 한 칸씩
		}
		//c가 null이라면 문자가 선택된 단어에 해당되지 않다는 뜻
		//System.out.println(selectWord); 테스트용 정답출력
		return sb.toString(); // 변수 c가 선택된 랜덤 단어의 크기만큼 맞으면 분리된 문자인 sb를 합쳐서 문자열로 return 한다는 뜻(?)
			
	}
	public boolean addGuess(char c) { // 사용횟수 수정 전 void
		// 랜덤으로 선택한 단어에 c 문자가 있으면 그 문자를 cahracters의 인덱스 위치에 입력, 행맨 클래스에 getuserinput와 연결
		for(int i = 0; i < selectWord.length(); i++) {
			if( c == selectWord.charAt(i)) {
				characters[i] = c;
				return true; // 철자 c가 selectword 단어 중에 맞는 철자가 있으면 맞는 characters의 위치에 입력될 수 있도록 맞다는 의미에 true가 return
			}
		}
			return false; //맞는 문자가 없으면 false
	}
	public boolean isCompleted() {
		// 철자를 다 맞췄는지 체크한 후 true or false로 리턴한다. checkuserinput과 연결됨
		for(char c : characters) {
			if(c == '\u0000') {
				return false; // 아직 맞춰야 할 문제 있음
			}
		}
		return true; // 다 맞춤
	}
}
