import java.io.*;
import java.util.*;
public class LookAndSay{
	public static void main(String args[]){
		printSay("1",0,8);
	}
	public static void printSay(String num,int current,int total){
		System.out.println(num);
		current++;
		if(current==total)
			return;
		else{
			String newnumber=calcuate(num);
			printSay(newnumber,current,total);
		}
	}

	public static String calcuate(String num){
		int count=1;
		String res="";
		int prev=(int)(num.charAt(0)-'0');
		if(num.length()==1){
			res+=count+""+prev;
		}
		for(int i=1;i<num.length();i++){
			int curr=num.charAt(i)-'0';
			if(prev==curr)
				count++;
			else if( prev!=curr){
				res+=count+""+prev;
				prev=curr;
				count=1;
			}
			if(i==num.length()-1 && prev==curr){
				res+=count+""+curr;
			}

		}
		

		return res;
	}


}