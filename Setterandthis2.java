class Frog1{
	private String name; //set private
	private int age;
	/*public void setName(String newName) {
		name=newName;
	}*/
	//if you want set parameter with the name declared in a class
	public void setName(String name) {//parameter name is same as variable declared in class Frog1(private String name)
		this.name=name;//this.name refers to to the name declared as private String name in a Frog1 class
	}
	
	public void setAge(int newAge) {//setters
		age=newAge;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void info(String name,int age) {
		setName(name);
		setAge(age);
		System.out.println("Name is: "+getName()+" Age is: "+getAge());
	}
}
public class Setterandthis2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Frog1 f1 = new Frog1();
		f1.name="Kitty";
		f1.age=10;
		System.out.println(f1.getName());*/
		Frog1 f2 = new Frog1();
		f2.setName("bill");//called encapsulation hiding the data
		f2.setAge(4);
		System.out.println(f2.getName());
		System.out.println(f2.getAge());
		f2.info("kyle", 5);
		System.out.println(f2.getName());
		System.out.println(f2.getAge());
	}

}
