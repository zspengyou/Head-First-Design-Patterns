package headfirst.designpatterns.observer.weather;

import headfirst.designpatterns.observer.weather.displayElementa.Observer;

public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
