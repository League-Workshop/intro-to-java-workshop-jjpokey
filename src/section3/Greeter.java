package section3;

import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name?");
       JOptionPane.showMessageDialog(null,"Hi" + " " + name);
		String next = JOptionPane.showInputDialog("how are you?");
		JOptionPane.showMessageDialog(null, next + "?" + " " + "Good");
		
		
		
		
	}
}
