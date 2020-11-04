package arrayExam;

import java.util.Scanner;

public class arrayWordCorrect {

	public static void main(String[] args) {
		// 섞인 단어의 정확한 맞추기
		
		String[] words = {"television", "computer", "mouse", "phone"};
		
		Scanner scan = new Scanner(System.in);		
		// toCharArray : 문자열 -> 문자배열
		// split : 문자열 -> 문자열배열
		int i = 0;
		while( words.length > i) {
			//String[] question = words[i].split("");
			//toString시 []를 붙여서 출력되서 char배열로 변환
			char[] question = words[i].toCharArray();
			
			int ranNum = (int)(Math.random()*words.length);		
			char tmp;
			
			for (int j = 0; j < question.length; j++) {
				
				tmp = question[j];
				question[j] = question[ranNum];
				question[ranNum] = tmp;
			}
					
			int count = 0;
			
			while(count < 5) {
				
				System.out.printf("%d. %s 정답을 입력하세요", (i+1), new String(question));
				String answer = scan.nextLine();
				
				if(answer.equals(words[i])) {
					
					System.out.println("정답입니다.");
					break;
				}
				else {
					
					System.out.println("오답입니다.");
					count++;
				}		
			}			
			i++;			
		}
		System.out.println("게임이 끝났습니다.");		
		scan.close();
	}
}
