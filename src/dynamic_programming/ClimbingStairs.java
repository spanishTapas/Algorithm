package dynamic_programming;

public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// recursion costs O(2^n) time
/**	
	public int climbStairs(int n) {
        if (n<=0) {
            return 0;
        }
        if (n==1) {
            return 1;
        }
        if (n==2) {
            return 2;
        }
        
        return climbStairs(n-1) + climbStairs(n-2);
    }
**/
	// Dynamic programming
	public int climbStairs(int n) {
        if (n<=0) {
            return 0;
        }
        int p1 = 1, p2 = 1;
        
        for (int i=2; i<=n; i++) {
        	int tmp = p1 + p2;
        	p1 = p2;
        	p2 = tmp;
        }
        return p2;
	}

	
}
