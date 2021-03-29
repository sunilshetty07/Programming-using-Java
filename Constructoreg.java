class Machine{
	private String name;
	private int code;
	//constructor does not have return type so it's not contain void or int(any).
	//name should same as class
	public Machine() {
		System.out.println("Constructor running...");
		name="Goo";
	}
	public Machine(String name) {
		System.out.println("Second constructor is running..");
		this.name=name;
	}
	public Machine(String name,int code) {
		this.name=name;
		this.code=code;
		System.out.println("Constructor3 is running...");
	}
}
public class Constructoreg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Machine m1 = new Machine();//this will run constructor automatically
		//new Machine();
		Machine m2 = new Machine("Alpha");//this will run another constructor
		Machine m3 = new Machine("Beta",20);
	}

}
