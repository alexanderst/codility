import java.util.LinkedHashSet;
import java.util.Set;

public class FrogJumps {
	public static int solution(int X, int[] A) {
		int ret = -1;
		Set<Integer> checker = new LinkedHashSet<Integer>();
		for (int i = 0; i < A.length; ++i) {
			checker.add(A[i]);
			if (checker.size() == X) {
				ret = i;
				break;
			}
		}
		return ret;
	}
}
