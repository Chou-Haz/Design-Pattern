public class SoldOutState implements State{
	Machine machine;
	public SoldOutState(Machine machine){
		this.machine = machine;
	}

	public void insertQuarter(){
		System.out.println("You can't insert a quarter,the machine is sold out.");
	}

	public void ejectQuarter(){
		System.out.println("You can't eject,you haven't inserted a quarter yet.");
	}

	public void turnCrank() {
		System.out.println("You turned, but there are no gumballs");
	}
 
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

	public void refill(){
		machine.setState(machine.getNoQuarterState());
	}
	//只在处于口香糖都销售完的状态下调用refill方法才会填充，
	//其他状态类中均用空白的方法体避免检查异常。

	public String toString(){
		return "sold out";
	}
}