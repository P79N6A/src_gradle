package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.DriveRouteResult;
import com.amap.api.services.route.RouteSearch;

public class m extends b<RouteSearch.DriveRouteQuery, DriveRouteResult> {
    public String i() {
        return i.a() + "/direction/driving?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        if (((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(j.a(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getFrom()));
            if (!p.i(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(j.a(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getTo()));
            if (!p.i(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getDestinationPoiID());
            }
            if (!p.i(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getOriginType());
            }
            if (!p.i(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getDestinationType());
            }
            if (!p.i(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getPlateProvince());
            }
            if (!p.i(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=");
                stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getFromAndTo().getPlateNumber());
            }
        }
        stringBuffer.append("&strategy=");
        stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getMode());
        stringBuffer.append("&extensions=all");
        if (((RouteSearch.DriveRouteQuery) this.f6441a).hasPassPoint()) {
            stringBuffer.append("&waypoints=");
            stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getPassedPointStr());
        }
        if (((RouteSearch.DriveRouteQuery) this.f6441a).hasAvoidpolygons()) {
            stringBuffer.append("&avoidpolygons=");
            stringBuffer.append(((RouteSearch.DriveRouteQuery) this.f6441a).getAvoidpolygonsStr());
        }
        if (((RouteSearch.DriveRouteQuery) this.f6441a).hasAvoidRoad()) {
            stringBuffer.append("&avoidroad=");
            stringBuffer.append(c(((RouteSearch.DriveRouteQuery) this.f6441a).getAvoidRoad()));
        }
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public DriveRouteResult a(String str) throws AMapException {
        return p.b(str);
    }

    public m(Context context, RouteSearch.DriveRouteQuery driveRouteQuery) {
        super(context, driveRouteQuery);
    }
}
