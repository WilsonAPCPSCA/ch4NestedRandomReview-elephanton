//Elton Tran & Michael Pfeiffer
import java.util.Scanner;
public class Number4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("How many times would you like the coin to be flipped? ");
		int numFlips = in.nextInt();
		double num = Math.random();
		int numHeads = 0;
		int numTails = 0;
		System.out.println("Here is the sequence of coin flips: ");
		for (int i = 1; i <= numFlips; i++){
			num = Math.random();
			if (num <= 0.5){
				System.out.print("H");
				numHeads++;
			}
			else if (num > 0.5){
				System.out.print("T");	
				numTails++;
			}
		}
		System.out.println("\nThere were " + numHeads + " heads and " + numTails + " tails.");
	 
	}

}
