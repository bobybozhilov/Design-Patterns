/**
 * @author bobyb
 *
 */
public class GrabStocks {

	public static void main(String[] args) {

		StockGrabber stockGrabber = new StockGrabber();
		
		Observer observer1 = new StockObserver(stockGrabber);
		
		stockGrabber.setIBMPrice(195.00);
		stockGrabber.setAAPLPrice(677.30);
		stockGrabber.setGOOGPrice(567.00);
		
		/**
		 * create the Threads
		 */
		Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 197.20);
		Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 666.66);
		Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 456.40);
		
		/**
		 * start the Threads
		 */
		new Thread(getIBM).start();
		new Thread(getAAPL).start();
		new Thread(getGOOG).start();
		
		
	}// end main

}
