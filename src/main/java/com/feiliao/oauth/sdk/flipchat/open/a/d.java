package com.feiliao.oauth.sdk.flipchat.open.a;

import com.google.gson.annotations.SerializedName;

public abstract class d {
    @SerializedName("message")

    /* renamed from: b  reason: collision with root package name */
    public String f24264b;

    public abstract c a();

    public final boolean d() {
        return "success".equals(this.f24264b);
    }
}
