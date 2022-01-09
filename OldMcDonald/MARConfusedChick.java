/**
 * @author Matt Russotti
 *Date: Dec 17, 2019
 *Assignment: MARConfusedChick.java
 */

/**
 * @author mrussotti20
 *
 */
public class MARConfusedChick extends MARChick{
	private String second;

	/**
	 *Creates a MARConfusedChick object with two sounds 
	 * @param sound-The childish sound
	 * @param b- The grownup sound
	 */
	public MARConfusedChick(String sound, String b) {
		super(sound);
		second=b;
		
	}

	/**
	 * This program returns either the childish or grownup sound
	 * @return- The string version of sound
	 */
	public String getSound() {
		double a = Math.random() ;
		if (a>=.5) {
			return second;
		}else {
			return super.getSound();
		}
	}
	
	
	
	/**
	 * This program changes the type to confused chick and returns that as the type by calling the super
	 * @return- A string version of the type of animal
	 */
	public String getType() {
		 return "Confused " + super.getType();
	}
	
}
