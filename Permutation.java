
package CountingNumbers;

import java.util.LinkedHashSet;

public class Permutation {
	public static int solution(int[] A) {
		int sum_indexes = 0, sum_values = 0;
		java.util.Set<Integer> tmp = new LinkedHashSet<Integer>();
		for (int i = 0; i < A.length; ++i) {
			if (A[i] > A.length || A[i] < 1 || !tmp.add(A[i])) {
				return 0;
			}
			sum_indexes += i+1;
			sum_values += A[i];
		}
		return (sum_indexes == sum_values ? 1 : 0);
	}
}
