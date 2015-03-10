

import java.util.Scanner;

public class IfElse{

	public static void main(String args[]) {
		int start = 0 ;
		int finish;
		System.out.print("Enter a Number:");
		Scanner inputFromUser = new Scanner(System.in);
		
		
		if(inputFromUser.hasNextInt()){
			finish = inputFromUser.nextInt();
			System.out.print("Enter a String:");
			
		} else	{ finish = 1; 
				System.out.print("pLAY THE rULE, Enter a Number!!!");
		}
		
		
		
		Scanner inputWords = new Scanner(System.in);
		String words = inputWords.nextLine();
		
		while(start<finish){
			System.out.print(words);
			System.out.println();
			start ++;
		}
		
		

	}

}
