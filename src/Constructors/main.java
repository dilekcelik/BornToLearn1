package Constructors;

public class main {

	public static void main(String args[]) {

		Dog Jerome = new Dog("Jerome", "Golden Retriever");
		Dog henry = new Dog("henry", "Pitbull");
		
		
		Jerome.PrintName();
		Jerome.PrintBreed();
		
		
		henry.PrintName();
		henry.PrintBreed();
	}

}
