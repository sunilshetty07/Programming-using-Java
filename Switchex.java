import java.util.Scanner;
public class Switchex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("please enter a command: ");
		String text = in.nextLine();
		text=text.toLowerCase();
		switch(text) {
		case "start":System.out.println("Machine Started!");
		break;
		case "stop":System.out.println("Machine Stopped");
		break;
		case "pause":System.out.println("Machine paused");
		break;
		default:System.out.println("Command not recognized");
		break;
		}
		in.close();
	}

}
