import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {

				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		String answer="";
		char[][] charList = new char[5][15];

		for(int i =0;i<charList.length;i++) {
						String str = br.readLine();
			if(max<str.length()) {
				max = str.length();
			}

			for(int j=0;j<charList[i].length;j++) {

				if(j==str.length()){
					break;
				}
				charList[i][j]=str.charAt(j);
			}

		}

		for(int i=0;i<max;i++) {
			for(int j=0;j<5;j++) {
				if(charList[j][i]=='\u0000') {
					continue;
				} else {
					answer+=charList[j][i];
				}
			}
		}

		System.out.println(answer);


	}
}