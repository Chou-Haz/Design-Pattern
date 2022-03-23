public class ObserverTestDrive {
	public static void main(String[] args) {
		Subject weatherData = new WeatherData();
		Observer display = new CurrentDisplay(weatherData);
		weatherData.setData(29.5,30.0);
		weatherData.setData(31.0,40.0);
	}
}