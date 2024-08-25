import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int m;
	static int garbage;
	static int count;
	static boolean[][] visit;
	static int[][] map;
	static int max=0;

	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,1,-1};


	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		garbage = Integer.parseInt(st.nextToken());



		visit = new boolean[n][m];
		map = new int[n][m];

		for(int i = 0; i< garbage; i++){
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken())-1;
			int b = Integer.parseInt(st.nextToken())-1;
			map[a][b] = 1;

		}

		for(int i =0;i<n;i++){
			for(int j=0;j<m;j++){
				if(!visit[i][j] && map[i][j]==1){
					DFS(i,j);
					max = Integer.max(max, count);
					count=0;

				}
			}
		}
		System.out.println(max);



	}
	public static void DFS(int x, int y){
		visit[x][y]=true;
		count++;

		for(int i=0;i<4;i++){
			int nextX = x + dx[i];
			int nextY = y + dy[i];

			if(nextX >= 0 && nextY >= 0 && nextX < n && nextY < m){
				if(!visit[nextX][nextY] && map[nextX][nextY]==1){
					DFS(nextX,nextY);
				}
			}
		}

	}
}