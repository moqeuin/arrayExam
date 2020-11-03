package arrayExam;

import java.util.Arrays;

public class arrayLotto {

	public static void main(String[] args) {
		// 랜덤한 수 6개 중복없이 뽑기
		
		int[] ball = new int[6];		
		boolean[] check = new boolean[45];
		
		for (int i = 0; i < check.length; i++) {
			
			check[i] = false;
		}
		
		int count = 0;
		
		while(ball.length > count) {
			
			int randomNum = (int)(Math.random()*45);
			
			if(check[randomNum] == false) {
				
				check[randomNum] = true;
				ball[count] = randomNum + 1;
				count++;
			}	
		}
		System.out.println(Arrays.toString(ball));
	}

}
