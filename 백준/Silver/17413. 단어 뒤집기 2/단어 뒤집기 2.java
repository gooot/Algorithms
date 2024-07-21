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
		String str = br.readLine();
		int index = 0;

		StringBuilder sb = new StringBuilder();
		StringBuilder sbReverse = new StringBuilder();

		boolean flag = false;

		for(int i =0 ;i<str.length();i++){

			if(str.charAt(i)=='<'){
				flag = true;
			}


			// reverse
			if(flag){

				sb.append(str.charAt(i));

			} else {

				if(str.charAt(i)==' '){
					sbReverse.reverse();
					sbReverse.append(str.charAt(i));
					sb.append(sbReverse);
					sbReverse.setLength(0);

				} else if(i<str.length()-1 && str.charAt(i+1)=='<') {

					sbReverse.append(str.charAt(i));
					sbReverse.reverse();
					sb.append(sbReverse);
					sbReverse.setLength(0);
				} else if (i==str.length()-1){
					sbReverse.append(str.charAt(i));
					sbReverse.reverse();
					sb.append(sbReverse);
					sbReverse.setLength(0);
				} else {
					sbReverse.append(str.charAt(i));
				}


			}

			if(str.charAt(i)=='>'){
				flag = false;
			}


		}

		System.out.println(sb.toString());




	}
}