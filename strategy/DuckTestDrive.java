public class DuckTestDrive {
	public static void main(String[] args) {
		Duck redDuck = new RedHeadDuck();
		redDuck.performFly();
		redDuck.performQuack();
		redDuck.display();

		redDuck = new RubberDuck();
		redDuck.performFly();
		redDuck.performQuack();
		redDuck.display();		
	}
}