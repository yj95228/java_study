package com.edu;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Kickboard {

		static int M;
		static int N;
		static int[][] map;
		static boolean[][] visited;

		public static int execute(File path) throws FileNotFoundException {
			//Scanner sc = new Scanner(System.in);
			Scanner sc = new Scanner(path);
			M = sc.nextInt();
			N = sc.nextInt();
			map = new int[M][N];
			memo = new int[M][N];
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++)
					map[i][j] = sc.nextInt();
			}
			visited = new boolean[M][N];
			int result = dfs(0,0);
			//System.out.println(result);		
			return result;
		}

		static int[] dr = { -1, 1, 0, 0 };
		static int[] dc = { 0, 0, -1, 1 };
		static int[][] memo;

		static int cnt = 0;
		static int dfs(int r, int c) {
			//cnt++;
			if(r == M-1 && c == N-1) return 1;
			if(memo[r][c] != 0) return memo[r][c];
			
			//구현하기
			for (int i = 0; i < 4; i++) {
				int dx = dr[i];
				int dy = dc[i];
				
				int nx = r+dx;
				int ny = c+dy;
				if(nx < 0 || ny < 0 || nx >= M || ny >= N) continue;
				if(map[r][c] > map[nx][ny]) {
					memo[r][c] += dfs(nx, ny);
				}
			}
			
			return memo[r][c];
		}
		
		public static void main(String[] args) throws FileNotFoundException {
			System.out.println(execute(new File("input.txt")));
		}

}
