import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
//1-D Array
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Array Size: ");
//		int size = sc.nextInt();
//		int [] numbers = new int[size];
//
//		// Input
//		for (int i = 0; i < size; i++) {
//			numbers[i] = sc.nextInt();
//		}
//
//		System.out.println("What Number you want to find: ");
//		int x = sc.nextInt();
//
//		// Output
//		for (int i = 0; i < size; i++) {
//			if (numbers[i] == x) {
//				System.out.println(x + " found at index [" + i+"]");
//			}
//		}

//2-D Array

		Scanner s = new Scanner(System.in);
		System.out.println("Enter Row Size: ");
		int row = s.nextInt();
		System.out.println("Enter Col Size: ");
		int col = s.nextInt();
		int[][] num = new int[row][col];

		// Input
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				num[i][j] = s.nextInt();
			}
		}

		System.out.println("What Number you want to find: ");
		int y = s.nextInt();

		// Output
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (num[i][j] == y) {
					System.out.println("Found at Location [" + i + "," + j + "]");
				}
			}
		}  

	}
}