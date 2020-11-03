package arrayExam;

public class arraySumAvg {

	public static void main(String[] args) {
		
		// 배열의 요소들의 총합과 평균을 구해보자
		int[] arr = {10,20,30,40,50,65};
		
		int sum = arrSum(arr);
		double avg = sum/(double)arr.length;
		
		System.out.println(sum); // 150
		System.out.printf("%.2f",avg); // 35.83
	}
	
	// 합을 구하는 함수
	public static int arrSum(int[] arr) {
		
		int resultSum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			
			resultSum += arr[i];
		}
		return resultSum;
	}
}


