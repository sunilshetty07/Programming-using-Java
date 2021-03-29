import java.util.Scanner;
public class Multidimensionarrayex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		//int[] val= {1,2,3};//one dimensional array
		
		int[][] grid= {{1,2,3},{4,5},{6}};
		System.out.println(grid[1][0]);
		System.out.println("-----print using for loop---");
		for(int i=0;i<grid.length;i++) {
			for(int j=0;j<grid[i].length;j++) {
				System.out.println(grid[i][j]);
			}
		}
		String[][] text= new String[2][3];
		text[0][0]="hello";
		text[0][1]="good";
		text[0][2]="morning";
		
		for(int row=0;row<text.length;row++) {
			for(int col=0;col<text[row].length;col++) {
				System.out.print(text[row][col]+"\t");
			}
			System.out.println("\n");
		}
		System.out.println("enter the values for multi dimensional array:");
		String[][] cars=new String[2][3];
		for(int i=0;i<cars.length;i++) {
			for(int j=0;j<cars[i].length;j++) {
				cars[i][j]=in.nextLine();
			}
			System.out.println("");
		}
		System.out.println("entered value is: ");
		for(int i=0;i<cars.length;i++) {
			for(int j=0;j<cars[i].length;j++) {
				System.out.print(cars[i][j]+"\t");
			}
			System.out.println("\n");
		}
		in.close();

	}

}
