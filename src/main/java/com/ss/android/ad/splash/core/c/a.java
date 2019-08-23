package com.ss.android.ad.splash.core.c;

import android.support.annotation.NonNull;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f27605a;

    /* renamed from: b  reason: collision with root package name */
    public String f27606b;

    /* renamed from: c  reason: collision with root package name */
    public String f27607c;

    /* renamed from: d  reason: collision with root package name */
    public String f27608d;

    public final String toString() {
        return "ShareAdInfo{mTitle='" + this.f27605a + '\'' + ", mDescription='" + this.f27606b + '\'' + ", mImageUrl='" + this.f27607c + '\'' + ", mShareUrl='" + this.f27608d + '\'' + '}';
    }

    public a(@NonNull JSONObject jSONObject) {
        this.f27605a = jSONObject.optString("share_title");
        this.f27606b = jSONObject.optString("share_desc");
        this.f27607c = jSONObject.optString("share_icon");
        this.f27608d = jSONObject.optString("share_url");
    }
}
