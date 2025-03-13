package com.example.weather1;

import ch.qos.logback.core.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/weather")
public class WeatherController {

    final WeatherService weatherService;

    @Autowired
    public WeatherController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    @GetMapping("/{city}")
    public WeatherData getWeather(@PathVariable String city, Model model) {

        WeatherData weatherData = weatherService.getWeather(city);

        model.addText("city: " + city);
        return weatherService.getWeather(city);
    }
}

