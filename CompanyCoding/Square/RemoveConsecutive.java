package CompanyCoding.Square;
import java.io.*;
import java.util.*;
public class RemoveConsecutive{
	public static void main(String args[]){
		System.out.println(removeUnderscore("_hello___world__"));
	}

	public static String removeUnderscore(String str){
		int count=0;
		boolean flag=false;
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i++){
			char c=str.charAt(i);
			if(c!='_'){
				sb.append(c);
				flag=false;
			}
			else{
				if(!flag){
					sb.append(c);
					flag=true;
				}
			}
		}
		return new String(sb);
	}
}