import java.io.*;
import java.util.*;
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        primeNumber(k);
    }

    //에라토스테네스의 체 메서드
    static void primeNumber(int k) {
        int[] arr = new int[10000001];  //k의 범위 50만까지여서 배열은 크게 선언
        int n = 10000000;
        //배열 초기화
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        //2부터 시작해서 i의 배수들을 배열에서 지워준다
        for (int i = 2; i <= n; i++) {
            //이미 지워진 수는 건너뛴다
            if (arr[i] == 0) continue;
            for (int j = i+i; j <= n; j += i) {
                arr[j] = 0;
            }
        }

        int count = 1;
        
        //k번째 소수 출력하기
        for (int i = 2; i <= n; i++) {
            if (arr[i] != 0) {
                if (count == k) {
                    System.out.print(i);
                    break;
                }
                count++;
            }
        }
    }
}