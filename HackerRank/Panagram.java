import java.io.*;
import java.util.*;
public class Panagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        System.out.println(checkpanagram(str.toLowerCase())==true?"pangram":"not pangram");
    }
    
    public static boolean checkpanagram(String s){
    	if(s.length()<26)
    		return false;
    	boolean checkString[]=new boolean[26];
    	for(int i=0;i<s.length();i++){
    		char c=s.charAt(i);
    		if(c>='a' && c<='z'){
    			int k=(int)c-97;
    			checkString[k]=true;
    		}
    	}
    	for(int i=0;i<26;i++)
    		if(!checkString[i])
    			return false;
    	return true;
    }
    
}