package application;

import java.util.Random; // ?

public class RandomWord {
	// 랜덤으로 단어를 뽑아낼 클래스
	// 단어들을 통으로 문자열로 저장
	private String books = "motivation waterfall conscious recognize constitutional transform assumption romantic established attachment hilarious omission plagiarize incident dictionary advocate question destruction productive rhetoric arrogant reconcile statement baseball nominate restless willpower premature negotiation commitment fisherman character determine intermediate marketing greeting fragrant requirement football influence chocolate sickness rotation announcement profession first-hand illusion settlement grandfather constituency";
	// 문자열을 split을 이용해 스페이스 띄운 부분을 기준으로 분리시켜 String 타입의 words라는 배열에 넣음
	private String[] words = books.split(" ");
	private String selectWord; // 정답이 될 하나의 단어(랜덤으로 나옴)

	private char[] characters; // 문자 배열(철자를 맞추면 이 곳에 저장)
	private Random random = new Random(); // ?

	public RandomWord() {
		// selectWord = words[1]; //1. 이렇게 그대로 놔두면 selectWord의 기본값이 words배열에 1번 단어가 되는데
		// 그래서 나중에 random으로 나오게 수정할 거임
		selectWord = words[random.nextInt(words.length)]; // words배열의 크기만큼 random으로 아무 번호나 나오게 해서 words의 단어들 중 랜덤으로
															// selectWord에 저장하게 함
		characters = new char[selectWord.length()]; // 정답인 랜덤 단어를 보고 그 단어의 길이를 character의 배열 크기로 생성함
	}

	public void getWords() {
		for (String word : words) {
			System.out.println(word);
		} // word라는 변수에 words배열에 있는 단어들을 하나하나 출력하게 함
	}

	public String toString() {
		// return selectWord; //1. 랜덤으로 나온 단어를 return 받아서 출력
		// 2. String text = ""; // 3. text를 하나의 단어?로 출력하기 위해서 수정
		StringBuilder sb = new StringBuilder(); // 각각의 문자를 합쳐줌(?)
		for (char c : characters) {
			if (c == '\u0000') { // 역슬래시u0000은 문자의 초기값(0 또는 null), 문자의 초기값이면 아직 단어를 맞추지 못했다는 뜻
				// text += '_';
				sb.append('_');
			} else {
				sb.append(c); // 문자가 맞으면 _ 말고 단어를 출력
			}
			sb.append(' '); // 하나씩 띄어서 보이게 함
			// if문을 더 쉽게 삼항연산자로 바꿀 수 있음
			// sb.append(c=='\u0000'? '_' : c); 문자 c가 문자의 초기값이면 _를 아니면 문자를 출력하라는 뜻
			// sb.append(' ');
		}
		// System.out.println(selectWord); // 다 맞추면 SelectWord가 보이게 함
		// return text; // 사용자가 입력한 하나의 문자 text를 return함
		return sb.toString(); // text를 StringBuilder한 sb로 수정해서 선택된 랜덤 단어를 가져옴
	}

	public void addGuess(char c) {
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
			} // 철자가 맞아서 c로 넘어온 문자를 검색해 선택 단어에 있으면 characters 배열에 저장시켜 놓음, 단어의 길이만큼 반복
		}
	}

	// 게임을 계속 running할지 false할지 체크할 코드
	public boolean isCompleted() {
		for (char c : characters) {
			if (c == '\u0000') {
					return false; // c값에 초기값이 나왔다는 건 아직 맞춰야 할 문자가 있음
			}
		}
		return true; // 다 맞춤
	}
}
		
	
	
