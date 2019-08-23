package com.ss.android.ad.splash.core.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f27629a;

    /* renamed from: b  reason: collision with root package name */
    public int f27630b;

    /* renamed from: c  reason: collision with root package name */
    public String f27631c;

    /* renamed from: d  reason: collision with root package name */
    public String f27632d;

    @NonNull
    public static e a(@Nullable JSONObject jSONObject) {
        e eVar = new e();
        if (jSONObject != null) {
            eVar.f27629a = jSONObject.optString("background_color");
            eVar.f27630b = jSONObject.optInt("position");
            eVar.f27631c = jSONObject.optString("text_color");
            eVar.f27632d = jSONObject.optString("text");
        }
        return eVar;
    }
}
