package com.example.weather1;

import com.sun.tools.javac.Main;

public class WeatherData {
    private WeatherResponse[] weather;
    private MainWeather main;


    public WeatherResponse[] getWeather() {
        return weather;
    }

    public void setWeather(WeatherResponse[] weather) {
        this.weather = weather;
    }

    public MainWeather getMain() {
        return main;
    }

    public void setMain(MainWeather main) {
        this.main = main;
    }


}
