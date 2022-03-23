import java.util.ArrayList;

public class WeatherData implements Subject {
	float temperature;
	float humidity;
	ArrayList<Observer> observers;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	public void notifyObservers(){
		for(Observer observer : observers) {
			observer.update(temperature,humidity);
		}
	}

	public void setData(float t,float h) {
		temperature = t;
		humidity = h;
		notifyObservers();
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}
}