package com.bytedance.ad.symphony.f;

import com.bytedance.ad.symphony.g.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7623a = new a();

    /* renamed from: b  reason: collision with root package name */
    public int f7624b;

    /* renamed from: c  reason: collision with root package name */
    public Map<String, String> f7625c;

    /* renamed from: d  reason: collision with root package name */
    String f7626d;

    /* renamed from: e  reason: collision with root package name */
    private List<Integer> f7627e;

    /* renamed from: f  reason: collision with root package name */
    private List<List<Integer>> f7628f;
    private List<String> g;
    private List<Integer> h;

    public final String a() {
        return this.f7626d;
    }

    public final List<List<Integer>> c() {
        if (this.f7628f != null) {
            return this.f7628f;
        }
        return new ArrayList();
    }

    public final List<Integer> d() {
        if (this.h == null) {
            this.h = new ArrayList();
        }
        return this.h;
    }

    public final List<Integer> b() {
        this.f7627e = a(this.f7627e);
        if (this.f7627e != null) {
            return this.f7627e;
        }
        return new ArrayList();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("displaySort-->");
        sb.append(b());
        if (d.a(this.f7628f)) {
            sb.append("preloadSort-->");
            sb.append(c());
        }
        if (this.h != null && !this.h.isEmpty()) {
            sb.append(this.h);
        }
        return sb.toString();
    }

    private static List<Integer> a(List<Integer> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (((Integer) it2.next()) == null) {
                it2.remove();
            }
        }
        return arrayList;
    }

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                a aVar = new a();
                aVar.f7626d = jSONObject.toString();
                JSONArray optJSONArray = jSONObject.optJSONArray("display_sort");
                if (optJSONArray != null) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        arrayList.add(Integer.valueOf(optJSONArray.getInt(i)));
                    }
                    aVar.f7627e = arrayList;
                }
                JSONArray optJSONArray2 = jSONObject.optJSONArray("preload_sort");
                if (optJSONArray2 != null) {
                    ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        JSONArray optJSONArray3 = optJSONArray2.optJSONArray(i2);
                        if (optJSONArray3 != null) {
                            ArrayList arrayList3 = new ArrayList(optJSONArray3.length());
                            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                                arrayList3.add(Integer.valueOf(optJSONArray3.getInt(i3)));
                            }
                            arrayList2.add(arrayList3);
                        }
                        aVar.f7628f = arrayList2;
                    }
                }
                JSONArray optJSONArray4 = jSONObject.optJSONArray("keywords");
                if (optJSONArray4 != null) {
                    ArrayList arrayList4 = new ArrayList(optJSONArray4.length());
                    for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                        arrayList4.add(optJSONArray4.optString(i4, ""));
                    }
                    aVar.g = arrayList4;
                }
                aVar.f7624b = jSONObject.optInt("gender");
                JSONArray optJSONArray5 = jSONObject.optJSONArray("separated_preload_sort");
                if (optJSONArray5 != null) {
                    ArrayList arrayList5 = new ArrayList(optJSONArray5.length());
                    for (int i5 = 0; i5 < optJSONArray5.length(); i5++) {
                        arrayList5.add(Integer.valueOf(optJSONArray5.getInt(i5)));
                    }
                    aVar.h = arrayList5;
                }
                JSONObject optJSONObject = jSONObject.optJSONObject("custom_targeting");
                if (optJSONObject != null) {
                    aVar.f7625c = new HashMap();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        aVar.f7625c.put(next, optJSONObject.optString(next));
                    }
                }
                return aVar;
            } catch (JSONException unused) {
                new StringBuilder("strategy json is not valid,json string:").append(jSONObject.toString());
            }
        }
        return null;
    }
}
