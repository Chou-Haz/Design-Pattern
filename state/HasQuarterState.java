import java.util.Random;

public class HasQuarterState implements State{

	Random randomWinner;
	Machine machine;

	public HasQuarterState(Machine machine) {
		this.machine = machine;
		randomWinner = new Random(System.currentTimeMillis());
	}

	public void insertQuarter() {
		System.out.println("You can't insert another quarter");
	}

	public void ejectQuarter() {
		System.out.println("Quarter return");
		machine.setState(machine.getNoQuarterState());
	}

	public void turnCrank() {
		System.out.println("You turned..");
		int winner = randomWinner.nextInt(10);
		// machine.setState(machine.getwinnerState());
		if((winner==0) && (machine.getCount() > 1)){
			machine.setState(machine.getwinnerState());
		} 
		else {
			machine.setState(machine.getSoldState());			
		}
	}

	public void refill(){}

	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public String toString() {
		return "Waiting for turn of crank";
	}
}