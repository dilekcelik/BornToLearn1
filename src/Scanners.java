

import java.util.Scanner;

public class Scanners {

	public static void main(String args[]) {
		int start = 0 ;
		System.out.print("Enter Number:");
		Scanner inputFromUser = new Scanner(System.in);
		int finish = inputFromUser.nextInt();
		
		Scanner inputWords = new Scanner(System.in);
		String words = inputWords.nextLine();
		
		while(start<finish){
			System.out.print(words);
			System.out.println();
			start ++;
		}
		
		

	}

}
