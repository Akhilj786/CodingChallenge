package ProgrammingElements.Chapter7;

public class solution7_3 {
	public String keypadMap[]={"0","1","ABC", "DEF", "GHI","JKL", "MNO", "PQRS", "TUV","WXYZ"};
	
	
	public void keypadImplementation(String number){
		char ans[]=new char[10];
		phone_mneomonic_helper(number,0,ans);
	}
	
	public void phone_mneomonic_helper(String number,int d,char ans[]){
		if(d==number.length())
			System.out.println(ans);
		else{
			for(char c:keypadMap[number.charAt(d)-'0'].toCharArray()){
				ans[d]=c;
				phone_mneomonic_helper(number, d+1, ans);
			}
		}
	}
}
