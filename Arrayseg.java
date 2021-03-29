import java.util.Scanner;
public class Arrayseg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		int value=4;
		System.out.println("int type "+value);
		System.out.println("_____________________________");
		
		int[] values= {5,4,9,8,10};
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i]);
		}
		System.out.println("_____________________________");
		String[] car;
		car=new String[3];
		car[0]="TATA";
		car[1]="Maruti";
		car[2]="Honda";
		System.out.println(car[0]);
		System.out.println(car[1]);
		System.out.println(car[2]);
		System.out.println("__print using for each_______");
		for(String i:car) {//for each loop
			System.out.println(i);
		}
		System.out.println("_____________________________");
		
		int[] val=new int[5];
		System.out.println("enter array elements");
		for(int i=0;i<val.length;i++)
		{
			val[i]=in.nextInt();
		}
		System.out.println("===print using for loop========");
		System.out.println("entered array element is: ");
		for(int i=0;i<val.length;i++)
		{
			System.out.println(val[i]);
		}
		System.out.println("--print using for each------");
		for(int i:val) {
			System.out.println(i);
		}
		System.out.println("val[0]->"+val[0]);
		System.out.println("val[3]->"+val[3]);
		
		in.close();
	}

}
