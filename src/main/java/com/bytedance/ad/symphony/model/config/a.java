package com.bytedance.ad.symphony.model.config;

import com.bytedance.common.utility.StringUtils;
import org.json.JSONObject;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public String f7660a = "";

    /* renamed from: b  reason: collision with root package name */
    public String f7661b = "";

    /* renamed from: c  reason: collision with root package name */
    public boolean f7662c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7663d;

    /* renamed from: e  reason: collision with root package name */
    public String f7664e;

    /* renamed from: f  reason: collision with root package name */
    public double f7665f;
    private String g;

    public String toString() {
        if (this.g == null) {
            return "";
        }
        return this.g;
    }

    public final boolean a() {
        if (StringUtils.isEmpty(this.f7660a) || StringUtils.isEmpty(this.f7661b)) {
            return false;
        }
        return true;
    }

    public static String a(String str) {
        if (str == null || str.length() <= 2) {
            return "";
        }
        return str.substring(0, str.length() - 2);
    }

    public a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.g = jSONObject.toString();
            this.f7660a = jSONObject.optString("id", "");
            this.f7661b = jSONObject.optString("type", "");
            this.f7662c = jSONObject.optBoolean("disable_play_when_visible", false);
            this.f7663d = jSONObject.optBoolean("disable_content_ad", false);
            this.f7664e = jSONObject.optString("media_aspect_ratio");
            this.f7665f = jSONObject.optDouble("local_ecpm_threshold", 0.0d);
        }
    }
}
