import java.util.Random;


public class RandomClassMethod {
	public static void main(String args[]) {
		
		int dice = 0;
		
		Random r = new Random();
		//cycle from 1 to 6
		dice = r.nextInt(6)+1;
		
		System.out.print(dice);
	}
}
