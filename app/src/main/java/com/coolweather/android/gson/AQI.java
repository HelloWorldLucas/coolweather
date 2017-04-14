package com.coolweather.android.gson;

/**
 * Created by Gonglx on 2017/4/14.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
