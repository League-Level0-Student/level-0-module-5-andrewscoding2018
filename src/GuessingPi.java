
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GuessingPi {
	// 1. Make a main method and make sure your program can run
	public static void main(String[] args) {

		String pi = "3.141592653589793238462643" + "38327950288419716939937510582" + "097494459230781640628620899862"
				+ "80348253421170679821480865132823" + "06647093844609550582231725359408"
				+ "128481117450284102701938521105" + "559644622948954930381964428810975"
				+ "6659334461284756482337867831652" + "7120190914564856692346034861045"
				+ "4326648213393607260249141273724" + "58700660631558817488152092096282";
		// 2. Make a String variable to hold the value of Pi.
		// Get the first few digits from http://www.piday.org/million/.

		// 3. Print out the first 3 digits of Pi to the console.
		// The first value is "pi.charAt(0)", the second is "pi.charAt(1)", etc.
		// Run your program to see how this works.
		// JOptionPane.showMessageDialog(null, pi.charAt(0));
		// JOptionPane.showMessageDialog(null, pi.charAt(0));

		// 9. If you want to give the user more than one chance to guess,
		// put a for loop around steps 4-8.

		// 4. Create a for loop that will step through each digit of pi (steps 5-8)
		// NOTE: The number of digits in your string will be
		// yourStringVariable.length()
		JOptionPane.showMessageDialog(null, "The first digit of Pi is 3.");
		for (int repeat = 1; repeat < pi.length(); repeat++) {
			String check = JOptionPane.showInputDialog("What is the next digit of Pi?");
			if (check.equals((Character.toString(pi.charAt(repeat))))) {
				JOptionPane.showMessageDialog(null, "You are correctte.");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "You are wong. It was " + ((Character.toString(pi.charAt(repeat)))));
				break;
			}
			{

			}
		}
		// 5. Ask the user for the NEXT digit of pi.

		// 6. Compare the user's input to the next digit of your pi variable
		// (look at step 3 for a clue).
		// HINT: use charAt(0) to get 1st char of user input String

		// 7. If they are correct, print out "correct".

		// 8. If they are not, print out "incorrect" and tell them
		// to start over. Use 'break;' to break out of the loop.
	}
}
