package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		String dl = JOptionPane.showInputDialog("Who do you dislike?");

		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You have a crush on" + " " +  dl);
		// 3. Ask the user for the name of their best friend
        String friend = JOptionPane.showInputDialog("Who is your best friend?");
		// 4. Tell them their best friend is as sweet as candy
        JOptionPane.showMessageDialog(null, friend + " " + "is as sweet as candy!");
	} 
}



