public class CeilingfanOffCommand implements Command {
	Ceilingfan ceilingfan;

	public CeilingfanOffCommand(Ceilingfan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	public void execute() {
		ceilingfan.turnOff();
	}
}