public class Machine {
	
	State soldOutState;
	State hasQuarterState;
	State soldState;
	State noQuarterState;
	State winnerState;

	State state = soldState;
	int count = 0;

	public Machine(int numberGumballs) {
	//在构造方法中实例化各种状态的对象，在之后需要用到某个状态时，
	//这些对象会直接与该Machine类对象挂钩（状态中调用进去的都是该Machine类的对象。

		soldState = new SoldState(this);
		hasQuarterState = new HasQuarterState(this);
		noQuarterState = new NoQuarterState(this);
		soldOutState = new SoldOutState(this);
		winnerState = new WinnerState(this);

		this.count = numberGumballs;	

		if(numberGumballs > 0) {
			state = noQuarterState;
		}
	}

	public void insertQuarter(){
		state.insertQuarter();
	}

	public void ejectQuarter(){
		state.ejectQuarter();
	}

	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}

	void setState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public State getSoldOutState() {
		return soldOutState;
		//返回的是已在该类的构造方法中声明的对象，而不是重新new，
		//利用此对象可以修改该类的的状态。
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getwinnerState() {
		return winnerState;
	}

	int getCount(){
		return this.count;
	}

	void releaseBall(){
		System.out.println("A gumball comes rolling out the slot...");
		if(count > 0){
			count--;
		}
	}

	void refill(int count){
		this.count += count;
		System.out.println("The gumball machine was just refilled; its new count is: " + this.count);
		state.refill();
		// state = noQuarterState;
	}

	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model #2004");
		result.append("\nInventory: " + count + " gumball");
		// if (count != 1) {
			result.append("(s)");
		// }
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}