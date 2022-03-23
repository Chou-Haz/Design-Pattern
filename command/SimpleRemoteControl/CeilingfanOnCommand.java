public class CeilingfanOnCommand implements Command {
	Ceilingfan ceilingfan;

	public CeilingfanOnCommand(Ceilingfan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	public void execute() {
		ceilingfan.turnOn();
	}
}