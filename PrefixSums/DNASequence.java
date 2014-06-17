package codility.PrefixSums;

public class DNASequence {
	private int decode(char ch) {
		int ret = 0;
		switch (ch) {
		case 'A':
			ret = 1;
			break;
			
		case 'C':
			ret = 2;
			break;
			
		case 'G':
			ret = 3;
			break;
		case 'T':			
			ret = 4;
			break;
		}
		return ret;
	}
	
	public int[] solution(String S, int[] P, int[] Q) {
		int M = P.length;
		int N = S.length();
		int[] retVal = new int[M];
		
		int[][] codes = new int[3][N+1];
		
		for (int i = 0; i < N; ++i) {
			int curr = decode(S.charAt(i));
			codes[0][i+1] = codes[0][i] + ((curr == 1) ? 1 : 0);
			codes[1][i+1] = codes[1][i] + ((curr == 2) ? 1 : 0);
			codes[2][i+1] = codes[2][i] + ((curr == 3) ? 1 : 0);
			
		}
		
		int min = 0;
		for (int i = 0; i < M; ++i) {
			int start = P[i] + 1;
			int end = Q[i] + 1;
			if (codes[0][end] - codes[0][start-1] > 0) {
				min = 1; 
			}
			else if (codes[1][end] - codes[1][start-1] > 0) {
				min = 2; 
			}
			else if (codes[2][end] - codes[2][start-1] > 0) {
				min = 3; 
			}
			else {
				min = 4;
			}
			retVal[i] = min;
			
		}
		return retVal;
	}
