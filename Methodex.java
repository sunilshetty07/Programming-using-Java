
class Person1{
	//instance variables (data or state)
	String name;
	int age;
	//classes can contain
	//1. data
	//2. subroutines (methods)
	
	//methods
	void speak() {
		System.out.println("My name is "+name+" and age is "+age);
	}
	static int add1(int x,int y) {
		return x+y;
	}
}
public class Methodex {//only one public class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y=20;
		Person1 p1=new Person1(); //object of class Person
		p1.name="Vijeth";
		p1.age=22;
		System.out.println(p1.name);
		System.out.println(p1.age);
		p1.speak();
		Person1 p2=new Person1(); //2nd object
		p2.name="Vinay";
		p2.age=22;
		System.out.println(p2.name);
		System.out.println(p2.age);
		p2.speak();
		int res=Person1.add1(x,y);
		System.out.println(res);
		

	}

}
