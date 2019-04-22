package exercises;

import org.jointheleague.graphical.robot.Robot;

/*
 * Count down a rocket launch!
 * 
 * Print the numbers from 10 to 1, then print â€œblastoffâ€�. 
 */


public class NASACountdown {
	
	public static void main(String[] args){
		
		NASACountdown rocket = new NASACountdown();
		
		for (int i = 10; i >= 0; i--) {

			System.out.println(i);
			
			if (i == 1) {
				System.out.println("Blastoff!");
				break;
			}
		}
	}
}
