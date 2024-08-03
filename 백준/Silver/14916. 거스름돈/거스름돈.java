import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {

		int price = 0;
		int change = 0;

		Map<String, Integer> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		price = Integer.parseInt(br.readLine());

		change = setUp(map, price, change);



		while (map.get("5") >= 0) {

			if(change==0){
				System.out.println(map.get("5"));
				break;
			}


			if (countChange(map, change)) {
				System.out.println(map.get("5")+map.get("2"));
				break;
			} else {
				map.put("5",map.get("5")-1);
				change+=5;
			}

		}
		if(map.get("5")==-1)
			System.out.println("-1");


	}

	public static int setUp(Map<String, Integer> map, int price,int change) {
		map.put("5", 0);
		map.put("2", 0);
		map.put("5", price / 5);
		change = price - (map.get("5")) * 5;
		return price - ((map.get("5")) * 5);

	}

	public static boolean countChange(Map<String, Integer> map, int change) {
		if (change % 2 == 0) {
			map.put("2", change / 2);
			return true;
		} else {
			return false;
		}

	}

}