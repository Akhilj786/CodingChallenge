package GeeksForGeeks;

import java.util.ArrayList;
import java.util.List;

public class Paranthesis {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		 List<String> result1=generateParenthesis(2);
		 System.out.println(result1);
		 List<String> result2=generateParenthesis1(2);
		 System.out.println(result2);
	}

	public static List<String> generateParenthesis(int n) {
	    ArrayList<String> result = new ArrayList<String>();
	    dfs(result, "", n, n);
	    return result;
	}
	
	public static List<String> generateParenthesis1(int n) {
	    ArrayList<String> result = new ArrayList<String>();
	    dfs1(result, "", n, n,n,n);
	    return result;
	}
	/*
	left and right represents the remaining number of ( and ) that need to be added. 
	When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops. 
	*/
	public static void dfs(ArrayList<String> result, String s, int left, int right){
	    if(left > right)
	        return;
	 
	    if(left==0&&right==0){
	        result.add(s);
	        return;
	    }
	 
	    if(left>0){
	        dfs(result, s+"(", left-1, right);
	    }
	 
	    if(right>0){
	        dfs(result, s+")", left, right-1);
	    }
	}
	
	public static void dfs1(ArrayList<String> result, String s, int left1, int right1,int left2,int right2){
		if(left1>right1 || left2>right2)
			return;
		if((left1==0&&right1==0) || (left2==0&&right2==0)){
			result.add(s);
			return;
		}
		if(left1>0){
	        dfs1(result, s+"(", left1-1, right1,left2,right2);
	    }
	 
	    if(right1>0){
	        dfs1(result, s+")", left1, right1-1,left2,right2);
	    }
	    if(left2>0){
	        dfs1(result, s+"{", left1, right2,left2-1,right2);
	    }
	 
	    if(right2>0){
	        dfs1(result, s+"}", left2, right2,left2,right2-1);
	    }
	}
	
}
