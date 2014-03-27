public class BinaryGap {
    
    public static int Solution(int N) {
       int max = 0, cnt = 0, trailing = 1;
        String binaryRepr = Integer.toBinaryString(N); 
        for (int i = binaryRepr.length() - 1; i >= 0 ; --i) {              
            if (binaryRepr.charAt(i) == '0') {                
                if (trailing == 0) {
                    ++cnt;
                    if (cnt > max)
                        max = cnt;
                }
            }
            else {
                trailing  = 0;
                cnt = 0;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        System.out.println(Solution(5));
    }
