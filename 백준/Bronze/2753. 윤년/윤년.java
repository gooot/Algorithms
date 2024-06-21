import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		int year =s1.nextInt();
		
		if(year%4==0 && (year%100 != 0 || year%400==0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
			
		
		
	}

}
