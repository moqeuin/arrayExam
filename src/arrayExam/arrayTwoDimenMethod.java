package arrayExam;

import java.util.Arrays;

public class arrayTwoDimenMethod {

	public static void main(String[] args) {
		
		
		// 배열의 비교, 출력 
		
		int[] arr = {0,1,2,3,4};
		int[][] arr2d = {{11,22},{21},{22}};
		
		System.out.println(Arrays.toString(arr)); // 1차원 배열 출력
		System.out.println(Arrays.deepToString(arr2d)); // 2차원 배열 출력
		
		String[][] str2d = {{"aaa","bbb"},{"AAA","BBB"}}; 
		String[][] str2d2 = {{"aaa","bbb"},{"AAA","BBB"}};
		
		System.out.println(Arrays.deepEquals(str2d, str2d2)); // true, 2차원 배열 비교
		
		// 배열의 복사
		int[] numArr = {0,1,2,3,4};
		int[] numArr2 = Arrays.copyOf(numArr, numArr.length);
		int[] numArr3 = Arrays.copyOf(numArr, 3);
		int[] numArr4 = Arrays.copyOfRange(numArr, 2,4);
		System.out.println(Arrays.toString(numArr4)); // [2, 3]
		
		// 배열 변환
		int[] intArr = {1,2,3,4,5};
		char[] charArr1 = {'a', 'b', 'c', 'd'};
		char[] charArr2;
		/*
		문자열의 배치를 변환하는 중간과정 중 char배열을 사용해야 
		온전한 문자열을 가지고 올 수 있는 것 같다.
		*/
		// char배열 -> 문자열(1)
		String str1 = new String(charArr1);
		System.out.println(str1); // abcd
		// char배열 -> 문자열(2)
		str1 = String.valueOf(charArr1);
		System.out.println(str1); // abcd
		
		// 배열 -> 문자열, 문자열배열 또한 변환되며 []를 붙여서 변환된다.
		str1 = Arrays.toString(intArr);
		System.out.println(str1); // [1, 2, 3, 4, 5]
		
		// 문자열 -> char배열
		charArr2 = str1.toCharArray();
		System.out.println(charArr2);  // [1, 2, 3, 4, 5]
		
	}

}
