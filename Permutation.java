
package CountingNumbers;

import java.util.LinkedHashSet;

public class Permutation {
	public static int solution(int[] A) {
		int sum1 = 0, sum2 = 0;
		java.util.Set<Integer> tmp = new LinkedHashSet<Integer>();
		for (int i = 0; i < A.length; ++i) {
			if (A[i] > A.length || A[i] < 1 || !tmp.add(A[i])) {
				return 0;
			}
			sum1 += i+1;
			sum2 += A[i];
		}
		return (sum1 == sum2 ? 1 : 0);
	}
}
