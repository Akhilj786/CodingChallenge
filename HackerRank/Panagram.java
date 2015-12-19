package HackerRank;

import java.util.Scanner;

public class Panagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 boolean array[]=new boolean[26];
	        boolean flag=false;
	        @SuppressWarnings("resource")
			Scanner s=new Scanner(System.in);
	        String str=s.nextLine();
	        for(char c:str.toLowerCase().toCharArray()){
	            if(c!=' '){
	            int a=(int)c-97;
	            array[a]=true;
	            }
	        }
	        for(int i=0;i<26;i++){
	            if(!array[i])
	                flag=true;
	        }
	        System.out.println(flag==true?"not pangram":"pangram");
	}

}
