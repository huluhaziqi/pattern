package com.company.Observer;

import java.util.Observable;
import java.util.Observer;

public class TestDisplay implements Observer {

    private float temperature;

    private float humidity;

    private float pressure;

    private TestData testData;

    public TestDisplay(TestData testData) {
        this.testData = testData;
        testData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof TestData) {
            this.testData = (TestData ) o;
            this.temperature = ((TestData) o).getTemperature();
            this.humidity = ((TestData) o).getHumidity();
            this.pressure = ((TestData) o).getPressure();
            display();
        }
    }

    public void display() {
        System.out.println("display " + temperature + " " + humidity + " " + pressure);
    }
}
