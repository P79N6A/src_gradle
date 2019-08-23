package com.ss.android.ad.splash.core.c;

import android.support.annotation.Nullable;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ad.splash.utils.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f27625a;

    /* renamed from: b  reason: collision with root package name */
    public int f27626b;

    /* renamed from: c  reason: collision with root package name */
    public int f27627c;

    /* renamed from: d  reason: collision with root package name */
    public String f27628d;

    public final boolean a() {
        if (this.f27626b <= 0 || this.f27627c <= 0 || com.ss.android.ad.splash.utils.d.a(this.f27625a) || g.a(this.f27628d)) {
            return false;
        }
        String str = this.f27625a.get(0);
        if (g.a(str) && this.f27625a.size() >= 2) {
            str = this.f27625a.get(1);
            if (g.a(str) && this.f27625a.size() >= 3) {
                str = this.f27625a.get(2);
            }
        }
        if (!g.a(str)) {
            return true;
        }
        return false;
    }

    @Nullable
    public static d a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("url_list");
        ArrayList arrayList = new ArrayList(3);
        if (optJSONArray == null) {
            return null;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString(PushConstants.WEB_URL);
                if (!g.a(optString)) {
                    arrayList.add(optString);
                }
            }
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString2 = jSONObject.optString("uri");
        if (g.a(optString2)) {
            return null;
        }
        return new d(arrayList, optInt, optInt2, optString2);
    }

    private d(List<String> list, int i, int i2, String str) {
        this.f27625a = list;
        this.f27626b = i;
        this.f27627c = i2;
        this.f27628d = str;
    }
}
