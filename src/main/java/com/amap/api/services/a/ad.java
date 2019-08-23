package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RideRouteResult;
import com.amap.api.services.route.RouteSearch;

public class ad extends b<RouteSearch.RideRouteQuery, RideRouteResult> {
    public String i() {
        return i.b() + "/direction/bicycling?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        stringBuffer.append("&origin=");
        stringBuffer.append(j.a(((RouteSearch.RideRouteQuery) this.f6441a).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(j.a(((RouteSearch.RideRouteQuery) this.f6441a).getFromAndTo().getTo()));
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RideRouteResult a(String str) throws AMapException {
        return p.o(str);
    }

    public ad(Context context, RouteSearch.RideRouteQuery rideRouteQuery) {
        super(context, rideRouteQuery);
    }
}
