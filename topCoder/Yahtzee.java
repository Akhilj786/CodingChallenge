package topCoder;
public class Yahtzee{
	public static void main(String args[]){
		int toss[][]={	{2, 2, 3, 5, 4},
					{6, 4, 1, 1, 3},
					{5, 3, 5, 3, 3},
					{2, 3, 2, 2, 3},
					{1, 1, 1, 1, 1},
					{3, 4, 4, 3, 6},
					{6, 4, 3, 6, 1},
					{1, 5, 1, 3, 2},
					{4, 6, 4, 6, 1},
					{6, 1, 1, 6, 3}};
		for(int i=0;i<toss.length;i++)
			System.out.println(maxPoints(toss[i]));

	}
	public static int maxPoints(int[] toss){
		int max=0;
		for(int i=0;i<toss.length-1;i++){
			int currentMax=toss[i];
			for(int j=i+1;j<toss.length;j++){
				if(toss[i]==toss[j]){
					currentMax+=toss[j];
				}

			}
			if(max<currentMax)
				max=currentMax;
		}
		return max;
		
	}
}