package topCoder;
import java.util.*;
public class PaperFold{
	public static void main(String args[]){
		
		 	
		int paper[]={1895, 6416};
		int box[]={401, 1000};
		System.out.println(numFolds(paper,box));

	}

	public static int numFolds(int paper[],int box[]){
		int x=box[0];
		int y=box[1];
		int folds1=0;
		while(x<paper[0]){
			folds1++;
			x*=2;
		}
		while(y<paper[1]){
			folds1++;
			y*=2;
		}
		int folds2=0;
		x=box[1];
		y=box[0];
		while(x<paper[0]){
			folds2++;
			x*=2;
		}
		while(y<paper[1]){
			folds2++;
			y*=2;
		}
		int count=Math.min(folds1,folds2);
		return (count<=8?count:-1);
	}

/*		
Below Code suffers from a problem when we have a paper size already less than requred.
*/
	public static int numFolds1(int[] paper, int[] box){
		int count=0;
		while(count<=8){
			if(isFit(paper,box) || isRotateFit(paper,box))
				return count;
			else{
				Arrays.sort(paper);
				paper[1]=(int)Math.ceil(paper[1]/2.0);
				displayPaper(paper);
				count++;
			}
		}
		return (count<=8?count:-1);
	}
	public static boolean isFit(int paper[],int box[]){

		for(int i=0;i<paper.length;i++)
			if(paper[i]>box[i])
				return false;
		return true;
	}
	public static boolean isRotateFit(int paper[],int box[]){
		int temp=paper[0];
		paper[0]=paper[1];
		paper[1]=temp;
		return(isFit(paper,box));
	}
	public static void displayPaper(int paper[]){
		for(int i=0;i<paper.length;i++)
			System.out.print(paper[i]+" ");
		System.out.println();
	}
}