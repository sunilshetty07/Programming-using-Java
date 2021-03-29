class Thing{
	public String name;
	public static String description; //static associated with class name
	public final static int LUCKY_NUMBER=4;//final means you can't reassign values to these variable
	
	public static int count=0;
	
	public int id;
	
	public Thing() {
		id=count;
		count++;
	}
	public void showName() {
		System.out.println(name);
		//System.out.println(description); //instance method can access static data
		System.out.println("Object id: "+id);
	}
	public static void showInfo() {
		System.out.println(description);
		System.out.println("hello");
		
		//System.out.println(name);//static method cannot access other data(error:Cannot make a static reference to the non-static field name)
		
	}
	
	
}
public class Staticandfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thing.description="I am aThing";
		System.out.println("Before creating objects "+Thing.count);
		Thing thing1 = new Thing();
		Thing thing2 = new Thing();
		
		System.out.println("After creating objects "+Thing.count);
		thing1.name="sunil";
		thing2.name="anil";
		//System.out.println(thing1.name);
		//System.out.println(thing2.name);
		//System.out.println(Thing.description);
		thing1.showName();
		thing2.showName();
		Thing.showInfo();
		
		System.out.println(Math.PI);
		System.out.println(Thing.LUCKY_NUMBER);//making constants
	}
}
