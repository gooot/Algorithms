import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static int[] liquids;
	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number = Integer.parseInt(br.readLine());

		StringTokenizer st = new StringTokenizer(br.readLine());

		liquids = new int[number];

		for(int i =0 ; i<number ; i++){
			liquids[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(liquids); // 용액 배열을 정렬

		int[] result = new int[3]; // 결과를 저장할 배열 (세 개의 용액)
		long minDiff = Long.MAX_VALUE; // 최소 합 차이를 저장할 변수 초기화

		// 첫 번째 용액을 고정하고 두 번째, 세 번째 용액을 찾기 위한 반복문
		for (int i = 0; i < number - 2; i++) {
			int left = i + 1; // 두 번째 용액의 인덱스 시작
			int right = number - 1; // 세 번째 용액의 인덱스 시작

			// 두 번째와 세 번째 용액의 인덱스를 조정하는 반복문
			while (left < right) {
				// 현재 선택된 세 용액의 합 계산
				long sum = (long) liquids[i] + liquids[left] + liquids[right];

				// 현재 합의 절대값이 최소 차이보다 작으면 업데이트
				if (Math.abs(sum) < minDiff) {
					minDiff = Math.abs(sum); // 최소 차이 갱신
					result[0] = liquids[i]; // 첫 번째 용액 저장
					result[1] = liquids[left]; // 두 번째 용액 저장
					result[2] = liquids[right]; // 세 번째 용액 저장
				}

				// 합이 0보다 작으면 더 큰 값을 찾기 위해 left 인덱스 증가
				if (sum < 0) {
					left++;
				} else { // 합이 0보다 크면 더 작은 값을 찾기 위해 right 인덱스 감소
					right--;
				}
			}
		}

		Arrays.sort(result); // 결과 배열을 오름차순으로 정렬
		System.out.println(result[0] + " " + result[1] + " " + result[2]); // 결과 출력
	}
}
