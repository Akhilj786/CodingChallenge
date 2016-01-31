package topCoder;
public class BettingMoney{
	public static void main(String args[]){
		int amounts[]={2125, 4624, 4535, 2386, 570, 2169, 474, 2147, 4822, 2980, 3393, 3583, 4327, 2771, 2121, 1933, 1717, 1618, 442, 1562, 72, 3197, 3163, 1911, 353, 2652, 1297, 95, 2352, 3396, 3498, 1573, 81, 3075, 3219, 4264, 454, 122, 1333, 3807, 2801, 1721, 4793, 3765, 790, 1004, 1597, 2448, 1006, 3441};
		int centsPerDollar[]={3798, 3921, 4523, 3847, 3159, 1956, 1609, 592, 4391, 3366, 1140, 2409, 1088, 4493, 2052, 2011, 670, 2319, 1680, 3651, 121, 1383, 1647, 1821, 3471, 234, 4368, 1677, 2038, 4554, 967, 1810, 4311, 2126, 3134, 986, 1678, 2363, 3552, 4411, 1408, 1585, 1710, 1041, 4694, 4206, 4752, 1598, 3986, 2058};
		int finalResult=38;
		System.out.println(moneyMade(amounts,centsPerDollar,finalResult));
	}
	public static int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult){
		int betAmount=0;
		int amountWon=1;
		for(int i=0;i<amounts.length;i++){
			if(i!=finalResult){
				betAmount+=amounts[i];
			}else{
				amountWon=amounts[i]*centsPerDollar[i];
			}
		}
		return(betAmount*100-amountWon);
	}
}