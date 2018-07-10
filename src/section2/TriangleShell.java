package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot ppp = new Robot();
	
	void go() {
ppp.moveTo(800, 600);
		// 6. Make the robot go as fast as possible
ppp.setSpeed(200);
		// 4. make a variable to hold the length of the triangle and set it to 50
int l = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for(int a = 0; a <60; a++) {
	
			// 9. Change the color of the pen to a random color 
	ppp.setRandomPenColor();
			// 8. Increase the length variable by 10
	l = l + 10;
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(l);
			// 10. Turn the robot 6 degrees to the right
	ppp.turn(6);
}
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		ppp.penDown();
		for(int b = 0; b <3; b++) {
			
		ppp.move(length);
		ppp.turn(360/3);
		}
		ppp.hide();
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
