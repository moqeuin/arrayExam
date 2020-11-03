package arrayExam;

import java.util.Arrays;

public class arrayExam {

	public static void main(String[] args) {
	
		
		// 배열 : 같은 타입의 여러 변수를 하나로 묶음
		
		// 0 ~ 4까지의 인덱스로 선언이 되고 변수이름[index]로 접근가능, 배열의 요소는 0으로 초기화
		int[] arr1 = new int[5];
		// length는 배열의 길이를 알 수 있다.
		int leng = arr1.length;
		System.out.println(leng);	// 5
		
		// for문으로 원하는 값을 초기화할 수 있지만 일정한 규칙을 가지고 있어야하기 때문에 이 방식으로 초기화할 수 있다.
		int[] arr2 = {10,20,30,40};
		System.out.println(arr2.length);	// 4
		
		// 반복문으로 값을 확인할 수 있다
		for (int i = 0; i < arr2.length; i++) {			
			System.out.print(arr2[i] +"\t");
		}
		// toString으로도 확인할 수 있다.
		System.out.println(Arrays.toString(arr2)); // [10,20,30,40]
		
		// 배열의 참조주소 확인가능하다.
		System.out.println(arr2);
		
	}

}
