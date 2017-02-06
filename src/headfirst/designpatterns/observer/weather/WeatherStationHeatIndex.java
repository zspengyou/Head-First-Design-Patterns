package headfirst.designpatterns.observer.weather;

import headfirst.designpatterns.observer.weather.displayElementa.CurrentConditionsDisplay;
import headfirst.designpatterns.observer.weather.displayElementa.ForecastDisplay;
import headfirst.designpatterns.observer.weather.displayElementa.HeatIndexDisplay;
import headfirst.designpatterns.observer.weather.displayElementa.StatisticsDisplay;

public class WeatherStationHeatIndex {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
