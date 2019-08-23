package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.busline.BusLineQuery;
import com.amap.api.services.busline.BusLineResult;
import com.amap.api.services.busline.BusStationQuery;
import com.amap.api.services.busline.BusStationResult;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

public class d<T> extends b<T, Object> {
    private int i;
    private List<String> j = new ArrayList();
    private List<SuggestionCity> k = new ArrayList();

    public String i() {
        String str = "";
        if (!(this.f6441a instanceof BusLineQuery)) {
            str = "stopname";
        } else if (((BusLineQuery) this.f6441a).getCategory() == BusLineQuery.SearchType.BY_LINE_ID) {
            str = "lineid";
        } else if (((BusLineQuery) this.f6441a).getCategory() == BusLineQuery.SearchType.BY_LINE_NAME) {
            str = "linename";
        }
        return i.a() + "/bus/" + str + "?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        if (this.f6441a instanceof BusLineQuery) {
            BusLineQuery busLineQuery = (BusLineQuery) this.f6441a;
            sb.append("&extensions=all");
            if (busLineQuery.getCategory() == BusLineQuery.SearchType.BY_LINE_ID) {
                sb.append("&id=");
                sb.append(c(((BusLineQuery) this.f6441a).getQueryString()));
            } else {
                String city = busLineQuery.getCity();
                if (!p.i(city)) {
                    String c2 = c(city);
                    sb.append("&city=");
                    sb.append(c2);
                }
                sb.append("&keywords=" + c(busLineQuery.getQueryString()));
                sb.append("&offset=" + busLineQuery.getPageSize());
                sb.append("&page=" + busLineQuery.getPageNumber());
            }
        } else {
            BusStationQuery busStationQuery = (BusStationQuery) this.f6441a;
            String city2 = busStationQuery.getCity();
            if (!p.i(city2)) {
                String c3 = c(city2);
                sb.append("&city=");
                sb.append(c3);
            }
            sb.append("&keywords=" + c(busStationQuery.getQueryString()));
            sb.append("&offset=" + busStationQuery.getPageSize());
            sb.append("&page=" + busStationQuery.getPageNumber());
        }
        sb.append("&key=" + bf.f(this.f6444d));
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public Object a(String str) throws AMapException {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONObject optJSONObject = jSONObject.optJSONObject("suggestion");
            if (optJSONObject != null) {
                this.k = p.a(optJSONObject);
                this.j = p.b(optJSONObject);
            }
            this.i = jSONObject.optInt("count");
            if (this.f6441a instanceof BusLineQuery) {
                return BusLineResult.createPagedResult((BusLineQuery) this.f6441a, this.i, this.k, this.j, p.i(jSONObject));
            }
            return BusStationResult.createPagedResult((BusStationQuery) this.f6441a, this.i, this.k, this.j, p.e(jSONObject));
        } catch (Exception e2) {
            j.a(e2, "BusSearchServerHandler", "paseJSON");
            return null;
        }
    }

    public d(Context context, T t) {
        super(context, t);
    }
}
