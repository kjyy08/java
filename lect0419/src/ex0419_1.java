

public class ex0419_1 {
	
	static int[] getScores(int[] score) {
		for (int i = 0; i < 20; i++) {
			score[i] = (int) ((Math.random() * 1000) % 101);
			System.out.print(score[i] + ", ");
		}
		System.out.println(" ");
		return score;
	}
	
	static void calcGroup(int[] score) {
		int[] group = {0,0,0,0};

		for (int i = 0; i < 20; i++) {
			if (score[i] <= 30)
				group[0]++;
			else if ((score[i] > 30) && (score[i] <= 60))
				group[1]++;
			else if ((score[i] > 60) && (score[i] <= 80))
				group[2]++;
			else
				group[3]++;
		}

		System.out.println("0 ~ 30 : " + group[0] + ", 31 ~ 60 : " + group[1] + ", 61 ~ 80 : " + group[2]
				+ ", 81 ~ 100 : " + group[3]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = new int[20];

		score = getScores(score);
		calcGroup(score);
	}
}
