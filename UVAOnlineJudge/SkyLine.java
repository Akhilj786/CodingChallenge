package UVAOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class SkyLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mergeSkyline();
	}

	public static void mergeSkyline() {
		int left[] = new int[6000];
		int right[] = new int[6000];
		int height[] = new int[6000];
		int skyline[] = new int[50000];
		int max_R = 0;
		Scanner s = new Scanner(System.in);
		for (int i = 0; i < 8; i++) {
			left[i] = s.nextInt();
			height[i] = s.nextInt();
			right[i] = s.nextInt();
			
			for (int j = left[i]; j < right[i]; j++) {
				if (height[i] > skyline[j])
					skyline[j] = height[i];
			}
			if (max_R < right[i])
				max_R = right[i];
			// if(("%d %d %d",left[i],height[i],right[i]) != 3) break;
		}
		int current = 0;
		for (int i = 0; i <= max_R; i++) {
			if (skyline[i] != current) {
				System.out.print(i + " " + skyline[i]+" ");
				current = skyline[i];
			}
		}

	}

}
