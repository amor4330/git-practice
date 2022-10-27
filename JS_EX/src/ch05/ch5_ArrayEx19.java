package ch05;

public class ch5_ArrayEx19 {
	
	public static void main(String[] args) {
		
		int[][] score = {
				{100, 100, 100},
				{20, 20, 20},
				{30, 30, 30},
				{40, 40, 40},
				{50, 50, 50}
		};
		
		int koTotal = 0, engTotal = 0, mathTotal = 0;
		
		for(int i=0; i<score.length; i++) {
			koTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
		}
		
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t");
		System.out.println("================================================");

		for(int i=0; i<score.length; i++) {
			int sum = 0;
			double aver = 0;
			
			System.out.printf("%2d", i+1);
			
			for(int j=0; j<score[i].length; j++) {
				sum += score[i][j];
				aver = (sum) / score[i].length;
				System.out.printf("%8d", score[i][j]);
			}
			System.out.printf("%8d %8.1f%n", sum, aver);
		}
		System.out.println("================================================");
		System.out.printf("총점: %6d %6d %7d",koTotal,engTotal,mathTotal );
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
