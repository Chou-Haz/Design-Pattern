public class RubberDuck extends Duck {
	public RubberDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Squeak();
	}

	void display() {
		System.out.println("I'm a rubberduck.");
	}
}