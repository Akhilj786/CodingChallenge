package LeetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class MaxSlidingWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 7, 2, 4 };
		int result[] = maxSlidingWindow2(array, 2);
		for (int i : result)
			System.out.println(i + " ");
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (k == 0)
			return new int[0];

		int result[] = new int[nums.length - k + 1];
		int maxVal[] = new int[2];
		maxVal = maxVal(nums, 0, k - 1);
		result[0] = maxVal[0];
		for (int i = k; i < nums.length; i++) {
			if (maxVal[1] != (i - k)) {
				if (maxVal[0] < nums[i]) {
					maxVal[0] = nums[i];
					maxVal[1] = i;
				}

			} else {
				maxVal = maxVal(nums, (i - k + 1), i);
			}
			result[i - k + 1] = maxVal[0];
		}

		return result;

	}

	public static int[] maxVal(int array[], int start, int end) {
		int maxVal[] = new int[2];
		int max = Integer.MIN_VALUE;
		for (int i = start; i <= end; i++) {
			if (max < array[i]) {
				max = array[i];
				maxVal[0] = max;
				maxVal[1] = i;
			}
		}

		return maxVal;
	}

	// Better Solution -> O(n)
	public static int[] maxSlidingWindow2(int nums[], int k) {
		int result[] = new int[nums.length - k + 1];
		Deque<Integer> dq = new ArrayDeque<Integer>();
		for (int i = 0; i < k; i++) {
			while (!dq.isEmpty() && nums[i] > nums[dq.getLast()])
				dq.removeLast();
			dq.addLast(i);
		}
		for (int i = k; i < nums.length; i++) {
			result[i - k] = nums[dq.getFirst()];
			while (!dq.isEmpty() && nums[i] > nums[dq.getLast()])
				dq.removeLast();
			while (!dq.isEmpty() && dq.getFirst() <= i - k)
				dq.removeFirst();
			dq.addLast(i);
		}
		result[nums.length - k] = nums[dq.getFirst()];
		return result;
	}
}
