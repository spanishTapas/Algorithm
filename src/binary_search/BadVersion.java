package binary_search;
/**
 * 
 * @author wanmingzhang
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.

Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.

You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
public class BadVersion {

	public static void main(String[] args) {
		BadVersion obj = new BadVersion();
		System.out.println("1st Bad Version = " + obj.firstBadVersion(20));
		System.out.println("1st Bad Version = " + obj.firstBadVersion(21));
		System.out.println("1st Bad Version = " + obj.firstBadVersion(1000000));
	}
	public boolean isBadVersion(int version) { // 11 is 1st bad version
		if (version <= 10) {
			return false;
		} else {
			return true;
		}
	}
	
	public int firstBadVersion(int n) {
        int l = 1;
        int r = n;
        
        return badVersionHelper(l, r);
    }
    
   private int badVersionHelper(int l, int r) {
	   
       while (l+1 < r) {
    	   int mid = l + (r-l)/2;
           System.out.println("mid = " + mid);
       		if (!isBadVersion(mid)) {
       			l = mid;
       		} else {
       			r = mid;
       		}
       }
       
       if (isBadVersion(l)) {
       	return l;
       }
       return r;
   }

}
