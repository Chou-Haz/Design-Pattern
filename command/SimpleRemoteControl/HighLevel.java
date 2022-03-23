public class HighLevel implements Level {
	Ceilingfan ceilingfan;

	public HighLevel(Ceilingfan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	public void turn() {
		System.out.println("The ceilingfan is turning speed high.");		
		ceilingfan.setLevel(ceilingfan.getLowLevel());
	}
}