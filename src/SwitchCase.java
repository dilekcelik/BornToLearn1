import java.util.Random;


public class SwitchCase {
	public static void main(String args[]) {
		int gun = 0;
		
		Random r = new Random();
		gun = r.nextInt(6);
		
		switch (gun){
			
			case 0:
				System.out.print("YOU`RE SAFE 1");
				break;
					
			case 1:
				System.out.print("YOU`RE SAFE 2");
				break;
			
			case 2:
				System.out.print("YOU`RE SAFE 3");
				break;
					
			case 3:
				System.out.print("BANGGG!!!");
				break;
					
			case 4:
				System.out.print("YOU`RE SAFE 4");
				break;
					
			case 5:
				System.out.print("YOU`RE SAFE 5");
				break;
					
			case 6:
				System.out.print("YOU`RE SAFE 6");
				break;
		
		}
		
	}
}
