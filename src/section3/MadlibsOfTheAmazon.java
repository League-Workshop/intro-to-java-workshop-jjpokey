package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null,"If you find yourself having to cross a piranha-infested river, here is how to do it...");
		
		String a = JOptionPane.showInputDialog("Enter adjective");
        String b = JOptionPane.showInputDialog("Enter type of liquid");
        String c = JOptionPane.showInputDialog("Enter Body Part");
        String d = JOptionPane.showInputDialog("Enter verb");
        String e = JOptionPane.showInputDialog("Enter place");
		// Get the user to enter an adjective

		// Get the user to enter a type of liquid

		// Get the user to enter a body part

		// Get the user to enter a verb

		// Get the user to enter a place

		// Fit the user's words into this sentence, and save it in a String:
        
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more " + a + " during the day, so cross the river at night \n"
				+ ". Piranhas are attracted to fresh " + b + " and will most likely take a bite out of your \n"
				+ c + " if you " + d + ". Whatever you do, if you have an open wound, try to find another way to \n"
				+ " get back to " + e + ". Good luck!");

	}
}

