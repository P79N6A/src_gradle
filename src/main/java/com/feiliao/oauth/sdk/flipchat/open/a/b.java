package com.feiliao.oauth.sdk.flipchat.open.a;

import com.google.gson.annotations.SerializedName;

public final class b extends d {
    @SerializedName("data")

    /* renamed from: a  reason: collision with root package name */
    public a f24260a;

    public static class a extends c {
        @SerializedName("canSilentRegister")

        /* renamed from: a  reason: collision with root package name */
        public boolean f24261a;
    }

    public final c a() {
        return this.f24260a;
    }

    public static b c() {
        b bVar = new b();
        a aVar = new a();
        aVar.f24262b = -1;
        bVar.f24260a = aVar;
        return bVar;
    }

    public final boolean b() {
        if (this.f24260a == null || !this.f24260a.f24261a) {
            return false;
        }
        return true;
    }
}
