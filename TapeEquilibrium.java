public class TapeEquilibrium {
	public static int solution(int[] A) {
			  int val = -1;
			  int sum_left = 0, sum_right = 0;
			
			  for (int i = 1; i < A.length; ++i) {
				  sum_right += A[i];
			  }
			  for (int i = 1; i < A.length; ++i) {
			    sum_left += A[i-1];
				  int attempt = Math.abs(sum_left - sum_right);
				  sum_right -= A[i];
				  if (-1 == val || attempt < val) {
				      val = attempt;
				  }
			  }
			  return val;
	    }
}
