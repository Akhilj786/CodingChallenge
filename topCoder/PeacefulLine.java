//https://community.topcoder.com/stat?c=problem_statement&pm=13632&rd=16279
package topCoder;
public class PeacefulLine{
	public static void main(String args[]){
		int array[]={1,1,1,2};
		System.out.println(makeLine(array));
	}
	public static String makeLine(int[] x){
		if(isMajority(x,findMax(x)))
			return "impossible";
		else return "possible";
	}
	public static int findMax(int array[]){
		int maj_index=0;
		int count=1;
		for(int i=1;i<array.length;i++){
			if(array[maj_index]==array[i])
				count++;
			else
				count--;
			if(count==0){
				maj_index=i;
				count=1;
			}
		}
		return array[maj_index];
	}
	public static boolean isMajority(int array[],int elem){
		int count=0;
		int n=array.length;
		for(int i:array){
			if(i==elem)
				count++;
		}
		if(n%2==1){
			if(count>(n+1)/2)
				return true;
			else 
				return false;
		}else{
			if(count>n/2)
				return true;
			else 
				return false;
		}
	}
}