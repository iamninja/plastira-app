package com.brokenspacebars.iamninja.plastirasmuseum.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by iamninja on 6/25/15.
 */
public class DayForecast {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    public Weather weather = new Weather();
    public ForecastTemp forecastTemp = new ForecastTemp();
    public long timestamp;

    public class ForecastTemp {
        public float day;
        public float min;
        public float max;
    }

    public String getStringDate() {
        return sdf.format(new Date(timestamp));
    }
}
