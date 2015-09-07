package UVAOnlineJudge;

//https://saicheems.wordpress.com/2014/05/06/uva-11150-cola/
public class Cola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={1,2,8,9,10,11,199,200};
		for(int cola:array)
		System.out.println(maxCola(cola));
	}

	public static int maxCola(int n) {
		if (n % 2 == 1)
			return (totalCola(n, 0));
		return totalCola(n, 2);
	}
	
	public static int totalCola(int noOfCola,int end){
		if(noOfCola==0)
			return 0;
		return noOfCola+ totalCola((noOfCola+end)/3,(noOfCola+end)%3);
	}

}
