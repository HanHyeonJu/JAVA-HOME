package application;

public class MultiArray {

	public static void main(String[] args) {
		String [][] texts = {
				{"�ϳ�","��","��"},
				{"��","�ټ�","����"},
				{"�ϰ�","����","��ȩ"},
		};
		
		for(int i = 0; i < texts.length; i++) {
//			System.out.println(texts[i]);
//			String[] innerArray = texts[i];
			for(int j =0; j<texts[i].length; j++) {
//				System.out.printf("%s\t", innerArray[j]); j < InnerArray.length
				System.out.printf("%s\t", texts[i][j]);
			}
			
			System.out.println();
		}
		
//		�𸣰ڴ�

	}

}
