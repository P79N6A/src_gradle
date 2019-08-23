package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.district.DistrictResult;
import com.amap.api.services.district.DistrictSearchQuery;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class l extends b<DistrictSearchQuery, DistrictResult> {
    public String i() {
        return i.a() + "/config/district?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("output=json");
        stringBuffer.append("&page=");
        stringBuffer.append(((DistrictSearchQuery) this.f6441a).getPageNum());
        stringBuffer.append("&offset=");
        stringBuffer.append(((DistrictSearchQuery) this.f6441a).getPageSize());
        stringBuffer.append("&showChild=");
        stringBuffer.append(((DistrictSearchQuery) this.f6441a).isShowChild());
        if (((DistrictSearchQuery) this.f6441a).isShowBoundary()) {
            stringBuffer.append("&extensions=all");
        } else {
            stringBuffer.append("&extensions=base");
        }
        if (((DistrictSearchQuery) this.f6441a).checkKeyWords()) {
            String c2 = c(((DistrictSearchQuery) this.f6441a).getKeywords());
            stringBuffer.append("&keywords=");
            stringBuffer.append(c2);
        }
        stringBuffer.append("&key=" + bf.f(this.f6444d));
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public DistrictResult a(String str) throws AMapException {
        ArrayList arrayList = new ArrayList();
        DistrictResult districtResult = new DistrictResult((DistrictSearchQuery) this.f6441a, arrayList);
        try {
            JSONObject jSONObject = new JSONObject(str);
            districtResult.setPageCount(jSONObject.optInt("count"));
            JSONArray optJSONArray = jSONObject.optJSONArray("districts");
            if (optJSONArray == null) {
                return districtResult;
            }
            p.a(optJSONArray, arrayList, null);
            return districtResult;
        } catch (JSONException e2) {
            j.a(e2, "DistrictServerHandler", "paseJSONJSONException");
        } catch (Exception e3) {
            j.a(e3, "DistrictServerHandler", "paseJSONException");
        }
    }

    public l(Context context, DistrictSearchQuery districtSearchQuery) {
        super(context, districtSearchQuery);
    }
}
