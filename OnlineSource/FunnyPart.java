//https://www.reddit.com/r/dailyprogrammer/comments/3twuwf/20151123_challenge_242_easy_funny_plant/
package OnlineSource;
import java.util.*;

public class FunnyPart{

	public static void main(String args[]){
		int x[]={15,200,50000,150000};
		int y[]={1,15,1,250};
		for(int i=0;i<x.length;i++){
			System.out.println(noOfWeeks(x[i],y[i]));
		}
	}
	public static int noOfWeeks(int x,int y){
		int weeks=0;
		int f1=0;
		int f2=y;
		int f3=1;
		while(f1<x){
			f1=f1+f2;
			f2=f1+f2;
			f3++;
		}
		return f3;
	}
}