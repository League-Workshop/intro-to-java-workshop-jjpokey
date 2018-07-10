package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	Robot aaa = new Robot();

	void go() {
		aaa.setSpeed(200);

		aaa.setPenWidth(5);

		for(int a = 0; a < 4; ++a) {
			aaa.setRandomPenColor();
			drawSquare();
			aaa.turn(90);
		}

			// 7. Set the pen color to random
	
			// 1. Call the drawSquare() method
	
			// 8. Turn the robot 90 degrees to the right

	}

	
	void drawSquare() {
	//	JOptionPane.showMessageDialog(null, "yay! you called the drawSquare() method!");
		/* 3. Fill in the code to draw a square inside the method below. */
		aaa.penDown();
		for(int b = 0; b <4; ++b) {
			aaa.move(100);
			aaa.turn(90);
		}
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



