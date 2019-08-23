package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.routepoisearch.RoutePOIItem;
import com.amap.api.services.routepoisearch.RoutePOISearchQuery;
import com.amap.api.services.routepoisearch.RoutePOISearchResult;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class af extends b<RoutePOISearchQuery, RoutePOISearchResult> {
    public String i() {
        return i.a() + "/place/route?";
    }

    /* access modifiers changed from: protected */
    public String g() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=");
        stringBuffer.append(bf.f(this.f6444d));
        stringBuffer.append("&range=");
        stringBuffer.append(((RoutePOISearchQuery) this.f6441a).getRange());
        String str2 = "";
        try {
            switch (((RoutePOISearchQuery) this.f6441a).getSearchType()) {
                case TypeGasStation:
                    str = "0101";
                    break;
                case TypeMaintenanceStation:
                    str = "0300";
                    break;
                case TypeATM:
                    str = "1603";
                    break;
                case TypeToilet:
                    str = "2003";
                    break;
                case TypeFillingStation:
                    str = "0103";
                    break;
                case TypeServiceArea:
                    str2 = "180301";
                    break;
            }
        } catch (Exception unused) {
        }
        str = str2;
        if (((RoutePOISearchQuery) this.f6441a).getPolylines() == null || ((RoutePOISearchQuery) this.f6441a).getPolylines().size() <= 0) {
            stringBuffer.append("&origin=");
            stringBuffer.append(j.a(((RoutePOISearchQuery) this.f6441a).getFrom()));
            stringBuffer.append("&destination=");
            stringBuffer.append(j.a(((RoutePOISearchQuery) this.f6441a).getTo()));
            stringBuffer.append("&strategy=");
            stringBuffer.append(((RoutePOISearchQuery) this.f6441a).getMode());
        } else {
            stringBuffer.append("&polyline=");
            stringBuffer.append(j.a(((RoutePOISearchQuery) this.f6441a).getPolylines()));
        }
        stringBuffer.append("&types=");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public RoutePOISearchResult a(String str) throws AMapException {
        ArrayList<RoutePOIItem> arrayList;
        try {
            arrayList = p.w(new JSONObject(str));
        } catch (JSONException unused) {
            arrayList = new ArrayList<>();
        }
        return new RoutePOISearchResult(arrayList, (RoutePOISearchQuery) this.f6441a);
    }

    public af(Context context, RoutePOISearchQuery routePOISearchQuery) {
        super(context, routePOISearchQuery);
    }
}
