package arrayExam;

public class arrayTwoDimention {

	public static void main(String[] args) {
		
		// 과목별 총점, 평균 내기
		
		int[][] score = {
					{100, 100,100},
					{20, 20, 20},
					{30, 30, 30},
					{40, 40, 40},
					{50, 50, 50}
						};
		int korTotal = 0; // 총합
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("번호\t국어\t영어\t수학\t총점 \t평균");
		System.out.println("=============================================");
		
		for (int i = 0; i < score.length; i++) {
			
			int sum = 0;
			double avg = 0;
			System.out.print((i+1)+ "\t");
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			
			for (int j = 0; j < score[i].length; j++) {
				
				sum += score[i][j];
				
				System.out.print(score[i][j]+"\t");
			}
			avg = sum/(double)score[i].length;
			System.out.print(sum+"\t" + avg + "\n");		
		}
		System.out.println("=============================================");
		System.out.println("총점" + "\t" + korTotal + "\t" + engTotal + "\t" + mathTotal);
		
	}

}
