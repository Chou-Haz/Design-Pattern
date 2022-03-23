public class Ceilingfan {
	String location;
	Level level;
	Level onTheLevel; 
	Level lowLevel;
	Level mediumLevel;
	Level highLevel;

	public Ceilingfan(String location) {
		this.location = location;

		onTheLevel = new OnTheLevel(this);
		lowLevel = new LowLevel(this);
		mediumLevel = new MediumLevel(this);
		highLevel = new HighLevel(this);

		level = onTheLevel;
	}

	public void turnOn() {
		// level = lowLevel;
		System.out.println(location + "'s ceilingfan has changed.");
		level.turn();
	}

	public void turnOff() {
		System.out.println(location + "'s ceilingfan is off.");

	}

	public Level getLowLevel() {
		return lowLevel;
	}

	public Level getMediumLevel() {
		return mediumLevel;
	}

	public Level getHighLevel() {
		return highLevel;
	}

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}
}