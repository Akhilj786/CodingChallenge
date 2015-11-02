package CompanyCoding.Spotify;

public class ReverseBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String binaryString[]={"0","01","10","11"};
		for(String s:binaryString)
			System.out.println(binaryToInt(s));
	}
	
	public static int binaryToInt(String str){
		int number=0;
		int pow=0;
		for(int i=str.length()-1;i>=0;i--){
			int temp=str.charAt(i)-'0';
			number+=temp*Math.pow(2,pow);
			pow++;
		}
		return number;
	}
	
	

}
