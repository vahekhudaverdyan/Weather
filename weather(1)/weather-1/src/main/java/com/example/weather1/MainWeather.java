package com.example.weather1;

public class MainWeather {
    private double temp;
    private double feels_like;
    private double temp_min;
    private double temp_max;
    private int humidity;


    // Геттеры и сеттеры
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getTempMin() {
        return temp_min;
    }

    public void setTempMin(double tempMin) {
        this.temp_min = tempMin;
    }

    public double getTempMax() {
        return temp_max;
    }

    public void setTempMax(double tempMax) {
        this.temp_max = tempMax;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }
}
