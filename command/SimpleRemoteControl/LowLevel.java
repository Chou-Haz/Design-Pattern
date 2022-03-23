public class LowLevel implements Level {
	Ceilingfan ceilingfan;

	public LowLevel(Ceilingfan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	public void turn() {
		System.out.println("The ceilingfan is turning speed low");
		ceilingfan.setLevel(ceilingfan.getMediumLevel());
	}
}