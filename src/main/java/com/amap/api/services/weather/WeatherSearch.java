package com.amap.api.services.weather;

import android.content.Context;
import com.amap.api.services.a.bc;
import com.amap.api.services.a.be;
import com.amap.api.services.a.cm;
import com.amap.api.services.a.i;
import com.amap.api.services.interfaces.IWeatherSearch;

public class WeatherSearch {

    /* renamed from: a  reason: collision with root package name */
    private IWeatherSearch f7349a;

    public interface OnWeatherSearchListener {
        void onWeatherForecastSearched(LocalWeatherForecastResult localWeatherForecastResult, int i);

        void onWeatherLiveSearched(LocalWeatherLiveResult localWeatherLiveResult, int i);
    }

    public WeatherSearchQuery getQuery() {
        if (this.f7349a != null) {
            return this.f7349a.getQuery();
        }
        return null;
    }

    public void searchWeatherAsyn() {
        if (this.f7349a != null) {
            this.f7349a.searchWeatherAsyn();
        }
    }

    public void setOnWeatherSearchListener(OnWeatherSearchListener onWeatherSearchListener) {
        if (this.f7349a != null) {
            this.f7349a.setOnWeatherSearchListener(onWeatherSearchListener);
        }
    }

    public void setQuery(WeatherSearchQuery weatherSearchQuery) {
        if (this.f7349a != null) {
            this.f7349a.setQuery(weatherSearchQuery);
        }
    }

    public WeatherSearch(Context context) {
        try {
            Context context2 = context;
            this.f7349a = (IWeatherSearch) cm.a(context2, i.a(true), "com.amap.api.services.dynamic.WeatherSearchWrapper", bc.class, new Class[]{Context.class}, new Object[]{context});
        } catch (be unused) {
        }
        if (this.f7349a == null) {
            try {
                this.f7349a = new bc(context);
            } catch (Exception unused2) {
            }
        }
    }
}
