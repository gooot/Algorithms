
import java.util.Scanner;

public class Main {

	public static int[] arr;
	public static boolean[] visit;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();
		int m = input.nextInt();

		arr = new int[n];
		visit = new boolean[n];
		dfs(n, m, 0);

	}

	public static void dfs(int n, int m, int dep) {

		if (dep == m) {
			for (int val : arr) {
				if (val != 0) {

					System.out.print(val + " ");
				}

			}
			System.out.println();
			return;

		}

		for (int i = 0; i < n; i++) {
			if (!visit[i]) {
				visit[i] = true;
				arr[dep] = i + 1;
				dfs(n, m, dep + 1);
				visit[i] = false;
			}
		}

	}

}