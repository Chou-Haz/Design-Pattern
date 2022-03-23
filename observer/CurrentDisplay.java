public class CurrentDisplay implements Observer,DisplayElement {
	private float temperature;
	private float humidity;
	private Subject weatherData;

	public CurrentDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temperature,float humidity) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	public void display() {
		System.out.println("Current Condition:\n"+
			"Temperature:"+temperature+"\n"
			+"Humidity"+humidity);
	}
}