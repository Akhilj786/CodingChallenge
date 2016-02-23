package Codility;

public class BinaryGap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]={51712};
		for(int i:array)
			System.out.println(solution(i));
	}
	 public static int solution(int N) {
	        // write your code in Java SE 8
	        String str=Integer.toString(N,2);
	        int count=0;
	        int max_count=Integer.MIN_VALUE;
	        for(int i=0;i<str.length();i++){
	                char temp=str.charAt(i);
	                if(temp=='0')
	                    count++;
	                else{
	                        if(count>max_count){
	                                max_count=count;
	                                count=0;
	                            }
	                    }
	                
	            }

	        return max_count;
	    }
}
