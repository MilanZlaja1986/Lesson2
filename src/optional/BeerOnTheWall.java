package optional;

/* 
 * Print the lyrics to the song "99 Bottles of Beer on the wall"
 * 
 * http://99-bottles-of-beer.net/lyrics.html
 */

public class BeerOnTheWall {
	public static void main(String[] args) {
		
		int i = 99;
		
		for(i = 99; i >= 0; i--)
		{
			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.\nTake one down and pass it around, " + (i-1) + " bottles of beer on the wall.");
			
			if (i == 1) {
				System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer.\nTake one down and pass it around, no more bottles of beer on the wall." );
				break;
			}
		}
		
		

	}
}
