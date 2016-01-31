package HackerRank;
import java.util.*;
public class IntroSort{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int search=s.nextInt();
        int len=s.nextInt();
        if((search>=-1000 && search<=1000)&&(1<=len && len<=1000)){
            int array[]=new int[len];
            for(int i=0;i<len;i++){
                array[i]=s.nextInt();
            }
            System.out.println(search(array,search));
        }
    }


public static int search(int array[],int search){
        int low=0;
        int high=array.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(array[mid]==search)
                return mid;
            else if(array[mid]<search)
                low=mid+1;
            else
                high=mid;
        }
        return -1;
    }
}