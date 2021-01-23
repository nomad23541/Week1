import java.util.Scanner;

public class Part1 {

	public static void main(String[] args) {
		int[] values = new int[] { 39, 46, 10, 37, 33, 4, 30, 26, 14, 19, 29, 6, 43, 8, 35, 50, 13, 25, 17, 48, 28, 3,
				41, 34, 36, 38, 49, 16, 45, 2, 40, 15, 24, 7, 5, 9, 20, 1, 42, 44, 21, 47, 12, 22, 18, 31, 11, 32, 27,
				23 };
		
		Scanner input = new Scanner(System.in);
		int userNum = 0;
		
		do {
			System.out.println("Enter a number between 1 and 50:");
			userNum = input.nextInt();
		} while(userNum < 1 || userNum > 50);
		
		for(int i = 0; i < values.length; i++) {
			if(userNum == values[i]) {
				System.out.println("Found the number " + values[i] + " at position " + i);
			}
		}
		
		input.close();
	}

}
