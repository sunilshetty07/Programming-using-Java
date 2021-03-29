public class Stringex {
	public static void main(String[]args) {
		int a=10;
		String text="hello";
		char s[]= {'a','b','c'};
		String txt=new String(s);
		System.out.println(text);
		System.out.println(txt);
		System.out.println(text+" "+txt);
		System.out.println("My integer is: "+a);
		
		/*output:
		 * hello
		 * abc
		 * hello abc
		 * My integer is: 10
		 */
	}
}
