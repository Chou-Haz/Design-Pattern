public class SoldState implements State{
	Machine machine;
	public SoldState(Machine machine) {
		this.machine = machine;
	}

	public void insertQuarter() {
		System.out.println("You can't insert a quarter, the machine is sold out");
	}
 
	public void ejectQuarter() {
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		machine.releaseBall();
		if(machine.getCount()>0){
			machine.setState(machine.getNoQuarterState());
		}
		else {
			System.out.println("Oops, out of gumballs!");
			machine.setState(machine.getSoldOutState());
		}
	}
 
 	public void refill(){}

	public String toString() {
		return "sold out";
	}
}