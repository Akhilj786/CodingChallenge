package LeetCode;

public class TrapRain {

	public static void main(String args[]) {
		int array[] = {2,1,1};
		System.out.println(trapRainWater(array));

	}

	public static int trapRainWater(int array[]) {
		int sum=0;
		int len=array.length;
		int left[]=new int[len];
		int right[]=new int[len];
		left[0]=array[0];
		for(int i=1;i<len;i++)
			left[i]=Math.max(left[i-1],array[i]);
		
		right[len-1]=array[len-1];
		for(int i=len-2;i>=0;i--)
			right[i]=Math.max(right[i+1],array[i]);
		
		for(int i=0;i<len;i++)
			sum+=Math.min(left[i],right[i])-array[i];
			
		return sum;
	}
}
