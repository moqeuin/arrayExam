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
		
		
	
	}

}
