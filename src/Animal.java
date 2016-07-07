/**
 * @author bobyb
 * 
 */
public class Animal {

	private String name;
	private double height;
	private int weight;
	private String favFood;
	private double speed;
	private String sound;

	public Flys flying;

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
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height
	 *            the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}

	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(int weight) {
		if (weight > 0) {
			this.weight = weight;
		} else {
			System.out.println("Weight must be bigger than 0");
		}
	}

	/**
	 * @return the favourite Food
	 */
	public String getFavFood() {
		return favFood;
	}

	/**
	 * @param favFood
	 *            the favFood to set
	 */
	public void setFavFood(String favFood) {
		this.favFood = favFood;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed
	 *            the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the sound
	 */
	public String getSound() {
		return sound;
	}

	/**
	 * @param sound
	 *            the sound to set
	 */
	public void setSound(String sound) {
		this.sound = sound;
	}

	/**
	 * @return the ability to fly
	 */
	public boolean isFlying() {
		return flying.fly();
	}

	/**
	 * @param flyingType
	 *            the flyingType to set
	 */
	public void setFlying(Flys flyingType) {
		this.flying = flyingType;
	}
}
