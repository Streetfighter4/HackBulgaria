package game;

import java.util.Scanner;

public class GameOfLife {
	static void printMap(boolean[][] map){
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				if(map[i][j]) {
					System.out.print("X");
				} else {
					System.out.print("O");
				}
			}
			System.out.println();
		}
	}

	static boolean inbounds(int x, int y){
		return x >= 0 && x < 15 && y >= 0 && y < 15;
	}
	
	static int neighbours(boolean[][] map,int i,int j) {
		int neighb = 0;
		for (int j2 = -1; j2 <= 1; j2++) {
			for (int j1 = -1; j1 <= 1; j1++) {
				if(j2 == 0 && j1 == 0) {continue;}
				if(inbounds(i + j2, j + j1)) {
					if(map[i + j2][j + j1]) {
						neighb++;
					}
				}
			}
		}
		return neighb;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		int cells;
		Scanner in = new Scanner(System.in);
		cells = in.nextInt();
		boolean[][] map = new boolean[15][15]; 
		
		for(int i = 0; i < 15; i++) {
			for(int j = 0; j < 15; j++) {
				map[i][j] = false; 
			}
		}
		
		for (int i = 0; i < cells; i++) {
			int x, y;
			x = in.nextInt();
			y = in.nextInt();
			map[x][y] = true;
		}
		
		while(true) {
			System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			printMap(map);
			Thread.sleep(1000);
			boolean[][] map2 = map.clone();

			for(int i = 0; i < 15; i++) {
				for(int j = 0; j < 15; j++) {
					if(map[i][j]) {
						System.out.println(neighbours(map, i, j));
						if(neighbours(map,i,j) >= 4 || neighbours(map,i,j) <= 1) {
							map2[i][j] = false;
						}
					} else {
						if(neighbours(map,i,j) == 3) {
							map2[i][j] = true;
						}
					}
				}
			}
			map = map2.clone();
		}
	}
}
