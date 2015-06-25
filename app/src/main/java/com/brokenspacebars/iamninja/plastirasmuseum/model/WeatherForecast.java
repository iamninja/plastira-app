package com.brokenspacebars.iamninja.plastirasmuseum.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iamninja on 6/25/15.
 */
public class WeatherForecast {
    private List<DayForecast> daysForecast = new ArrayList<DayForecast>();

    public void addForecast(DayForecast forecast) {
        daysForecast.add(forecast);
        System.out.println("Add forecast ["+forecast+"]");
    }

    public DayForecast getForecast(int dayNum) {
        return daysForecast.get(dayNum);
    }
}
