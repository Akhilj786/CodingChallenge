package CompanyCoding.Spotify;
import java.text.DateFormat;
import java.util.Collection;
import java.util.List;

import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.Date;

public class BestBefore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 dateHelper d=new dateHelper(10, 9, 10);
	 System.out.println(d.compute());
	}

}

class dateHelper {
	int A, B, C;
	int minYear = 2000;
	int maxYear = 2999;

	public dateHelper(int x, int y, int z) {
		if (x == 0)
			x = 2000;
		if (y == 0)
			y = 2000;
		if (z == 0)
			z = 2000;
		this.A=x;
		this.B=y;
		this.C=z;
	}

	public ArrayList<Date> compute() {
		ArrayList<Date> dateList=new ArrayList<>();
		ArrayList<Integer> numbers=new ArrayList<>();
		numbers.add(this.A);
		numbers.add(this.B);
		numbers.add(this.C);
		
		
		Collection<List<Integer>> orderPerm = 
	            Collections2.permutations(numbers);
		 for (List<Integer> val : orderPerm) {
			 
		      Date d=new Date();
		      
		      
		    }
		
		
		
		return dateList;

	}
}