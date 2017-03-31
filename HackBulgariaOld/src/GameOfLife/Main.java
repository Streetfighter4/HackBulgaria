package GameOfLife;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.LeafElement;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		int countCell = sc.nextInt();

		List<LifeCell> Life = new ArrayList<>();
		sc.nextLine();
		int MAX_X = 15;
		int MAX_Y = 15;
		int[][] array = new int[MAX_X][MAX_Y];
		int[][] array2 = new int[MAX_X][MAX_Y];
		for (int i = 0; i < MAX_X; i++) {
			for (int j = 0; j < MAX_Y; j++) {
				array[i][j] = 0;
				array2[i][j] = 0;
			}
		}

		for (int c = 0; c < countCell; c++) {
			String[] pair = sc.nextLine().split(" ");

			int x = Integer.parseInt(pair[0]);
			int y = Integer.parseInt(pair[1]);
			array[x][y] = 1;
		}
		
		for (int i = 0; i < 14; i++) {
			for (int j = 0; j < 14; j++) {
				if (array[i][j] == 1) {
					System.out.print("■ ");
				} else {
					System.out.print("□ ");
				}
			}
			System.out.println();
		}
		// for (LifeCell lifeCell : Life) {
		// System.out.println(lifeCell.getX() + " " + lifeCell.getY());
		// }

		System.out.println();
		System.out.println();
		System.out.println();
				
		while (true) {
			int count = 0;
			int num = 0;
			for (int x = 0; x < 14; x++) {
				for (int y = 0; y < 14; y++) {
					if (array[x][y] == 1) {
						if ((x - 1) > 0 && (y - 1) > 0) {
							if (array[x - 1][y - 1] == 1)
								count++;
						} else if ((x - 1) >= 0) {
							if (array[x - 1][y] == 1)
								count++;
						} else if ((x - 1) >= 0 && (y + 1) <= MAX_Y) {
							if (array[x - 1][y + 1] == 1)
								count++;
						} else if ((x - 1) >= 0) {
							if (array[x - 1][y] == 1)
								count++;
						} else if ((x + 1) <= MAX_X) {
							if (array[x + 1][y] == 1)
								count++;
						} else if ((x - 1) >= 0) {
							if (array[x - 1][y] == 1)
								count++;
						} else if ((x - 1) >= 0 && (y + 1) <= MAX_Y) {
							if (array[x - 1][y + 1] == 1)
								count++;
						} else if ((y + 1) <= MAX_Y) {
							if (array[x][y + 1] == 1)
								count++;
						} else if ((x + 1) <= MAX_X && (y + 1) <= MAX_Y) {
							if (array[x + 1][y + 1] == 1)
								count++;
						}
						if (count < 2 || count > 3) {
							array2[x][y] = 0;
						}
					}
					if (array[x][y] == 0) {
						if ((x - 1) >= 0 && (y - 1) >= 0) {
							if (array[x - 1][y - 1] == 1)
								num++;
						} else if ((x - 1) >= 0) {
							if (array[x - 1][y] == 1)
								num++;
						} else if ((x - 1) >= 0 && (y + 1) <= MAX_Y) {
							if (array[x - 1][y + 1] == 1)
								num++;
						} else if ((x - 1) >= 0) {
							if (array[x - 1][y] == 1)
								num++;
						} else if ((x + 1) <= MAX_X) {
							if (array[x + 1][y] == 1)
								num++;
						} else if ((x - 1) >= 0) {
							if (array[x - 1][y] == 1)
								num++;
						} else if ((x - 1) >= 0 && (y + 1) <= MAX_Y) {
							if (array[x - 1][y + 1] == 1)
								num++;
						} else if ((y + 1) <= MAX_Y) {
							if (array[x][y + 1] == 1)
								num++;
						} else if ((x + 1) <= MAX_X && (y + 1) <= MAX_Y) {
							if (array[x + 1][y + 1] == 1)
								num++;
						}
						if (num == 3) {
							array2[x][y] = 1;
						}
					}
				}
			}
			
			for (int i = 0; i < 14; i++) {
				for (int j = 0; j < 14; j++) {
					array[i][j] = array2[i][j];
				}
			}
			
			for (int i = 0; i < 14; i++) {
				for (int j = 0; j < 14; j++) {
					if (array[i][j] == 1) {
						System.out.println(i + " " + j);
					}
				}
			}
			
			for (int i = 0; i < 14; i++) {
				for (int j = 0; j < 14; j++) {
					array2[i][j] = 0;
				}
			}
			
			for (int i = 0; i < 14; i++) {
				for (int j = 0; j < 14; j++) {
					if (array[i][j] == 1) {
						System.out.print("■ ");
					} else {
						System.out.print("□ ");
					}
				}
				System.out.println();
			}
			Thread.sleep(1000);
			System.out.println();
			System.out.println();
			System.out.println();
		}

	}

}
