package string;

/**
 * @author wanmingzhang
 * Compare two version numbers version1 and version2.
If version1 > version2 return 1, if version1 < version2 return -1, otherwise return 0.

You may assume that the version strings are non-empty and contain only digits and the . character.
The . character does not represent a decimal point and is used to separate number sequences.
For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.

Here is an example of version numbers ordering:

0.1 < 1.1 < 1.2 < 13.37
 */
public class CompareVersionNumbers {

	public static void main(String[] args) {
		CompareVersionNumbers obj = new CompareVersionNumbers();
		
		String v1 = "0.1";
		String v2 = "1.1";
		String v3 = "1.2";
		String v4 = "13.37";
		
		System.out.println("v1 VS v2 " + obj.compareVersion(v1, v2));
		System.out.println("v2 VS v3 " + obj.compareVersion(v2, v3));
		System.out.println("v3 VS v4 " + obj.compareVersion(v3, v4));
		
	}
	
    public int compareVersion(String version1, String version2) {
        String[] arr1 = version1.split("\\.");
		String[] arr2 = version2.split("\\.");
		
        int len = Math.max(arr1.length, arr2.length);
        
        for (int i=0; i<len; i++) {
            if (i<arr1.length && i<arr2.length) { // both version1 && version2
                if (Integer.parseInt(arr1[i]) < Integer.parseInt(arr2[i])) {
                    return -1;
                } else if (Integer.parseInt(arr1[i]) > Integer.parseInt(arr2[i])) {
                    return 1;
                }
            } else if (i<arr1.length) { // version1
                if (Integer.parseInt(arr1[i]) > 0) {
                    return 1;
                }
            } else if (i<arr2.length) { // version2
                if (Integer.parseInt(arr2[i]) > 0) {
                    return -1;
                }
            }
        }
        
        return 0;
    }

}
