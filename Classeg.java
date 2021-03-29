
class Person{
	//instance variables (data or state)
	String name;
	int age;
	//classes can contain
	//1. data
	//2. subroutines (methods)
	int value=7;
}
public class Classeg {//only one public class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
		Person p1=new Person(); //object of class Person
		p1.name="Sunil";
		p1.age=22;
		System.out.println(p1.name);
		System.out.println(p1.age);
		
		Person p2=new Person(); //2nd object
		p2.name="Vidyesh";
		p2.age=22;
		System.out.println(p2.name);
		System.out.println(p2.age);
		System.out.println(p2.value);

	}

}
