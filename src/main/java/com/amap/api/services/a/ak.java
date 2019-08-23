package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.WalkRouteResult;

public class ak extends b<RouteSearch.WalkRouteQuery, WalkRouteResult> {
    public String i() {
        return i.a() + "/direction/walking?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        stringBuffer.append("&origin=");
        stringBuffer.append(j.a(((RouteSearch.WalkRouteQuery) this.f6441a).getFromAndTo().getFrom()));
        stringBuffer.append("&destination=");
        stringBuffer.append(j.a(((RouteSearch.WalkRouteQuery) this.f6441a).getFromAndTo().getTo()));
        stringBuffer.append("&multipath=0");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public WalkRouteResult a(String str) throws AMapException {
        return p.c(str);
    }

    public ak(Context context, RouteSearch.WalkRouteQuery walkRouteQuery) {
        super(context, walkRouteQuery);
    }
}
