/**
 * @author Boyan Bozhilov
 *
 */
import java.util.Scanner;
public class EnemyShipTesting {

	public static void main(String[] args) {
		
		EnemyShipFactory shipFactory= new EnemyShipFactory();
		EnemyShip enemy = null;
		
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Select type of ship (U / R / B)");
		
		if (userInput.hasNextLine()) {
			String typeOfShip = userInput.nextLine();
			enemy=shipFactory.makeEnemyShip(typeOfShip);
		}// end if
		
		if(enemy!=null){
			doStuffEnemy(enemy);
		}
		
		else{
			System.out.println("Wrong input");
		}

	}// end main

	private static void doStuffEnemy(EnemyShip enemyShip) {
		enemyShip.displayEnemyShip();
		enemyShip.followHeroShip();
		enemyShip.enemyShipShoots();
		
	}// end doStuffEnemy

}
