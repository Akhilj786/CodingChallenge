package topCoder;
public class BacteriesColony{
	public static void main(String args[]){
		int array[]={32, 68, 50, 89, 34, 56, 47, 30, 82, 7, 21, 16, 82, 24, 91};
		int newArray[]=changeArray(array);
		for(int i:newArray)
			System.out.print(i+" ");
	}
	public static boolean incAnddec(int array[]){
		int copyArray[]=new int[array.length];
		for(int i=0;i<array.length;i++)
			copyArray[i]=array[i];
		boolean flag=false;
		for(int i=1;i<array.length-1;i++){
			if(array[i-1] >array[i] && array[i]<array[i+1]){
				copyArray[i]++;
				flag=true;
			}
			if(array[i-1]<array[i] && array[i]>array[i+1]){
				copyArray[i]--;
				flag=true;
			}
		}
		for(int i=0;i<array.length;i++)
			array[i]=copyArray[i];
		return flag;
	}

	public static int [] changeArray(int array[]){
		boolean flag=true;
		while(flag){
			flag=incAnddec(array);
		}
		return array;
	}
}