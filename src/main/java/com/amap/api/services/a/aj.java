package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.route.RouteSearch;
import com.amap.api.services.route.TruckRouteRestult;

public class aj extends b<RouteSearch.TruckRouteQuery, TruckRouteRestult> {
    private final String i = "/direction/truck?";
    private final String j = "|";
    private final String k = ",";

    public String i() {
        return i.b() + "/direction/truck?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        if (((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo() != null) {
            stringBuffer.append("&origin=");
            stringBuffer.append(j.a(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getFrom()));
            if (!p.i(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getStartPoiID())) {
                stringBuffer.append("&originid=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getStartPoiID());
            }
            stringBuffer.append("&destination=");
            stringBuffer.append(j.a(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getTo()));
            if (!p.i(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getDestinationPoiID())) {
                stringBuffer.append("&destinationid=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getDestinationPoiID());
            }
            if (!p.i(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getOriginType())) {
                stringBuffer.append("&origintype=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getOriginType());
            }
            if (!p.i(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getDestinationType())) {
                stringBuffer.append("&destinationtype=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getDestinationType());
            }
            if (!p.i(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getPlateProvince())) {
                stringBuffer.append("&province=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getPlateProvince());
            }
            if (!p.i(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getPlateNumber())) {
                stringBuffer.append("&number=");
                stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getFromAndTo().getPlateNumber());
            }
        }
        stringBuffer.append("&strategy=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getMode());
        if (((RouteSearch.TruckRouteQuery) this.f6441a).hasPassPoint()) {
            stringBuffer.append("&waypoints=");
            stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getPassedPointStr());
        }
        stringBuffer.append("&size=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getTruckSize());
        stringBuffer.append("&height=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getTruckHeight());
        stringBuffer.append("&width=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getTruckWidth());
        stringBuffer.append("&load=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getTruckLoad());
        stringBuffer.append("&weight=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getTruckWeight());
        stringBuffer.append("&axis=");
        stringBuffer.append(((RouteSearch.TruckRouteQuery) this.f6441a).getTruckAxis());
        stringBuffer.append("&extensions=all");
        stringBuffer.append("&output=json");
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public TruckRouteRestult a(String str) throws AMapException {
        return p.r(str);
    }

    public aj(Context context, RouteSearch.TruckRouteQuery truckRouteQuery) {
        super(context, truckRouteQuery);
    }
}
