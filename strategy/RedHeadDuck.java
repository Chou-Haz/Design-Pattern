public class RedHeadDuck extends Duck {
	public RedHeadDuck(){
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}

	void display() {
		System.out.println("I'm a RedHeadDuck.");
	}
}