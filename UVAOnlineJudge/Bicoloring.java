package UVAOnlineJudge;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/*
 *  Bicolorable Problem: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=945
 *  Logic is simply finding if there is any cycles in the graph
 */

public class Bicoloring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vertices = -1;
		int edges = 0;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		while ((vertices = s.nextInt()) != 0) {
			int graph[][] = new int[vertices][vertices];
			edges = s.nextInt();
			int temp = 0;
			for (int i = 0; i < edges; i++) {
				int a = s.nextInt();
				int b = s.nextInt();
				fillGraph(graph, a, b);
				temp = b;
			}
			// printGraph(graph);
			if (isBiColorAble(graph, temp, vertices))
				System.out.println("BICOLORABLE.");
			else
				System.out.println("NOT BICOLORABLE.");
		}

	}

	public static void fillGraph(int graph[][], int a, int b) {
		graph[a][b] = graph[b][a] = 1;

	}

	public static void printGraph(int graph[][]) {
		for (int i = 0; i < graph.length; i++) {
			for (int j = 0; j < graph[0].length; j++) {
				System.out.print(graph[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static boolean isBiColorAble(int adj[][], int s, int n) {
		boolean visited[] = new boolean[n];
		int parent[] = new int[n];
		Queue<Integer> q = new ArrayDeque<Integer>();

		for (int i = 0; i < n; i++) {
			visited[i] = false;
			parent[i] = -1;
		}

		q.add(s);
		visited[s] = true;
		parent[s] = Integer.MAX_VALUE;

		while (!q.isEmpty()) {
			int temp = q.remove();
			for (int i = 0; i < n; i++) {
				if (adj[temp][i] == 1) {
					if (visited[i]) {
						if (parent[i] != temp && parent[temp] != i)
							return false;
					} else {
						visited[i] = true;
						parent[i] = temp;
						q.add(i);
					}
				}
			}

		}

		return true;
	}

}
