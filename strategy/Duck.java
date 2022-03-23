public abstract class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public void performQuack(){
		quackBehavior.quack();
	}

	public void performFly(){
		flyBehavior.fly();
	}

	abstract void display();
}