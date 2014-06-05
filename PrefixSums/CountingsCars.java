package PrefixSums;

public class CountingCars {
	public static int solution(int[] A) {
		int ret = 0, total_sum = 0;
		
		for (int i = 0; i < A.length; ++i) {
			total_sum += A[i];
		}
		
		int[] sums = new int[A.length];
		
		for (int i = 0; i < A.length; ++i) {
			sums[i] = i == 0 ? 0 : sums[i-1] + A[i];
			if (A[i] == 0) {
				ret += total_sum - sums[i];
			}
			if (ret > 1000000000) {
				ret = -1;
				break;
			}
		}
		return ret;
	}
}
