class Frog{
	String name;
	int age;
	public void setName(String newName) {
		name=newName;
	}
	
	public void setAge(int newAge) {
		age=newAge;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
}
public class Setterandthis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frog f1 = new Frog();
		f1.name="Kitty";
		f1.age=10;
		System.out.println(f1.getName());
		Frog f2 = new Frog();
		f2.setName("bill");//called encapsulation hiding the data
		f2.setAge(4);
		System.out.println(f2.getName());
		System.out.println(f2.getAge());
	}

}
