import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int i = Integer.parseInt(br.readLine());
		String str;
		String a;
		String b;

		for (int j = 0; j < i; j++) {
			str = br.readLine();

			a = str.substring(0, 1);
			b = str.substring(2, 3);
			System.out.println(add(a, b));
		}

	}

	static int add(String a, String b) {

		return Integer.parseInt(a) + Integer.parseInt(b);
	}
}