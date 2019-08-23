package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.weather.LocalWeatherLive;
import com.amap.api.services.weather.WeatherSearchQuery;

public class am extends an<WeatherSearchQuery, LocalWeatherLive> {
    private LocalWeatherLive i = new LocalWeatherLive();

    public /* bridge */ /* synthetic */ String i() {
        return super.i();
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        String city = ((WeatherSearchQuery) this.f6441a).getCity();
        if (!p.i(city)) {
            String c2 = c(city);
            stringBuffer.append("&city=");
            stringBuffer.append(c2);
        }
        stringBuffer.append("&extensions=base");
        stringBuffer.append("&key=" + bf.f(this.f6444d));
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public LocalWeatherLive a(String str) throws AMapException {
        this.i = p.d(str);
        return this.i;
    }

    public am(Context context, WeatherSearchQuery weatherSearchQuery) {
        super(context, weatherSearchQuery);
    }
}
