public class BinaryTree {
    class Tree {
        public int x;
        public Tree l;
        public Tree r;
    }
    
    public int solution(Tree T) {        
        int left_size = 0, right_size = 0;
        if (null != T.l)
            left_size = 1 + solution(T.l);
        if (null != T.r)
            right_size = 1 + solution(T.r);           
        return left_size > right_size ? left_size : right_size;
    }
}
