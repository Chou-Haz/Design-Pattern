public class NoQuarterState implements State {
	Machine machine;
	public NoQuarterState(Machine machine) {
		this.machine = machine;
	}

	public void insertQuarter() {
		System.out.println("You inserted a quarter");
		machine.setState(machine.getHasQuarterState());
	}

	public void ejectQuarter() {
		System.out.println("You haven't inserted a quarter");
	}

	public void turnCrank() {
		System.out.println("You turned, but there's no quarter");
	}

	public void dispense() {
		System.out.println("You need to pay first");
	}


	public void refill(){}
	
	public String toString() {
		return "Waiting for quarter";
	}
}