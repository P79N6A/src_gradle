package com.ss.android.ad.splash.core.c;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import org.json.JSONObject;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public String f27639a;

    /* renamed from: b  reason: collision with root package name */
    public int f27640b;

    /* renamed from: c  reason: collision with root package name */
    public int f27641c;

    /* renamed from: d  reason: collision with root package name */
    public String f27642d;

    /* renamed from: e  reason: collision with root package name */
    public String f27643e;

    /* renamed from: f  reason: collision with root package name */
    public String f27644f;
    public boolean g;

    @NonNull
    public static i a(@Nullable JSONObject jSONObject) {
        i iVar = new i();
        if (jSONObject != null) {
            iVar.f27639a = jSONObject.optString("countdown_unit", "");
            iVar.f27640b = jSONObject.optInt("height_extra_size");
            iVar.f27641c = jSONObject.optInt("width_extra_size");
            iVar.f27642d = jSONObject.optString("text_color");
            iVar.f27643e = jSONObject.optString("background_color");
            iVar.f27644f = jSONObject.optString("text");
            boolean z = true;
            if (jSONObject.optInt("countdown_enable", 0) != 1) {
                z = false;
            }
            iVar.g = z;
        }
        return iVar;
    }
}
