package ProjectEuler;
import java.io.*;
import java.util.*;
public class Multiple35{
	public static void main(String args[]){
		int a=sumMultiple(100);
		System.out.println(a);
	}
	public static int sumMultiple(int n){
		int sum=0;
		for(int i=1;i<n;i++){
			if(i%3==0|| i%5==0)
				sum+=i;
		}
		return sum;
	}
}