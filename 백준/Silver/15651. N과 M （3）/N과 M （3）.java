
import java.util.Scanner;

public class Main {

	public static int[] arr;
	public static int n;
	public static int m;
	public static StringBuilder sb;

	public static void main(String[] args) {

		sb = new StringBuilder();

		Scanner input = new Scanner(System.in);

		n = input.nextInt();
		m = input.nextInt();

		arr = new int[m];

		dfs(0);

		System.out.println(sb);

	}

	public static void dfs(int dep) {

		if (m == dep) {
			for (int i = 0; i < m; i++) {
				sb.append(arr[i] + " ");
			}

			sb.append("\n");
			return;

		}

		for (int i = 1; i <= n; i++) {
			arr[dep] = i;
			dfs(dep + 1);
		}

	}

}