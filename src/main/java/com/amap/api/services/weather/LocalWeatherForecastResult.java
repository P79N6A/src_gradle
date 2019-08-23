package com.amap.api.services.weather;

public class LocalWeatherForecastResult {

    /* renamed from: a  reason: collision with root package name */
    private WeatherSearchQuery f7339a;

    /* renamed from: b  reason: collision with root package name */
    private LocalWeatherForecast f7340b;

    public LocalWeatherForecast getForecastResult() {
        return this.f7340b;
    }

    public WeatherSearchQuery getWeatherForecastQuery() {
        return this.f7339a;
    }

    private LocalWeatherForecastResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherForecast localWeatherForecast) {
        this.f7339a = weatherSearchQuery;
        this.f7340b = localWeatherForecast;
    }

    public static LocalWeatherForecastResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherForecast localWeatherForecast) {
        return new LocalWeatherForecastResult(weatherSearchQuery, localWeatherForecast);
    }
}
