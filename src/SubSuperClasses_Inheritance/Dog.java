package SubSuperClasses_Inheritance;

public class Dog extends Animal {

//class subclass extends superclass
	
	@Override
	void isItonEarth(){
		super.isItonEarth();
	}
	
	
	String name;
	String breed;
	
	
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
