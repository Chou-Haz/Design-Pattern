public class GumballTestDrive {
	public static void main(String[] args) {
		Machine machine = new Machine(5);

		System.out.println(machine);

		machine.insertQuarter();
		machine.turnCrank();
		System.out.println(machine);

		machine.insertQuarter();
		machine.turnCrank();
		System.out.println(machine);
		machine.insertQuarter();
		machine.turnCrank();
		System.out.println(machine);
		machine.insertQuarter();
		machine.turnCrank();
		System.out.println(machine);
		machine.insertQuarter();
		machine.turnCrank();
		System.out.println(machine);		
	}
}