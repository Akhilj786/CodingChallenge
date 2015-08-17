package ProgrammingElements.Chapter6;

/*
 * n 3 three dimension problem
 */
public class solution6_2 {
	
	
	
	// The problem is similar to maximizing profit in buy and sell thread. As
	// the height i.e Z coordinate will only change not other coordinates.

	/*
	 * 
	 * public static int maxProfit(int array[]) { int min = array[0]; int sell =
	 * 0; int profit = 0; int buy = 0; for (int i = 1; i < array.length; i++) {
	 * if (array[i] - min > profit) { profit = array[i] - min; if (array[i] >
	 * sell) { sell = array[i]; buy = min; } } if (array[i] < min) { min =
	 * array[i]; } } System.out.println("Buy:" + buy + " Sell:" + sell); return
	 * profit; }
	 */
	


	public int longestEqualArray(int array[]) {
		int max_count = Integer.MIN_VALUE;
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			if(array[i+1]-array[i]==0)
				count++;
			else{
				max_count=Math.max(max_count, count);
				count=0;
			}
		}
		
		max_count=Math.max(max_count,count);

		return (max_count+1);
	}
}
