package com.lukaszsobczak.weatherapp;

public class Weather {

    private String cityName;
    private String province;
    private String precipitation;
    private String temperature;
    private int image;

    public Weather(String cityName, String province, String precipitation, String temperature, int image) {
        this.cityName = cityName;
        this.province = province;
        this.precipitation = precipitation;
        this.temperature = temperature;
        this.image = image;
    }

    public String getCityName() {
        return cityName;
    }

    public String getProvince() {
        return province;
    }

    public String getPrecipitation() {
        return precipitation;

    }

    public String getTemperature() {
        return temperature;
    }

    public int getImage() {
        return image;
    }
}
