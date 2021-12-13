package JavaLab;

class constructorOverloading{
	constructorOverloading(){
		System.out.println("Default constructor");
	}
	constructorOverloading(int i){
		System.out.println("Parameterized constructor having parameter : "+i);
	}
}

class methodOverloading{
	void over(int x){
		System.out.println(x);
	}

	void over(int x,int y){
		System.out.println(x+" "+y);
	}
}
class methodOverridingA{
	void fun(){
		System.out.println("methodOverridingA");
	}
}

class methodOverridingB extends methodOverridingA{
	methodOverridingB(){
		super.fun();
	}
	void fun(){
		System.out.println("methodOverridingB");
	}
}

class hierarchialInheritance{
	void parentclass(){
		System.out.println("Parent Class");
	}
}
class hierarchialInheritanceA extends hierarchialInheritance{
	void A(){
		System.out.println("Class A");
	}
}
class hierarchialInheritanceB extends hierarchialInheritance{
	void B(){
		System.out.println("Class B");
	}
}

class multilevelInheritance{
	void parentclass(){
		System.out.println("Parent Class");
	}
}
class multilevelInheritanceA extends multilevelInheritance{
	void A(){
		System.out.println("multilevelInheritanceA Class");
	}
}
class multilevelInheritanceB extends multilevelInheritanceA{
	void B(){
		System.out.println("multilevelInheritanceB Class");
	}
}

class singleInheritance{
	void parentclass(){
		System.out.println("Parent Class");
	}
}
class singleInheritanceA extends singleInheritance{
	void A(){
		System.out.println("singleInheritanceA Class");
	}
}

class superClass{
	int x = 10;
	superClass(){
		System.out.println("Parent Class");
	}

	void A(){
		System.out.println("A() in parent");
	}
}
class superClassA extends superClass{
	superClassA(){
		super();
		System.out.println("Child Class");
	}
	void B(){
		System.out.println(super.x);
		super.A();
	}
}


public class lab5 {

	public static void main(String[] args) {
		System.out.println("Constructor Overloading Example");
		new constructorOverloading();
		new constructorOverloading(5);

		System.out.println("Method Overloading Example");
		methodOverloading mo = new methodOverloading();
		mo.over(1);mo.over(2,3);

		System.out.println("Method Overriding Example");
		methodOverridingB mob = new methodOverridingB();
		mob.fun();

		System.out.println("Hierarchial Inheritance Example");
		hierarchialInheritanceB hi = new hierarchialInheritanceB();
		hi.B();hi.parentclass();
//		hi.A();		// It will show error

		System.out.println("Multilevel Inheritance Example");
		multilevelInheritanceB mi = new multilevelInheritanceB();
		mi.parentclass();mi.A();mi.B();

		System.out.println("Single level Inheritance Example");
		singleInheritanceA si = new singleInheritanceA();
		si.parentclass();si.A();

		System.out.println("Super Class Example");
		superClassA su = new superClassA();
		su.B();
	}
}
