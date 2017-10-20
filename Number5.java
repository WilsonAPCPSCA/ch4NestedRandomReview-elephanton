//Elton Tran & Michael Pfeiffer
import java.util.Scanner;
import java.util.Random;
public class Number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		int ranNum = rand.nextInt(12)+1;
		int two = 0, three = 0, four = 0, five = 0, six = 0, seven = 0, eight = 0, nine = 0, ten = 0, eleven = 0, twelve = 0;
		System.out.println("This program will stimulate tossing a pair of dice. ");
		System.out.println("How many times would you like the dice to be flipped?");
		int numFlips = in.nextInt();
		System.out.println("This is the sequence of sums, one for each toss: ");
		for (int i = 1; i <= numFlips; i++){
			ranNum = rand.nextInt(12)+1;
			System.out.print(ranNum + " ");
			if (ranNum == 2)two++;
			else if (ranNum == 3)three++;
			else if (ranNum == 4)four++;
			else if (ranNum == 5)five++;
			else if (ranNum == 6)six++;
			else if (ranNum == 7)seven++;
			else if (ranNum == 8)eight++;
			else if (ranNum == 9)nine++;
			else if (ranNum == 10)ten++;
			else if (ranNum == 11)eleven++;
			else if (ranNum == 12)twelve++;
		}
		System.out.print("\n2: ");
		for (int j = 1; j <= two; j++){System.out.print("*");}
		System.out.print("\n3: ");
		for (int j = 1; j <= three; j++){System.out.print("*");}
		System.out.print("\n4: ");
		for (int j = 1; j <= four; j++){System.out.print("*");}
		System.out.print("\n5: ");
		for (int j = 1; j <= five; j++){System.out.print("*");}
		System.out.print("\n6: ");
		for (int j = 1; j <= six; j++){System.out.print("*");}
		System.out.print("\n7: ");
		for (int j = 1; j <= seven; j++){System.out.print("*");}
		System.out.print("\n8: ");
		for (int j = 1; j <= eight; j++){System.out.print("*");}
		System.out.print("\n9: ");
		for (int j = 1; j <= nine; j++){System.out.print("*");}
		System.out.print("\n10: ");
		for (int j = 1; j <= ten; j++){System.out.print("*");}
		System.out.print("\n11: ");
		for (int j = 1; j <= eleven; j++){System.out.print("*");}
		System.out.print("\n12: ");
		for (int j = 1; j <= twelve; j++){System.out.print("*");}
		
	}

}