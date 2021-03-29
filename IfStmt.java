import java.util.Scanner;
public class IfStmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int mark;
		System.out.println("Enter mark");
		mark=in.nextInt();
		if(mark<=100 && mark>=85) {
			System.out.println("Distinction");
		}
		else if(mark>=60&&mark<=84) {
			System.out.println("First Class");
		}
		else if(mark>=35 && mark<=59) {
			System.out.println("Second Class");
		}
		else if(mark>=0&&mark<=34)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid mark");
		}
		in.close();
	}

}
