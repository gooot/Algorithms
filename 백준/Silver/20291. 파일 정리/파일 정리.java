import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		HashMap<String,Integer> map = new HashMap<>();


		int n;
		while(true){

			String str = br.readLine();
			if(!str.contains(".")){
				continue;
			}

			int dot =  str.indexOf('.');
			str = str.substring(dot+1);
			map.put(str,map.getOrDefault(str,0)+1);

			if(!br.ready()){
				break;
			}



		}





		List<String> keyList = new ArrayList<>(map.keySet());



		Collections.sort(keyList);



		for(int i=0;i<keyList.size();i++){
			System.out.println(keyList.get(i)+" "+map.get(keyList.get(i)));
		}





	}
}