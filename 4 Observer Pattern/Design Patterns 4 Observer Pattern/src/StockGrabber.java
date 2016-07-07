
/**
 * @author bobyb
 *
 */
import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;

	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}// end Constructor

	@Override
	public void register(Observer o) {
		observers.add(o);
	}// end register

	@Override
	public void unregister(Observer o) {
		int observerIndex = observers.indexOf(o);
		System.out.println("Observer " + (observerIndex + 1) + " deleted");
		observers.remove(o);
	}// end unregister

	@Override
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		} // end for

	}// end notifyObservers

	/**
	 * @param ibmPrice
	 *            the ibmPrice to set
	 */
	public void setIBMPrice(double ibmPrice) {
		this.ibmPrice = ibmPrice;
		notifyObservers();
	}

	/**
	 * @param aaplPrice
	 *            the aaplPrice to set
	 */
	public void setAAPLPrice(double aaplPrice) {
		this.aaplPrice = aaplPrice;
		notifyObservers();
	}

	/**
	 * @param googPrice
	 *            the googPrice to set
	 */
	public void setGOOGPrice(double googPrice) {
		this.googPrice = googPrice;
		notifyObservers();
	}

}
