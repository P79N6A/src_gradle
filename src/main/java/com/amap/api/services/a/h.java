package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.cloud.CloudItem;
import com.amap.api.services.cloud.CloudItemDetail;
import com.amap.api.services.cloud.CloudResult;
import com.amap.api.services.cloud.CloudSearch;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class h extends f<CloudSearch.Query, CloudResult> {
    private int i;

    private String j() {
        if (((CloudSearch.Query) this.f6441a).getSortingrules() != null) {
            return ((CloudSearch.Query) this.f6441a).getSortingrules().toString();
        }
        return "";
    }

    private String k() {
        StringBuffer stringBuffer = new StringBuffer();
        String filterString = ((CloudSearch.Query) this.f6441a).getFilterString();
        String filterNumString = ((CloudSearch.Query) this.f6441a).getFilterNumString();
        stringBuffer.append(filterString);
        if (!j.a(filterString) && !j.a(filterNumString)) {
            stringBuffer.append("+");
        }
        stringBuffer.append(filterNumString);
        return stringBuffer.toString();
    }

    public String i() {
        String str = i.c() + "/datasearch";
        String shape = ((CloudSearch.Query) this.f6441a).getBound().getShape();
        if (shape.equals("Bound")) {
            return str + "/around?";
        } else if (shape.equals("Polygon") || shape.equals("Rectangle")) {
            return str + "/polygon?";
        } else if (!shape.equals("Local")) {
            return str;
        } else {
            return str + "/local?";
        }
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        if (((CloudSearch.Query) this.f6441a).getBound() != null) {
            if (((CloudSearch.Query) this.f6441a).getBound().getShape().equals("Bound")) {
                double a2 = j.a(((CloudSearch.Query) this.f6441a).getBound().getCenter().getLongitude());
                double a3 = j.a(((CloudSearch.Query) this.f6441a).getBound().getCenter().getLatitude());
                sb.append("&center=");
                sb.append(a2 + "," + a3);
                sb.append("&radius=");
                sb.append(((CloudSearch.Query) this.f6441a).getBound().getRange());
            } else if (((CloudSearch.Query) this.f6441a).getBound().getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((CloudSearch.Query) this.f6441a).getBound().getLowerLeft();
                LatLonPoint upperRight = ((CloudSearch.Query) this.f6441a).getBound().getUpperRight();
                double a4 = j.a(lowerLeft.getLatitude());
                double a5 = j.a(lowerLeft.getLongitude());
                double a6 = j.a(upperRight.getLatitude());
                double a7 = j.a(upperRight.getLongitude());
                sb.append("&polygon=" + a5 + "," + a4 + ";" + a7 + "," + a6);
            } else if (((CloudSearch.Query) this.f6441a).getBound().getShape().equals("Polygon")) {
                List polyGonList = ((CloudSearch.Query) this.f6441a).getBound().getPolyGonList();
                if (polyGonList != null && polyGonList.size() > 0) {
                    sb.append("&polygon=" + j.a(polyGonList, ";"));
                }
            } else if (((CloudSearch.Query) this.f6441a).getBound().getShape().equals("Local")) {
                String c2 = c(((CloudSearch.Query) this.f6441a).getBound().getCity());
                sb.append("&city=");
                sb.append(c2);
            }
        }
        sb.append("&tableid=" + ((CloudSearch.Query) this.f6441a).getTableID());
        if (!j.a(k())) {
            k();
            String c3 = c(k());
            sb.append("&filter=");
            sb.append(c3);
        }
        if (!j.a(j())) {
            sb.append("&sortrule=");
            sb.append(j());
        }
        String c4 = c(((CloudSearch.Query) this.f6441a).getQueryString());
        if (((CloudSearch.Query) this.f6441a).getQueryString() == null || ((CloudSearch.Query) this.f6441a).getQueryString().equals("")) {
            sb.append("&keywords=");
        } else {
            sb.append("&keywords=" + c4);
        }
        sb.append("&limit=" + ((CloudSearch.Query) this.f6441a).getPageSize());
        sb.append("&page=" + ((CloudSearch.Query) this.f6441a).getPageNum());
        sb.append("&key=" + bf.f(this.f6444d));
        return sb.toString();
    }

    private ArrayList<CloudItem> b(JSONObject jSONObject) throws JSONException {
        ArrayList<CloudItem> arrayList = new ArrayList<>();
        if (!jSONObject.has("datas")) {
            return arrayList;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("datas");
        this.i = jSONObject.getInt("count");
        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i2);
            CloudItemDetail a2 = a(optJSONObject);
            a(a2, optJSONObject);
            arrayList.add(a2);
        }
        return arrayList;
    }

    /* renamed from: f */
    public CloudResult a(String str) throws AMapException {
        ArrayList<CloudItem> arrayList;
        if (str == null || str.equals("")) {
            return CloudResult.createPagedResult((CloudSearch.Query) this.f6441a, this.i, ((CloudSearch.Query) this.f6441a).getBound(), ((CloudSearch.Query) this.f6441a).getPageSize(), null);
        }
        try {
            arrayList = b(new JSONObject(str));
        } catch (Exception | JSONException unused) {
            arrayList = null;
        }
        return CloudResult.createPagedResult((CloudSearch.Query) this.f6441a, this.i, ((CloudSearch.Query) this.f6441a).getBound(), ((CloudSearch.Query) this.f6441a).getPageSize(), arrayList);
    }

    public h(Context context, CloudSearch.Query query) {
        super(context, query);
    }
}
