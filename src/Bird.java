/**
 * @author bobyb
 *
 */
public class Bird extends Animal {

	public Bird() {
		super();
		
		setSound("Tweet");
		flying = new ItFlys();
	}

}
