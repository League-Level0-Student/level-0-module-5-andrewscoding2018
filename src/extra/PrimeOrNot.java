package extra;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	String number = JOptionPane.showInputDialog("Give a number to check for if it is prime");
	int n = Integer.parseInt(number);
	for(int repeat = 2; repeat < n; repeat++)
	{
		
		if(n % (repeat) == 0)
		{
			JOptionPane.showMessageDialog(null, n + " not is a prime number.");
		}
		else
		{
			JOptionPane.showMessageDialog(null, n + " is a prime number.");
		}
		}
}
}
