/**
 * @author Boyan Bozhilov
 *
 */
public abstract class EnemyShip {

	private String name;
	private double ammountOfDamage;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the ammountDamage
	 */
	public double getAmmountOfDamage() {
		return ammountOfDamage;
	}

	/**
	 * @param ammountDamage
	 *            the ammountDamage to set
	 */
	public void setAmmountDamage(double ammountOfDamage) {
		this.ammountOfDamage = ammountOfDamage;
	}

	public void followHeroShip(){
		System.out.println(getName()+" is following the hero");
	}// end followHeroShip

	public void displayEnemyShip(){
		System.out.println(getName()+" is on the screen");
	}// end displayEnemyShip
	
	public void enemyShipShoots(){
		System.out.println(getName()+" attacks and does "+getAmmountOfDamage());
	}// end displayEnemyShip

}
