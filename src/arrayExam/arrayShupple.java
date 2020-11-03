package arrayExam;

import java.util.Arrays;

public class arrayShupple {

	public static void main(String[] args) {
		// 배열을 랜덤으로 섞기
		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		
		for (int i = 0; i < arr.length; i++) {
			
			int randomNum = (int)(Math.random()*10);
			int tmp = arr[i];
			arr[i] = arr[randomNum];
			arr[randomNum] = tmp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
