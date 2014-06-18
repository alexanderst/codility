package codility;

public class MinAvg {

	public int solution(int[] A) {		
		double min = 0;
		
		int N = A.length;
		double[] positions = new double[N];
		
		double[] sums = new double[N];
		
		for (int i = 0; i < N; ++i) {
			sums[i] = i == 0 ? A[i] : sums[i-1] + A[i];
		}
		
		for (int i = 0; i < N; ++i) {
			for (int j = i+1; j < N; ++j) {
				
				double curr = (sums[j] - sums[i] + A[i]) / (j - i + 1);
				if (curr < min || 0 == min) {
					
					min = curr;
					if ((0 == positions[i]) || (min < positions[i]))
						positions[i] = min;
				}
			}
		}
		
		int ret = 0;
		min = 0;
		for (int i = 0; i < positions.length; ++i) {
			if (positions[i] > 0 && (min == 0 || positions[i] < min)) {
				ret = i;
				min = positions[i];
			}
		}
		
		return ret;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinAvg obj = new MinAvg();
		int ret = obj.solution(new int[]{4,2,2,5,1,5,8});
		System.out.println(ret);
	}

}
