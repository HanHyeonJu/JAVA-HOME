package application;

import java.util.Random;

// ��ǻ�Ϳ��� ������ �����ܾ� Ŭ���� �����
public class RandomWord {
	// �ܾ���� books ���ڿ��� �Է�, �迭X(�����ܾ����� ����Ʈ �̿�)
	private String books = "bathroom chimpanzee disappoint recommendation presence goalkeeper elephant appreciate beautiful paralyzed photography champion predator cigarette classroom liability qualification insurance prosecution pedestrian describe remember interrupt football concrete cultural practice overview priority offensive gradient admission perception registration convention understanding development empirical freighter hardship cooperation feminist attention economic distortion nonsense commemorate triangle talented mistreat";
	// �� ���ڿ��� �̷���� �ܾ���� split �޼ҵ�� �и� �� words �迭�� ����
	private String[] words = books.split(" ");
	// �������� �����ؼ� ��µ� �ܾ ���� �ν��Ͻ� ����
	private String selectWord; // �������� ���õ� �ܾ�
	private Random random = new Random();// �����ܾ �����ϴ� �����ڸ� ����� ���� ����
	// ���ڹ迭 (ö�ڸ� ������ ����)
	private char[] characters;
	
	// ���� Ŭ������ �⺻ ������ : �����ܾ ����(
	public RandomWord() { // ���� Ŭ������ �⺻������
		selectWord = words[random.nextInt(words.length)]; // �������� ���õ� ��ȣ�� ���ڸ� selectWord�� ����
		characters = new char[selectWord.length()];//���õ� �ܾ��� ���̸�ŭ ���� �迭�� ũ��� ������ ���� characters�� ����
	}
	
	public void getWords() {// ����ڰ� ���� �ܾ ���߸� �� �ܾ �����ͼ� ����� �� �ְ� �ϴ� �޼ҵ� 
		for(String word : words) {
			System.out.println(word);
		}
	} 
	
	public String toString() { // _�� �ܾ� ����� ���� �޼ҵ�
		//String text = " ";
		StringBuilder sb = new StringBuilder(); // text���ڿ��� StringBuilder sb ��ü�� �ٲ�(StringBuilder�� ���ڿ��� �ϳ��ϳ� ���ڿ��� �и��ϴ� �ǵ� ��ǰ����� ���� �ϳ��ϳ� Ȯ���ؼ� ���ߴ� �����̱� ������ StringBuilder ���)
		for(char c : characters) {
		//	if(c =='\u0000') { //�ι��� �����ڵ�
		//	text += '_';} // �ܾ characters�� ���� �ƴ϶�� _ ���
		//	else {
		//		text += c;
		//	}
		//	text += ' '; // �ܾ �ϳ��� �� �������� �����ֱ� ����
			sb.append(c=='\u0000'? '_' : c); // ���� �����ڸ� �̿��� (���� c�� �ι��ڶ�� _�� ��� �ƴ϶�� ���� c�� ���)
			sb.append(' '); // ö�ڸ� �� ĭ��
		}
		//c�� null�̶�� ���ڰ� ���õ� �ܾ �ش���� �ʴٴ� ��
		//System.out.println(selectWord); �׽�Ʈ�� �������
		return sb.toString(); // ���� c�� ���õ� ���� �ܾ��� ũ�⸸ŭ ������ �и��� ������ sb�� ���ļ� ���ڿ��� return �Ѵٴ� ��(?)
			
	}
	public boolean addGuess(char c) { // ���Ƚ�� ���� �� void
		// �������� ������ �ܾ c ���ڰ� ������ �� ���ڸ� cahracters�� �ε��� ��ġ�� �Է�, ��� Ŭ������ getuserinput�� ����
		for(int i = 0; i < selectWord.length(); i++) {
			if( c == selectWord.charAt(i)) {
				characters[i] = c;
				return true; // ö�� c�� selectword �ܾ� �߿� �´� ö�ڰ� ������ �´� characters�� ��ġ�� �Էµ� �� �ֵ��� �´ٴ� �ǹ̿� true�� return
			}
		}
			return false; //�´� ���ڰ� ������ false
	}
	public boolean isCompleted() {
		// ö�ڸ� �� ������� üũ�� �� true or false�� �����Ѵ�. checkuserinput�� �����
		for(char c : characters) {
			if(c == '\u0000') {
				return false; // ���� ����� �� ���� ����
			}
		}
		return true; // �� ����
	}
}
