public class WinnerState implements State {
	Machine machine;
	public WinnerState(Machine machine) {
		this.machine = machine;
	}

	public void insertQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	public void ejectQuarter() {
		System.out.println("Please wait, we're already giving you a Gumball");
	}

	public void turnCrank() {
		System.out.println("Turning again doesn't get you another gumball!");
	}

	public void dispense() {
		machine.releaseBall();
		if (machine.getCount() == 0) {
			machine.setState(machine.getSoldOutState());
		} else {
			machine.releaseBall();
			System.out.println("YOU'RE A WINNER! You got two gumballs for your quarter");
			if (machine.getCount() > 0) {
				machine.setState(machine.getNoQuarterState());
			} else {
            	System.out.println("Oops, out of gumballs!");
				machine.setState(machine.getSoldOutState());
			}
		}
	}

	public void refill() { }
	
	public String toString() {
		return "despensing two gumballs for your quarter, because YOU'RE A WINNER!";
	}
}