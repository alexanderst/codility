package TimeComplexity;

public class PermMissingElement {
	public static int solution(int[] A) {
		int correct_sum = 0, real_sum = 0;
		for (int i = 0; i < A.length; ++i) {
			correct_sum += i+1;
			real_sum += A[i];
		}
		int max = A.length+1;
		int ret = max - (real_sum - correct_sum);
		return ret;
	}
}
