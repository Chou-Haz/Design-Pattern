public class ObserverTestDrive {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer display = new CurrentDisplay(weatherData);
		weatherData.setData(29.5f,30.0f);
		weatherData.setData(31.0f,40.0f);
	}
}