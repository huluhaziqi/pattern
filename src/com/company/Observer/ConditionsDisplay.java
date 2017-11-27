package com.company.Observer;

public class ConditionsDisplay implements Display, Observer {

    private Subject weatherData;

    private float temperature;

    private float humidity;

    private float pressure;

    public ConditionsDisplay(Subject subject) {
        this.weatherData = subject;
        subject.registerObserver(this);

    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        play();
    }

    @Override
    public void play() {
        System.out.println("template : " + temperature + " humidity ： " + humidity + " pressure ：" + pressure);
    }
}
