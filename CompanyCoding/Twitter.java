package CompanyCoding;

import java.util.Hashtable;

/*
 * "write a function that takes an unsorted array of longs which has the following properties: 
 *  the array is always of odd length and all the values in the array appear an even number of times except one value.  
 *  The function should return the value that appears the odd number of times."
 * 
 */
public class Twitter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long array1[] = { 1, 1, 1, 1, 3, 3, 3 };
		System.out.println(getODD1(array1));

		int array2[] = { 1,3,3 };
		System.out.println(getODD2(array2));
		int array3[] = { 1, 1, 1, 1, 3, 3, 3 };
		System.out.println(getODD3(array3));
	}

	public static long getODD1(long array[]) {
		long result = 0;
		for (int i = 0; i < array.length; i++) {
			result = result ^ array[i];
		}
		return result;
	}

	// Method does not work at all.
	public static int getODD2(int array[]) {
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		hash.put(Integer.MAX_VALUE, Integer.MAX_VALUE);
		boolean flag = false;
		for (int i : array) {
			if (hash.containsKey(i)) {
				int count = hash.get(i);
				if (count % 2 == 1) {
					hash.put(Integer.MAX_VALUE, i);
					flag = true;
				}
				else{
					flag=false;
				}
				hash.put(i, count++);
			} else {
				hash.put(Integer.MAX_VALUE, i);
				hash.put(i, 1);
				flag = true;
			}
		}
		System.out.println(hash);
		return(flag==true?hash.get(Integer.MAX_VALUE):-1);
		 
	}

	public static int getODD3(int array[]) {
		Hashtable<Integer, Integer> hash = new Hashtable<Integer, Integer>();
		int index = -1;
		for (int i : array) {
			if (hash.containsKey(i)) {
				hash.remove(i);
			} else {
				hash.put(i, 1);
				index = i;
			}
		}
		return (index != -1 ? index : -1);

	}
	

}
