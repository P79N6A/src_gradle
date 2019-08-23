package com.ss.optimizer.live.sdk.a.a;

import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f78388a;

    /* renamed from: b  reason: collision with root package name */
    public int f78389b = c.f69428f;

    /* renamed from: c  reason: collision with root package name */
    public boolean f78390c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f78391d;

    /* renamed from: e  reason: collision with root package name */
    private int f78392e;

    /* renamed from: f  reason: collision with root package name */
    private String f78393f;
    private JSONObject g;

    @NonNull
    public final Set<String> a() {
        HashSet hashSet = new HashSet();
        if (this.f78392e == 0 && this.g != null && this.g.length() > 0) {
            Iterator<String> keys = this.g.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next != null && !next.equals("")) {
                    hashSet.add(next);
                }
            }
        }
        return hashSet;
    }

    public final List<String> a(String str) {
        if (this.f78392e == 0 && this.g != null && this.g.length() > 0) {
            try {
                ArrayList arrayList = new ArrayList();
                if (this.g.has(str)) {
                    JSONArray jSONArray = this.g.getJSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        arrayList.add(jSONArray.getString(i));
                    }
                    return arrayList;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public a(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                this.f78392e = jSONObject.getInt("StatusCode");
                this.f78393f = jSONObject.getString("StatusMessage");
                if (this.f78392e == 0) {
                    this.g = jSONObject.getJSONObject("IpMap");
                    this.f78388a = jSONObject.getString("Symbol");
                }
                this.f78389b = jSONObject.getInt("DnsTTL");
                this.f78390c = jSONObject.getBoolean("EnableIpSettings");
                this.f78391d = jSONObject.getBoolean("EnablePing");
            } catch (JSONException unused) {
            }
        }
    }
}
