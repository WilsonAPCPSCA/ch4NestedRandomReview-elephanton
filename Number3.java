//ELton Tran & Michael Pfeiffer
import java.util.Scanner;
public class Number3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a side length: ");
		int sideLength = in.nextInt();
		for (int i = 1; i <= sideLength; i++){
			for (int j = (sideLength-i); j >= 0; j--){
				System.out.print(" ");
			}
			for (int k = 1; k <= (i*2-1); k++){
				System.out.print("*");
			}
		System.out.println("");
		}
		for (int i = (sideLength-1); i >= 1; i--){
			for (int j = (sideLength - i); j >= 0; j--){
				System.out.print(" ");
			}
			for (int k = 1; k <= (2*i-1); k++){
				System.out.print("*");
			}
		System.out.println("");
		}
	}

}
