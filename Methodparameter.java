class Robot{
	public void speak() {
		System.out.println("Hello");
		
	}
	
	public void speak1(String msg) {//passing parameter
		System.out.println(msg);
	}
	public void jump(int height) {
		System.out.println("Jumping: "+height);
	}
	public void move(String direction,double distance) {
		System.out.println("Moving: "+distance+" meters in direction: "+direction);
	}
	static void hi() {
		System.out.println("hi");
	}
}
public class Methodparameter {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Robot alpha1=new Robot();
		
		alpha1.speak();
		alpha1.speak1("Hi I am alpha1");
		alpha1.jump(7);
		alpha1.move("north",12.50);
		Robot.hi();
		String greeting = "hi good morning";
		alpha1.speak1(greeting);
		int value = 14;
		alpha1.jump(value);
	}

}
