package HackerRank;

import java.util.*;

public class ServiceLane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getVehicle();
	}

	public static void getVehicle() {
		Scanner s = new Scanner(System.in);
		int len = s.nextInt();
		int test = s.nextInt();
		int lane[] = new int[len];

		for (int i = 0; i < len; i++) {
			lane[i] = s.nextInt();
		}
		for (int i = 0; i < test; i++) {
			int start = s.nextInt();
			int end = s.nextInt();
			System.out.println(printVehicleNumber(lane, start, end));
		}
	}

	public static int printVehicleNumber(int lane[], int start, int end) {
		int min = lane[start];
		for (int i = start; i <= end; i++) {
			if (lane[i] < min)
				min = lane[i];
		}
		return min;

	}

}
