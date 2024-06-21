import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s1 = new Scanner(System.in);
		int x =s1.nextInt();
		int y =s1.nextInt();
		
		if(x>0) {
			if(y>0) {
				
				System.out.println("1");
			} else {
				System.out.println("4");
			}
			
		} else {
			
			if(y>0) {
				System.out.println("2");
			} else {
				System.out.println("3");
			}
			
		}
		
		
		
	
		
	}

}
