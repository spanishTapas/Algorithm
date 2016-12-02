package array;
import java.util.*;
/**
 * @author wanmingzhang
 * Given numRows, generate the first numRows of Pascal's triangle.

For example, given numRows = 5,
Return

[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
 */
public class PascalsTriangle {

	public static void main(String[] args) {
	    List<List<Integer>> result = generate(6);
		printListOfList(result);
		
	    List<Integer> row = getRow(3);
		printList(row);
	}
	/**
	1  
	1 1 
	1 2 1 
	1 3 3 1 
	1 4 6 4 1 
	1 5 10 10 5 1 
	* 
	*/
	/* helper function to print out array list of list*/
	public static void printListOfList(List<List<Integer>> list) {
		for (List<Integer> rows : list) {
			System.out.println();
			System.out.print("[");
			for (int i=0; i<rows.size(); i++) {
				if (i == rows.size() - 1) {
					System.out.print(rows.get(i));
				} else {
					System.out.print(rows.get(i) + ",");
				}
			}
			System.out.print("]");
		}
	}
	
	/* helper function to print out array list*/
	public static void printList(List<Integer> list) {
		System.out.println();
		System.out.print("[");
		for (int i=0; i<list.size(); i++) {
			if (i == list.size() - 1) {
				System.out.print(list.get(i));
			} else {
				System.out.print(list.get(i) + ",");
			}
		}
		System.out.print("]");
	}
	
	public static List<List<Integer>> generate (int numRows) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (numRows == 0) {
			return result;
		}
		
		for (int j=0; j<numRows; j++) {
			List<Integer> row = new ArrayList<Integer>();
			row.add(1);
			for (int i=1; i<j; i++) { // starts from 3rd row. fill the row except for the last number
				List<Integer> prevRow = result.get(j-1); // previous row
				int val = prevRow.get(i) + prevRow.get(i-1);
				row.add(val);
			}
			if (j>0) {
				row.add(1);
			}
			result.add(row);
		}
		
		return result;
	}
	/**
	Given an index k, return the kth row of the Pascal's triangle.

			For example, given k = 3,
			Return [1,3,3,1].
	**/
	public static List<Integer> getRow(int rowIndex) {
		 List<Integer> row = new ArrayList<Integer>();
		 if (rowIndex == 0) {
			 return row;
		 }
		 List<List<Integer>> pt = generate(rowIndex+1);
		 row = pt.get(rowIndex);
		 return row;
	}
}
