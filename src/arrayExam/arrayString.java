package arrayExam;

public class arrayString {

	public static void main(String[] args) {
		
		/*
		 char배열을 사용하지 않고 String 클래스를 따로 사용하는 이유는 
		 좀 더 유용한 메서드들을 사용하기 위해서이다.
		*/
		
		String[] names = {"kim", "han", "song"};
		
		// String 객체
		String str = "java";
		str += "8";
		System.out.println(str); 
		// java8, String객체는 인스턴스이므로 값변경(불변성)이 불가능하고 새로 인스턴스를 생성해서 만든다.
		
		// 주요 메서드
		
		// 지정한 인덱스의 문자반환
		System.out.println(str.charAt(0)); // j
		// 문자열의 길이 반환
		System.out.println(str.length()); // 5
		// 문자열의 범위를 지정해 해당 문자열 반환
		System.out.println(str.substring(1,3)); // av
		// 문자열 -> 문자배열
		char[] charStr = str.toCharArray();
		System.out.println(charStr[2]);
	}

}
