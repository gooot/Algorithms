import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] liquids = new int[n];
        
        for (int i = 0; i < n; i++) {
            liquids[i] = sc.nextInt();
        }
        
        Arrays.sort(liquids);
        
        int[] result = new int[3];
        long minDiff = Long.MAX_VALUE;
        
        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            
            while (left < right) {
                long sum = (long) liquids[i] + liquids[left] + liquids[right];
                
                if (Math.abs(sum) < minDiff) {
                    minDiff = Math.abs(sum);
                    result[0] = liquids[i];
                    result[1] = liquids[left];
                    result[2] = liquids[right];
                }
                
                if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        Arrays.sort(result);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}
