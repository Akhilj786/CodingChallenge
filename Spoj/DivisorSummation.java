package Spoj;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DivisorSummation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int total_test = sc.nextInt();
		while (total_test > 0) {
			total_test--;
			int num = sc.nextInt();
			divisorSummation(num);
			
		}
	}

	public static void divisorSummation(int num) {
		long sum = 0;
		int i = 1;
		for (; Math.pow(i, 2) < num; i++){
			if (num % i == 0)
				sum += i + (num / i);
			}
		if (i * i == num)
			sum += i;
		sum -= num;
		System.out.println(sum);
	}
	
	public static void halfOfHalf(){
		Scanner s=new Scanner(System.in);
		int testCase=s.nextInt();
		while(testCase>0){
			String str=s.nextLine();
		
			int i=0;
			while(i<(str.length()/2)){
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
		s.close();
	}

}
