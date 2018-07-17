import javax.swing.JOptionPane;

public class ForLoop {
	static int j = 0;

	public static void main(String[] args) {
		// for(int s = 100; s >= 0; s--)
		// {
		// JOptionPane.showMessageDialog(null, s);
		// }
		// for (int s = 100; s >= 0; s--) {
		// if(s % 2 != 0)
		// {
		// JOptionPane.showMessageDialog(null, s);
		// }
		// }

		// for (int s = 0; s < 3; s++) {
		// for (int i = 0; i <= 2; i++) {
		// JOptionPane.showMessageDialog(null, s);
		// }
		// }
		// for (int j = 0; j < 3; j++) {
		// for (int i = 0; i <= 2; i++) {
		// JOptionPane.showMessageDialog(null, i);
		// }
		// }
		for (int s = 1; s <= 3; s++) {
			for (int i = 1; i <= 3; i++) {
				j = i;
			}
			JOptionPane.showMessageDialog(null, j);

		}
	}
}
