package topCoder;
import java.util.*;

// Does not work.
public class JanuszTheBusinessman{
	public static void main(String args[]){
			int arrivals[]={8, 12, 20, 30, 54, 54, 68, 75};
			int departures[]={13, 31, 30, 53, 55, 70, 80, 76};
			System.out.println(makeGuestsReturn(arrivals,departures));
	}
	public static int makeGuestsReturn(int[] arrivals, int[] departures){
		
		Guest guestObj[]=new Guest[arrivals.length];
		for(int i=0;i<arrivals.length;i++){
			guestObj[i]=new Guest(arrivals[i],departures[i]);
		}
		Arrays.sort(guestObj);
		return minPromotion(guestObj);
	}
	public static int minPromotion(Guest guestObj[]){
		Stack<Guest> stack=new Stack<Guest>();
		stack.add(guestObj[0]);
		for (int i = 1; i < guestObj.length; i++) {
			Guest g1 = stack.peek();
			Guest g2 = guestObj[i];
			if (overlap(g1, g2)) {
				// Update the merge stack
				if (g1.departure < g2.departure)
					g1.departure = g2.departure;

				stack.pop();
				stack.push(g1);

			} else {
				stack.add(g2);
			}

		}
		int size=stack.size();
		while(!stack.isEmpty()){
			System.out.println(stack.pop());
		}
		return size;
	}
	public static boolean overlap(Guest g1, Guest g2) {
		boolean flag = false;

		if (g1.arrival <= g2.arrival && g1.departure >= g2.arrival)
			flag = true;

		return flag;
	}


}
class Guest implements Comparable{
	int arrival;
	int departure;
	Guest(int x,int y){
		this.arrival=x;
		this.departure=y;
	}
	public int compareTo(Object obj){
		Guest g=(Guest)obj;
		return (this.arrival > g.arrival) ? 1 : -1;
	}
	public  String toString(){
		return new String(arrival+"<->"+departure);
	}
}