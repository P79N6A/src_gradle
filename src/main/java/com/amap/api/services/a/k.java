package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.route.DistanceResult;
import com.amap.api.services.route.DistanceSearch;
import java.util.List;

public class k extends b<DistanceSearch.DistanceQuery, DistanceResult> {
    private final String i = "/distance?";
    private final String j = "|";
    private final String k = ",";

    public String i() {
        return i.a() + "/distance?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        List origins = ((DistanceSearch.DistanceQuery) this.f6441a).getOrigins();
        if (origins != null && origins.size() > 0) {
            stringBuffer.append("&origins=");
            int size = origins.size();
            for (int i2 = 0; i2 < size; i2++) {
                LatLonPoint latLonPoint = (LatLonPoint) origins.get(i2);
                if (latLonPoint != null) {
                    double a2 = j.a(latLonPoint.getLatitude());
                    stringBuffer.append(j.a(latLonPoint.getLongitude()));
                    stringBuffer.append(",");
                    stringBuffer.append(a2);
                    if (i2 < size) {
                        stringBuffer.append("|");
                    }
                }
            }
        }
        LatLonPoint destination = ((DistanceSearch.DistanceQuery) this.f6441a).getDestination();
        if (destination != null) {
            double a3 = j.a(destination.getLatitude());
            double a4 = j.a(destination.getLongitude());
            stringBuffer.append("&destination=");
            stringBuffer.append(a4);
            stringBuffer.append(",");
            stringBuffer.append(a3);
        }
        stringBuffer.append("&type=");
        stringBuffer.append(((DistanceSearch.DistanceQuery) this.f6441a).getType());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public DistanceResult a(String str) throws AMapException {
        return p.q(str);
    }

    public k(Context context, DistanceSearch.DistanceQuery distanceQuery) {
        super(context, distanceQuery);
    }
}
