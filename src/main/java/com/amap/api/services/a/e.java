package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.traffic.CircleTrafficQuery;
import com.amap.api.services.traffic.TrafficStatusResult;

public class e extends b<CircleTrafficQuery, TrafficStatusResult> {
    public String i() {
        return i.a() + "/traffic/status/circle?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        if (((CircleTrafficQuery) this.f6441a).getCenterPoint() != null) {
            stringBuffer.append("&location=");
            stringBuffer.append(j.a(((CircleTrafficQuery) this.f6441a).getCenterPoint()));
        }
        stringBuffer.append("&radius=");
        stringBuffer.append(((CircleTrafficQuery) this.f6441a).getRadius());
        stringBuffer.append("&level=");
        stringBuffer.append(((CircleTrafficQuery) this.f6441a).getLevel());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public TrafficStatusResult a(String str) throws AMapException {
        return p.p(str);
    }

    public e(Context context, CircleTrafficQuery circleTrafficQuery) {
        super(context, circleTrafficQuery);
    }
}
