package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.geocoder.RegeocodeAddress;
import com.amap.api.services.geocoder.RegeocodeQuery;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class ac extends b<RegeocodeQuery, RegeocodeAddress> {
    public String i() {
        return i.a() + "/geocode/regeo?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json&extensions=all");
        stringBuffer.append("&location=");
        stringBuffer.append(((RegeocodeQuery) this.f6441a).getPoint().getLongitude());
        stringBuffer.append(",");
        stringBuffer.append(((RegeocodeQuery) this.f6441a).getPoint().getLatitude());
        if (!TextUtils.isEmpty(((RegeocodeQuery) this.f6441a).getPoiType())) {
            stringBuffer.append("&poitype=");
            stringBuffer.append(((RegeocodeQuery) this.f6441a).getPoiType());
        }
        stringBuffer.append("&radius=");
        stringBuffer.append((int) ((RegeocodeQuery) this.f6441a).getRadius());
        stringBuffer.append("&coordsys=");
        stringBuffer.append(((RegeocodeQuery) this.f6441a).getLatLonType());
        stringBuffer.append("&key=" + bf.f(this.f6444d));
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RegeocodeAddress a(String str) throws AMapException {
        RegeocodeAddress regeocodeAddress = new RegeocodeAddress();
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("regeocode");
            if (optJSONObject == null) {
                return regeocodeAddress;
            }
            regeocodeAddress.setFormatAddress(p.a(optJSONObject, "formatted_address"));
            JSONObject optJSONObject2 = optJSONObject.optJSONObject("addressComponent");
            if (optJSONObject2 != null) {
                p.a(optJSONObject2, regeocodeAddress);
            }
            regeocodeAddress.setPois(p.c(optJSONObject));
            JSONArray optJSONArray = optJSONObject.optJSONArray("roads");
            if (optJSONArray != null) {
                p.b(optJSONArray, regeocodeAddress);
            }
            JSONArray optJSONArray2 = optJSONObject.optJSONArray("roadinters");
            if (optJSONArray2 != null) {
                p.a(optJSONArray2, regeocodeAddress);
            }
            JSONArray optJSONArray3 = optJSONObject.optJSONArray("aois");
            if (optJSONArray3 != null) {
                p.c(optJSONArray3, regeocodeAddress);
            }
            return regeocodeAddress;
        } catch (JSONException e2) {
            j.a(e2, "ReverseGeocodingHandler", "paseJSON");
        }
    }

    public ac(Context context, RegeocodeQuery regeocodeQuery) {
        super(context, regeocodeQuery);
    }
}
