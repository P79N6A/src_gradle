package com.amap.api.services.weather;

public class LocalWeatherLiveResult {

    /* renamed from: a  reason: collision with root package name */
    private WeatherSearchQuery f7347a;

    /* renamed from: b  reason: collision with root package name */
    private LocalWeatherLive f7348b;

    public LocalWeatherLive getLiveResult() {
        return this.f7348b;
    }

    public WeatherSearchQuery getWeatherLiveQuery() {
        return this.f7347a;
    }

    private LocalWeatherLiveResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        this.f7347a = weatherSearchQuery;
        this.f7348b = localWeatherLive;
    }

    public static LocalWeatherLiveResult createPagedResult(WeatherSearchQuery weatherSearchQuery, LocalWeatherLive localWeatherLive) {
        return new LocalWeatherLiveResult(weatherSearchQuery, localWeatherLive);
    }
}
