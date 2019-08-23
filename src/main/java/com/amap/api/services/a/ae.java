package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.traffic.RoadTrafficQuery;
import com.amap.api.services.traffic.TrafficStatusResult;

public class ae extends b<RoadTrafficQuery, TrafficStatusResult> {
    public String i() {
        return i.a() + "/traffic/status/road?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        if (!TextUtils.isEmpty(((RoadTrafficQuery) this.f6441a).getName())) {
            stringBuffer.append("&name=");
            stringBuffer.append(((RoadTrafficQuery) this.f6441a).getName());
        }
        if (!TextUtils.isEmpty(((RoadTrafficQuery) this.f6441a).getAdCode())) {
            stringBuffer.append("&adcode=");
            stringBuffer.append(((RoadTrafficQuery) this.f6441a).getAdCode());
        }
        stringBuffer.append("&level=");
        stringBuffer.append(((RoadTrafficQuery) this.f6441a).getLevel());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public TrafficStatusResult a(String str) throws AMapException {
        return p.p(str);
    }

    public ae(Context context, RoadTrafficQuery roadTrafficQuery) {
        super(context, roadTrafficQuery);
    }
}
