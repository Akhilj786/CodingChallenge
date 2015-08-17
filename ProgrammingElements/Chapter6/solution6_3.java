package ProgrammingElements.Chapter6;

/*
 * Problem is similar to multiple buy and sell
 */
public class solution6_3 {

	public void multiProfit(int array[]) {
		int n = array.length;
		stock st[] = new stock[n / 2];
		int i = 0;
		int count = 0;
		int totalProfit = 0;
		while (i < n - 1) {

			// Local Minima
			while ((i < n - 1) && array[i + 1] <= array[i])
				i++;
			if (i == n - 1)
				break;
			// Buying at local Minima.
			st[count] = new stock();
			st[count].buy = i++;
			// Local maxima
			while ((i < n) && array[i] >= array[i - 1])
				i++;
			st[count].sell = i - 1;
			totalProfit += array[st[count].sell] - array[st[count].buy];
			count++;

		}

		if (count == 0)
			System.out
					.println("There is no day when buying the stock will make profit\n ");

		for (int k = 0; k < count; k++) {
			System.out.printf("Buy on day: %d\t Sell on day: %d\n", st[k].buy,
					st[k].sell);
		}
		System.out.println("Total Profit=" + totalProfit);
	}

}

class stock {
	int buy;
	int sell;
}
