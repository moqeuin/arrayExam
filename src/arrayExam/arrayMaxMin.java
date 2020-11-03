package arrayExam;

public class arrayMaxMin {

	public static void main(String[] args) {
		// 배열의 최대 최소 구하기
		
		int[] score = {1,3,9,17,33};
		int max = score[0];
		int min = score[0];
		for (int i = 1; i < score.length; i++) {
			
			if( max < score[i]) {
				
				max = score[i];
			}
			else if( min > score[i]) {
				
				min = score[i];
			}
		}	
		System.out.println("최대 : " + max + " 최소 : " + min);
	}
	

}
