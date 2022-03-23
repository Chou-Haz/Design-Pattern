public class OffLevel implements Level {
	Ceilingfan ceilingfan;

	public OffLevel(Ceilingfan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	public void turn() {
		ceilingfan.setLevel(ceilingfan.getLowLevel());		
		System.out.println("The ceilingfan is turning on...Speed low.");
	}

	public void execute() {

	}
}