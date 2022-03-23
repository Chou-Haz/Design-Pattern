public class OnTheLevel implements Level {
	Ceilingfan ceilingfan;

	public OnTheLevel(Ceilingfan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	public void turn() {
		
		ceilingfan.setLevel(ceilingfan.getLowLevel());
		ceilingfan.turnOn();
	}
}