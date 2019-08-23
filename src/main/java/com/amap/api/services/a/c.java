package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.BusRouteResult;
import com.amap.api.services.route.RouteSearch;

public class c extends b<RouteSearch.BusRouteQuery, BusRouteResult> {
    public String i() {
        return i.a() + "/direction/transit/integrated?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        stringBuffer.append("&origin=");
        stringBuffer.append(j.a(((RouteSearch.BusRouteQuery) this.f6441a).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(j.a(((RouteSearch.BusRouteQuery) this.f6441a).getFromAndTo().getTo()));
        String city = ((RouteSearch.BusRouteQuery) this.f6441a).getCity();
        if (!p.i(city)) {
            city = c(city);
            stringBuffer.append("&city=");
            stringBuffer.append(city);
        }
        if (!p.i(((RouteSearch.BusRouteQuery) this.f6441a).getCity())) {
            String c2 = c(city);
            stringBuffer.append("&cityd=");
            stringBuffer.append(c2);
        }
        stringBuffer.append("&strategy=");
        stringBuffer.append(((RouteSearch.BusRouteQuery) this.f6441a).getMode());
        stringBuffer.append("&nightflag=");
        stringBuffer.append(((RouteSearch.BusRouteQuery) this.f6441a).getNightFlag());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public BusRouteResult a(String str) throws AMapException {
        return p.a(str);
    }

    public c(Context context, RouteSearch.BusRouteQuery busRouteQuery) {
        super(context, busRouteQuery);
    }
}
