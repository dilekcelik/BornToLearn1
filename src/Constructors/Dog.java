package Constructors;

public class Dog {
	String name;
	String breed;
	
	Dog() {}
	
	Dog(String n,String b){
		name= n;
		breed = b;
	}

	void PrintName(){
		System.out.print(name);
	}
	
	void PrintBreed(){
		System.out.print(breed);
	}
	
	public void bark() {
		System.out.println("woof");
	}
	
	
	public void dig() {
		System.out.println("wahh");
	}

}
