package extra;

import javax.swing.JOptionPane;

public class PrimeOrNot {
public static void main(String[] args) {
	for(int repeat = 2; repeat < 10000; repeat++)
	{
		if(repeat % (repeat-1) == 0)
		{
			JOptionPane.showMessageDialog(null, repeat + " is a prime number.");
		}
	System.out.println(repeat);
	}
}
}
