package com.company.Observer;

public class Main {

    public static void main(String[] args) {
//        WeatherData weatherData = new WeatherData();
//        ConditionsDisplay conditionsDisplay = new ConditionsDisplay(weatherData);
//
//        weatherData.setMeasuerments(80,100,200);
//        weatherData.setMeasuerments(90,70,29.1f);
//        weatherData.setMeasuerments(40,30,200);
//        weatherData.setMeasuerments(50,90,20.45f);

        TestData testData = new TestData();
        TestDisplay testDisplay = new TestDisplay(testData);
        testData.setData(80,100,200);
        testData.setData(90,70,29.1f);
        testData.setData(40,30,200);
        testData.setData(50,90,20.45f);
    }
}
