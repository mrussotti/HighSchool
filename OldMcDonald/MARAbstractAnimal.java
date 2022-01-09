/**
 * @author Matt Russotti
 *Date: Jan 26, 2020
 *Assignment: MARAbstractAnimal.java
 */

/**
 * @author Russotti
 *
 */
public class MARAbstractAnimal implements MARAnimal{
	private String myType;
	private String mySound;
	
	/*
	* Finds type of animal as well as the sound it makes
	* @param type - type of animal
	* @param noise - sound animal makes
	*/
	public MARAbstractAnimal(String type, String sound){
	  myType = type;
	  mySound = sound;
	}
	
	/*
	* Gets the sound the animal makes
	* @return the sound the animal makes
	*/
	public String getSound() {
		return mySound;
	}
		

/*
* Gets the type of animal
* @return the animals type
*/
	public String getType() {
		return myType;
	}
	
	/**
	 * This program returns a string version of myType and mySound
	 * @return The type of animal plus the sound it makes
	 */
	@Override
	public String toString() {
		return "The " + getType() + " goes " + getSound() + ".";
		
	}
		
}