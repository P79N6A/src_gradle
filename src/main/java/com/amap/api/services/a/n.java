package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.geocoder.GeocodeAddress;
import com.amap.api.services.geocoder.GeocodeQuery;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class n extends b<GeocodeQuery, ArrayList<GeocodeAddress>> {
    public String i() {
        return i.a() + "/geocode/geo?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json&address=");
        stringBuffer.append(c(((GeocodeQuery) this.f6441a).getLocationName()));
        String city = ((GeocodeQuery) this.f6441a).getCity();
        if (!p.i(city)) {
            String c2 = c(city);
            stringBuffer.append("&city=");
            stringBuffer.append(c2);
        }
        stringBuffer.append("&key=" + bf.f(this.f6444d));
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public ArrayList<GeocodeAddress> a(String str) throws AMapException {
        ArrayList<GeocodeAddress> arrayList = new ArrayList<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (!jSONObject.has("count")) {
                return arrayList;
            }
            if (jSONObject.getInt("count") > 0) {
                arrayList = p.l(jSONObject);
            }
            return arrayList;
        } catch (JSONException e2) {
            j.a(e2, "GeocodingHandler", "paseJSONJSONException");
        } catch (Exception e3) {
            j.a(e3, "GeocodingHandler", "paseJSONException");
        }
    }

    public n(Context context, GeocodeQuery geocodeQuery) {
        super(context, geocodeQuery);
    }
}
