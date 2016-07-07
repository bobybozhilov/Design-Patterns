/**
 * @author bobyb
 *
 */
public interface Flys {
	
	boolean fly();

}
/**
 * super of all flying Animals
 */
class ItFlys implements Flys{
	public boolean fly(){
		return true;
	}
}

/**
 * super of all Animals, who can't fly
 */
class CantFly implements Flys{
	public boolean fly(){
		return false;
	}
}