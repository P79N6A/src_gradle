package com.amap.api.services.a;

import android.content.Context;
import android.text.TextUtils;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class o extends b<InputtipsQuery, ArrayList<Tip>> {
    public String i() {
        return i.a() + "/assistant/inputtips?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        String c2 = c(((InputtipsQuery) this.f6441a).getKeyword());
        if (!TextUtils.isEmpty(c2)) {
            stringBuffer.append("&keywords=");
            stringBuffer.append(c2);
        }
        String city = ((InputtipsQuery) this.f6441a).getCity();
        if (!p.i(city)) {
            String c3 = c(city);
            stringBuffer.append("&city=");
            stringBuffer.append(c3);
        }
        String type = ((InputtipsQuery) this.f6441a).getType();
        if (!p.i(type)) {
            String c4 = c(type);
            stringBuffer.append("&type=");
            stringBuffer.append(c4);
        }
        if (((InputtipsQuery) this.f6441a).getCityLimit()) {
            stringBuffer.append("&citylimit=true");
        } else {
            stringBuffer.append("&citylimit=false");
        }
        LatLonPoint location = ((InputtipsQuery) this.f6441a).getLocation();
        if (location != null) {
            stringBuffer.append("&location=");
            stringBuffer.append(location.getLongitude());
            stringBuffer.append(",");
            stringBuffer.append(location.getLatitude());
        }
        stringBuffer.append("&key=");
        stringBuffer.append(bf.f(this.f6444d));
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public ArrayList<Tip> a(String str) throws AMapException {
        try {
            return p.m(new JSONObject(str));
        } catch (JSONException e2) {
            j.a(e2, "InputtipsHandler", "paseJSON");
            return null;
        }
    }

    public o(Context context, InputtipsQuery inputtipsQuery) {
        super(context, inputtipsQuery);
    }
}
