package com.ss.android.ad.splash.core.c;

import com.ss.android.ad.splash.utils.d;
import com.ss.android.ad.splash.utils.g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public List<String> f27645a;

    /* renamed from: b  reason: collision with root package name */
    public List<String> f27646b;

    /* renamed from: c  reason: collision with root package name */
    public List<String> f27647c;

    /* renamed from: d  reason: collision with root package name */
    public String f27648d;

    /* renamed from: e  reason: collision with root package name */
    public long f27649e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27650f;
    public int g;
    public int h;

    public final boolean a() {
        if (g.a(this.f27648d) || this.g <= 0 || d.a(this.f27647c) || g.a(this.f27647c.get(0))) {
            return false;
        }
        return true;
    }

    public final void a(JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray("play_track_url_list");
        if (!(optJSONArray == null || optJSONArray.length() == 0)) {
            this.f27645a = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                try {
                    this.f27645a.add(optJSONArray.getString(i));
                } catch (JSONException unused) {
                }
            }
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray("playover_track_url_list");
        if (!(optJSONArray2 == null || optJSONArray2.length() == 0)) {
            this.f27646b = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                try {
                    this.f27646b.add(optJSONArray2.getString(i2));
                } catch (Exception unused2) {
                }
            }
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("video_url_list");
        if (!(optJSONArray3 == null || optJSONArray3.length() == 0)) {
            this.f27647c = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                try {
                    this.f27647c.add(optJSONArray3.getString(i3));
                } catch (Exception unused3) {
                }
            }
        }
        this.f27648d = jSONObject.optString("video_id");
        this.f27649e = jSONObject.optLong("video_group_id");
        this.f27650f = jSONObject.optBoolean("voice_switch");
        String optString = jSONObject.optString("video_density");
        int indexOf = optString.indexOf("x");
        if (indexOf >= 0) {
            int i4 = indexOf + 1;
            if (i4 < optString.length()) {
                this.h = Integer.parseInt(optString.substring(0, indexOf));
                this.g = Integer.parseInt(optString.substring(i4));
            }
        }
    }
}
