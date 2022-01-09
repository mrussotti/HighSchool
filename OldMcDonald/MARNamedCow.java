/**
 * @author Matt Russotti
 *Date: Jan 4, 2020
 *Assignment: MARNamedCow.java
 */

/**
 * @author Russotti
 *
 */
public class MARNamedCow extends MARCow implements MARNamedAnimal{
	private String name;
	/**
	 * Creates a MARNamedCow object 
	 * @param sound- the sound the cow makes
	 */
	public MARNamedCow(String n, String sound) {
		super(sound);
		name=n;
	}
	
	/**
	 *This program returns the name of the animal
	 *@return- a string version of name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * This program changes the type to named cow and returns that as the type by calling the super
	 * @return- A string version of the type of animal
	 */
	public String getType() {
		return super.getType() + " named " + getName();
	}

}
