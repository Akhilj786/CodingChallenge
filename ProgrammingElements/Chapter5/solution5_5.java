package ProgrammingElements.Chapter5;

public class solution5_5 {

	// Which doors are open
	public boolean isOpen(int i) {
		double sqrt = Math.sqrt(i);
		int floor_sqrt = (int) Math.floor(sqrt);
		return (floor_sqrt * floor_sqrt == sqrt);
	}

	public void openGate(int n) {
		int result = 0;
		for (int i = 1; i <= n; i++) {
			if (isOpen(i))
				result++;
		}
		System.out.println("Total Open Gate:" + result);
	}
}
