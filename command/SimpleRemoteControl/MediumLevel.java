public class MediumLevel implements Level {
	Ceilingfan ceilingfan; 

	public MediumLevel(Ceilingfan ceilingfan) {
		this.ceilingfan = ceilingfan;
	}

	public void turn() {
		System.out.println("The ceilingfan is turning speed Medium.");
		ceilingfan.setLevel(ceilingfan.getHighLevel());
	}
}