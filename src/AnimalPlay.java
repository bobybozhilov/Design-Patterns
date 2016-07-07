
public class AnimalPlay {

	public AnimalPlay() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Animal sparky = new Dog();
		Animal tweety = new Bird();
		
		System.out.println("Dog: "+sparky.isFlying());
		System.out.println("Bird: "+tweety.isFlying());
		
		sparky.setFlying(new ItFlys());
		System.out.println("Dog: "+sparky.isFlying());

	}

}
