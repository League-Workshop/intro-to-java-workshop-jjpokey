package section3;

import javax.swing.JOptionPane;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		// POINTS
		int points = 0;

		speak("Level 1");
		speak("indict");
		// 2. Catch the user's answer in a String
		String a = JOptionPane.showInputDialog("How do you spell that word?");
		// 3. If the user spelled the word correctly, speak "correct"
		if (a.equals("indict")) {
			speak("correct, plus three points");
			points += 3;
		}
		// 4. Otherwise say "wrong"
		else {
			speak("wrong");
		}

		// 5. repeat the process for other words
		speak("Level 2");
		speak("caribbean");
		String b = JOptionPane.showInputDialog("How do you spell that word?");
		if (b.equals("caribbean")) {
			speak("correct, plus five points");
			points += 5;
		} else {
			speak("wrong");
		}

		speak("Level 3");
		speak("playwright");
		String c = JOptionPane.showInputDialog("How do you spell that word?");
		if (c.equals("playwright")) {
			speak("correct, plus eight points");
			points += 8;
		} else {
			speak("wrong");
		}

		speak("your total score from this lesson is" + points);
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
