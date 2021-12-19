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
	private Random random = new Random();// ??????/ 랜덤단어를 생성하는 생성자를 만들긴 위한 변수
	// 문자배열 (철자를 맞으면 저장)
	private char[] characters;
	
	// 랜덤 클래스의 기본 생성자 : 랜덤단어를 생성(
	public RandomWord() { // 랜덤으로 선택되도록 함?????? 이게 왜 랜덤으로 선택되게 하는 거야???
		selectWord = words[random.nextInt(words.length)]; // 랜덤이 인덱스번호를 나타내기 위한 변수인건가??
		characters = new char[selectWord.length()];//선택된 단어의 길이만큼 문자 배열의 크기로 생성
	}
	// 랜덤 단어를 출력하기 위한 메소드? toString으로 display 매소드를 출력하는 거면 이건 뭔데?? 그냥 word에 단어를 저장시켜서 맞으면 나오게 하는 거임?
	public void getWords() {
		for(String word : words) {
			System.out.println(word);
		}
	} 
	
	public String toString() { // _와 단어 출력을 위한 메소드
		//String text = " ";
		StringBuilder sb = new StringBuilder(); // text문자열을 StringBuilder sb 객체로 바꿈(왜?)
		for(char c : characters) {
		//	if(c =='\u0000') { //널문자 유니코드
		//	text += '_';} // 단어가 characters의 값이 아니라면 _ 출력
		//	else {
		//		text += c;
		//	}
		//	text += ' '; // 단어를 하나씩 띄어서 보기좋게 보여주기 위함
			sb.append(c=='\u0000'? '_' : c); // 삼항 연산자를 이용함
			sb.append(' '); // 철자를 한 칸씩
		}
		
		//System.out.println(selectWord); 테스트용 정답출력
		return sb.toString(); // 선택된 랜덤 단어를 가져옴??????어째서?
			
	}
	public boolean addGuess(char c) { // 사용횟수 수정 전 void
		// 랜덤으로 선택한 단어에 c 문자가 있으면 그 문자를 cahracters의 인덱스 위치에 입력, 행맨 클래스에 getuserinput와 연결
		for(int i = 0; i < selectWord.length(); i++) {
			if( c == selectWord.charAt(i)) {
				characters[i] = c;
				return true;
			}
		}
			return false; //맞는 문자가 없음....모르겠는데??
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
