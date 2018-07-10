package section2;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class FlamingNinjaStar {
	
	public static void main(String[] args) {

		int baseSize = 300;		//the size of the black part of the star
		int flameSize = 200;		//the length of the flaming arms
		
		// 1. Make a new robot, and set it's pen down.
Robot vvv = new Robot();
vvv.penDown();
		// *14. Use the methods setX and setY to move the ninja star into the center of the screen
		vvv.setX(450);
		vvv.setY(300);
		// *15. Make some adjustments to see what other kinds of shapes you can make.

		// 12. Set the robot speed to 100
		vvv.setSpeed(200);
        		// 13. Use a for loop to repeat all of the code below 25 times
              for (int a = 0; a < 25; a++) {
			// 2. Turn the robot 1/8 of a circle
		     vvv.turn(360/8);
			// 3. Move the robot 64 pixels
              vvv.move(64);
			// 4. Turn the robot 40 degrees to the LEFT. (Negative numbers will turn the robot counter-clockwise.)
			vvv.turn(-40);
			vvv.setPenColor(Color.GREEN);
			// 5. Move the robot the distance in the variable flameSize
			vvv.move(flameSize);
			// 6. Turn the robot 170 degrees
			vvv.turn(170);
			// 7. Move the robot the distance in the variable flameSize (again)
			vvv.move(flameSize);
			// 8. Turn the robot 64 degrees to the right
            vvv.turn(64);
            vvv.setPenColor(Color.black);
			// 9. Move the robot the distance in the variable baseSize
			vvv.move(baseSize);
			// 10. Check that your shape is the same as Figure 1. This is one arm of the ninja star.
			
			// 11. Color your ninja star like Figure 2.
              }
	}

}


