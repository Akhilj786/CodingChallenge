package InterviewBit;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class PLUS1 {
	public static void main(String args[]){
		/*ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		plusOne(list);*/
		System.out.println(scalarProduct());
		
	}
	public static  ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		ArrayList<Integer> res=new ArrayList<Integer>();
		int num=0;
		for(int i=0;i<a.size();i++){
			num=num*10+a.get(i);
		}
		//System.out.println(num);
		num+=1;
		int reversenum=0;
		while(num>0){
			int rem=num%10;
			num/=10;
			reversenum=reversenum*10+rem;
		}
		System.out.println(reversenum);
		while(reversenum>0){
			int rem=reversenum%10;
			reversenum/=10;
			res.add(rem);
		}
		System.out.println(res);
		return res;
		
	}
	
	public static int scalarProduct(){
		Scanner in = new Scanner(System.in);
		String noElements = in.nextLine();
		String[] kn = noElements.split("\\s+");
		int k = Integer.parseInt(kn[0]);
		int n = Integer.parseInt(kn[1]);
		Hashtable<Integer, Integer> vector1 = new Hashtable<Integer, Integer>();
		Hashtable<Integer, Integer> vector2 = new Hashtable<Integer, Integer>();
		int size = 0;
		for(int i=0; i<k; i++) {
			String line = in.nextLine();
			String[] split = line.split("\\s+");  
			int key = Integer.parseInt(split[0]);
			int value = Integer.parseInt(split[1]);
			vector1.put(key, value);
			size = size>key ? size : key;
		}
		for(int i=0; i<n; i++) {
			String line = in.nextLine();
			String[] split = line.split("\\s+");  
			int key = Integer.parseInt(split[0]);
			int value = Integer.parseInt(split[1]);
			vector2.put(key, value);
			size = size>key ? size : key;
		}
		int dotProd = 0;
		for(int i=0; i<=size; i++) {
			if(vector1.get(i) != null && vector2.get(i) != null) {
				dotProd += (vector1.get(i) * vector2.get(i));
			}
		}
		System.out.println(dotProd);
		return dotProd;
		
	}
}
