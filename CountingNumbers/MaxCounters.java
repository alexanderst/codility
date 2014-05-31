package CountingNumbers;

public class MaxCounters {
	public static int[] solution(int N, int[] A) {
		int[] retVal = new int[N];
		int max = 0, last_max = 0;
		for (int i = 0; i < A.length; ++i) {
			if (A[i] == N+1) {
				last_max = max;
			}
			else {
				int curr_index = A[i] - 1;
				if (retVal[curr_index] < last_max)
					retVal[curr_index] = last_max;
				++retVal[curr_index]; 
				if (retVal[curr_index] > max) {
					max = retVal[curr_index];
				}
			}
		}
		for (int i = 0; i < retVal.length; ++i) {
			if (retVal[i] < last_max)
				retVal[i] = last_max; 
		}		
		return retVal;
	}
}
