package bai6;

import javax.swing.JOptionPane;

public class bai6_1 {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "do you want to change to the first class ticket?");
		JOptionPane.showConfirmDialog(null, "you've chosen: " + (option == JOptionPane.YES_NO_OPTION ? "yes" : "no"));
		System.exit(0);
	}
}
