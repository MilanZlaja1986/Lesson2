package exercises;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class PentagonCrazy {

	private void makePrettyThings() {
		
		Robot r2d2 = new Robot();
		r2d2.penDown();
		r2d2.setSpeed(10);
		r2d2.setPenColor(123, 147, 190);
		int n = 5;

		for(int i = 0; i < 200; i++){
		r2d2.move(i);
		r2d2.turn(360/5);
		r2d2.setRandomPenColor();
		r2d2.move(1);
		}

	}

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}