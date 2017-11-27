package com.company.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {

    private ArrayList<Observer> observers;

    private float temperature;

    private float humidity;

    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public synchronized void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public synchronized void removeObserver(Observer o) {
        int i = observers.indexOf(o);
        if (i >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(temperature, humidity, pressure);
        }
    }

    public void measurementChanged() {
        notifyObserver();
    }

    public void setMeasuerments(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }

    //todo
}
