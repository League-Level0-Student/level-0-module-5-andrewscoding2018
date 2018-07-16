package extra;

import javax.swing.JOptionPane;

public class Fibbonacci {
	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int temp = b;
		for (int repeat = 0; repeat < 10; repeat++) {
			b = a + b;
			JOptionPane.showMessageDialog(null, b);
			a = temp;
			temp= b;

		}
	}
}
