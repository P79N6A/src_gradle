package com.amap.api.services.a;

import android.content.Context;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.core.PoiItem;
import com.amap.api.services.core.SuggestionCity;
import com.amap.api.services.poisearch.PoiResult;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class y extends w<ab, PoiResult> {
    private int i;
    private List<String> j = new ArrayList();
    private List<SuggestionCity> k = new ArrayList();

    private String a(boolean z) {
        return z ? "distance" : "weight";
    }

    public String i() {
        String str = i.a() + "/place";
        if (((ab) this.f6441a).f6449b == null) {
            return str + "/text?";
        }
        if (((ab) this.f6441a).f6449b.getShape().equals("Bound")) {
            str = str + "/around?";
        } else if (((ab) this.f6441a).f6449b.getShape().equals("Rectangle") || ((ab) this.f6441a).f6449b.getShape().equals("Polygon")) {
            str = str + "/polygon?";
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public String g() {
        StringBuilder sb = new StringBuilder();
        sb.append("output=json");
        if (((ab) this.f6441a).f6449b != null) {
            if (((ab) this.f6441a).f6449b.getShape().equals("Bound")) {
                double a2 = j.a(((ab) this.f6441a).f6449b.getCenter().getLongitude());
                double a3 = j.a(((ab) this.f6441a).f6449b.getCenter().getLatitude());
                sb.append("&location=");
                sb.append(a2 + "," + a3);
                sb.append("&radius=");
                sb.append(((ab) this.f6441a).f6449b.getRange());
                sb.append("&sortrule=");
                sb.append(a(((ab) this.f6441a).f6449b.isDistanceSort()));
            } else if (((ab) this.f6441a).f6449b.getShape().equals("Rectangle")) {
                LatLonPoint lowerLeft = ((ab) this.f6441a).f6449b.getLowerLeft();
                LatLonPoint upperRight = ((ab) this.f6441a).f6449b.getUpperRight();
                double a4 = j.a(lowerLeft.getLatitude());
                double a5 = j.a(lowerLeft.getLongitude());
                double a6 = j.a(upperRight.getLatitude());
                double a7 = j.a(upperRight.getLongitude());
                sb.append("&polygon=" + a5 + "," + a4 + ";" + a7 + "," + a6);
            } else if (((ab) this.f6441a).f6449b.getShape().equals("Polygon")) {
                List<LatLonPoint> polyGonList = ((ab) this.f6441a).f6449b.getPolyGonList();
                if (polyGonList != null && polyGonList.size() > 0) {
                    sb.append("&polygon=" + j.a(polyGonList));
                }
            }
        }
        String city = ((ab) this.f6441a).f6448a.getCity();
        if (!e(city)) {
            String c2 = c(city);
            sb.append("&city=");
            sb.append(c2);
        }
        String c3 = c(((ab) this.f6441a).f6448a.getQueryString());
        if (!e(c3)) {
            sb.append("&keywords=" + c3);
        }
        sb.append("&offset=" + ((ab) this.f6441a).f6448a.getPageSize());
        sb.append("&page=" + ((ab) this.f6441a).f6448a.getPageNum());
        String building = ((ab) this.f6441a).f6448a.getBuilding();
        if (building != null && building.trim().length() > 0) {
            sb.append("&building=" + ((ab) this.f6441a).f6448a.getBuilding());
        }
        String c4 = c(((ab) this.f6441a).f6448a.getCategory());
        if (!e(c4)) {
            sb.append("&types=" + c4);
        }
        sb.append("&extensions=all");
        sb.append("&key=" + bf.f(this.f6444d));
        if (((ab) this.f6441a).f6448a.getCityLimit()) {
            sb.append("&citylimit=true");
        } else {
            sb.append("&citylimit=false");
        }
        if (((ab) this.f6441a).f6448a.isRequireSubPois()) {
            sb.append("&children=1");
        } else {
            sb.append("&children=0");
        }
        if (((ab) this.f6441a).f6449b == null && ((ab) this.f6441a).f6448a.getLocation() != null) {
            sb.append("&sortrule=");
            sb.append(a(((ab) this.f6441a).f6448a.isDistanceSort()));
            double a8 = j.a(((ab) this.f6441a).f6448a.getLocation().getLongitude());
            double a9 = j.a(((ab) this.f6441a).f6448a.getLocation().getLatitude());
            sb.append("&location=");
            sb.append(a8 + "," + a9);
        }
        return sb.toString();
    }

    /* renamed from: f */
    public PoiResult a(String str) throws AMapException {
        ArrayList<PoiItem> arrayList;
        ArrayList<PoiItem> arrayList2 = new ArrayList<>();
        if (str == null) {
            return PoiResult.createPagedResult(((ab) this.f6441a).f6448a, ((ab) this.f6441a).f6449b, this.j, this.k, ((ab) this.f6441a).f6448a.getPageSize(), this.i, arrayList2);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.i = jSONObject.optInt("count");
            arrayList = p.c(jSONObject);
            try {
                if (!jSONObject.has("suggestion")) {
                    return PoiResult.createPagedResult(((ab) this.f6441a).f6448a, ((ab) this.f6441a).f6449b, this.j, this.k, ((ab) this.f6441a).f6448a.getPageSize(), this.i, arrayList);
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("suggestion");
                if (optJSONObject == null) {
                    return PoiResult.createPagedResult(((ab) this.f6441a).f6448a, ((ab) this.f6441a).f6449b, this.j, this.k, ((ab) this.f6441a).f6448a.getPageSize(), this.i, arrayList);
                }
                this.k = p.a(optJSONObject);
                this.j = p.b(optJSONObject);
                return PoiResult.createPagedResult(((ab) this.f6441a).f6448a, ((ab) this.f6441a).f6449b, this.j, this.k, ((ab) this.f6441a).f6448a.getPageSize(), this.i, arrayList);
            } catch (JSONException e2) {
                e = e2;
                j.a(e, "PoiSearchKeywordHandler", "paseJSONJSONException");
                return PoiResult.createPagedResult(((ab) this.f6441a).f6448a, ((ab) this.f6441a).f6449b, this.j, this.k, ((ab) this.f6441a).f6448a.getPageSize(), this.i, arrayList);
            } catch (Exception e3) {
                e = e3;
                j.a(e, "PoiSearchKeywordHandler", "paseJSONException");
                return PoiResult.createPagedResult(((ab) this.f6441a).f6448a, ((ab) this.f6441a).f6449b, this.j, this.k, ((ab) this.f6441a).f6448a.getPageSize(), this.i, arrayList);
            }
        } catch (JSONException e4) {
            e = e4;
            arrayList = arrayList2;
            j.a(e, "PoiSearchKeywordHandler", "paseJSONJSONException");
            return PoiResult.createPagedResult(((ab) this.f6441a).f6448a, ((ab) this.f6441a).f6449b, this.j, this.k, ((ab) this.f6441a).f6448a.getPageSize(), this.i, arrayList);
        } catch (Exception e5) {
            e = e5;
            arrayList = arrayList2;
            j.a(e, "PoiSearchKeywordHandler", "paseJSONException");
            return PoiResult.createPagedResult(((ab) this.f6441a).f6448a, ((ab) this.f6441a).f6449b, this.j, this.k, ((ab) this.f6441a).f6448a.getPageSize(), this.i, arrayList);
        }
    }

    public y(Context context, ab abVar) {
        super(context, abVar);
    }
}
