package example;

import java.util.HashMap;

public class Marathon {
	/*
	 *  단 한명의 선수를 제외하고는 모든 선수가 마라톤 완주
	 *  participant : 마라톤에 참여한 선수들의 이름이 담긴 배열
	 *  completion : 완주한 선수들의 이름이 담긴 배열
	 *  완주하지 못한 선수들의 이름을 return하도록 solution함수 작성
	 *  마라톤 경기에 참여한 선수는 1명 이상 100,000명 이하
	 *  completion의 길이는 participant의 길이보다 작다.
	 *  참가자 중에는 동명이인이 있을 수 있다.
	 */
	public static void main(String[] args) {
		// 마라톤 참가자 "병주","병헌","승언"
		//1. "병주"는 참여자 명단에는 있지만 완주하지 못함["병주","병헌","승언"]
		//2. "승언"은 참여자 명단에는 있지만 완주하지 못함["병주","병헌","승언","송군"]
		//3. "병헌"은 참여자 명단에 두 명 있지만 완주자 명단에는 한 명밖에 없음["병주","병헌","승언","병헌"]
		
		System.out.println(solution(new String[] {"병주","병헌","승언"}, new String[]{"병헌","승언"}));
		System.out.println(solution(new String[] {"병주","병헌","승언","송군"}, new String[]{"병주","병헌","송군"}));
		System.out.println(solution(new String[] {"병주","병헌","승언","병헌"}, new String[]{"병주","병헌","승언"}));
		// 생성된 String 배열 객체들은 Solution 함수가 적용되기 때문에 배열에 입력된 값이 전부 출력되지 않고 Solution에서 return 받은 값만 출력된다.
		
	}
	
	public static String solution(String[] participant, String[] completion) { // String타입의 배열 participans와 completion 타입에 값을 리턴할 함수 solution
		// String 배열 participant와 completion 생성
		String answer = ""; // solution에 return 받을 변수 answer
		// HashMap hm 생성, 참가자 이름과 인원수를 함께 적을 수 있도록 자료형을 만든다
		HashMap<String, Integer> hm = new HashMap<>();
		
		// 참가자 배열에서 이름을 하나씩 꺼내어 이름과 숫자 1을 HashMap에 추가
		// 중복되는 이름은 중복되는 만큼 숫자를 더한다
		for(String name : participant) { // 참가자들의 이름이 담긴 배열을 name변수에 저장하여 for문을 만들어 HashMap hm에 저장시킨다.
			if(hm.get(name) == null) { // 생성된 HashMap hm에 name이 null값이라면 = hm에 String key값이 없다면
				hm.put(name,1); // String에는 name을 Integer에는 1을 넣어준다
			}else { // 반대로 String key 값이 있다면(중복되는 이름)
				int value = hm.get(name)+1; // key값의 중복되는 이름을 가져와 value값이 +1되도록 업데이트 되도록 해준다(Map은 중복을 허용하지 않기 때문에) 
				hm.put(name, value); // hm에는 name과 +1된 value값을 넣어준다
			}
		}/*
		예를들어 participant배열에 있는 "병주"라는 이름이 저장되고 그 이름을 가져와서 보았을 때 null값이면 HashMap hm에 key값으로 "병주", value값으로 1이 저장되게 
		한다. 계속해서 participant에 있는 값을 넣다가 같은 이름이 발견되면 Map은 중복을 허용하지 않기 때문에 삭제가 될 수 있다. 그래서 value값을 +1하여 삭제 대신 key값
		은 그대로 유지하고 value값이 수정도게 만들어 준다. value값은 인원 수를 의미하기 때문에 value값이 +1 됐다는 것은 같은 이름을 가진 사람이 2명이라는 것을 알 수 있게 해준다.
		이렇게 해주어야 참가자 명단에 동명이인이 중복이라서 삭제되는 일이 일어나지 않는다. 
		*/
		
		//마라톤 완주자 이름은 HashMap에서 -1 해준다
		for(String name : completion) { // 완주한 참가자의 이름이 담긴 배열 name변수에 저장하여 for문을 만들어 HashMap hm에 저장시킨다.
			hm.put(name, hm.get(name)-1); // completion배열에 담긴 name을 key값을 넣어주면 value값을 -1한다
		} 
		
		for(String name : hm.keySet()) { // 해시맵 요소를 전체 반복
			if(hm.get(name) == 1) answer = name; // 이름에 해당하는 값이 1이면 리턴값 answer로 한다.(완주하지 못한 참가자)
		}// if문에 { } 이거 안 해도 상관없나?
		
		return answer; // 완주하지 못한 참가자의 이름이 return된다.
	}// return 받는 answer변수가 String 타입이기 때문에 int형인 value 값은 return되지 않는다.
	// hm.get(name)을 하는 이유 : for문에는 int값을 넣지 않고 String 타입의 값만 받아들였기 때문에 String 타입인 key 값을 통해서 value값을 가져오는 것이다.
	// + name은 key값 말 그대로 value값을 구분해주는 번호 같은 것이기 때문에 그 번호를 가져오면  그 번호에 해당하는 value값이 나오는 것
}
