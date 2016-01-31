package LeetCode;
import java.util.*;

public class SortStack{
	public static void main(String args[]){
		int array[]={5, 2, 1, 9, 0, 10};
		Stack<Integer> stack=new Stack<Integer>();
		for(int i:array)
			stack.add(i);
		// Using Merge Sort Algo
		System.out.println(sort1(stack));
		System.out.println(sort2(stack));

	}
	// Merge Sort
	public static Stack<Integer> sort1(Stack<Integer> s){
		if(s.isEmpty())
			return s;
		int pivot=s.pop();
		Stack<Integer> left=new Stack<Integer>();
		Stack<Integer> right=new Stack<Integer>();
		while(!s.isEmpty()){
			int temp=s.pop();
			if(temp>pivot)
				right.add(temp);
			else
				left.add(temp);
		}
		sort1(left);
		sort1(right);
		Stack<Integer> tmp=new Stack<Integer>();
		while(!right.isEmpty()) {
    		tmp.push(right.pop());
  		}
  		tmp.push(pivot);
  		while(!left.isEmpty()) {
    		tmp.push(left.pop());
  		}
  		while(!tmp.isEmpty()) {
    		s.push(tmp.pop());
  		}
  		return s;
	}
	// Insertion Sort
	public static Stack<Integer> sort2(Stack<Integer> stack1){
		Stack<Integer> stack2=new Stack<Integer>();
		stack2.push(stack1.pop());
		while(!stack2.isEmpty()){
			int temp=stack2.pop();
			while(!stack1.isEmpty() && stack1.peek()>temp ){
				stack2.push(stack1.pop());
			}
			stack1.push(temp);
			
		}
		return stack1;
	}
}