package com.feiliao.oauth.sdk.a.b;

import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.account.b.c.a;
import com.bytedance.sdk.account.b.c.c;

public final class b implements com.feiliao.oauth.sdk.a.a.b {

    /* renamed from: a  reason: collision with root package name */
    private Context f24257a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.account.a.a.b f24258b;

    public final boolean a() {
        return this.f24258b.a("com.feiliao.flipchat.android");
    }

    public final boolean a(a aVar) {
        return this.f24258b.a("rocketopen.RocketEntryActivity", "com.feiliao.flipchat.android", "rocketopen.RocketAuthorizeActivity", aVar);
    }

    b(Context context, com.bytedance.sdk.account.a.a.b bVar) {
        this.f24257a = context;
        this.f24258b = bVar;
    }

    public final boolean a(Intent intent, com.bytedance.sdk.account.b.a.a aVar) {
        return this.f24258b.a(intent, aVar);
    }

    public final boolean a(c.a aVar, com.bytedance.sdk.account.b.c.b bVar) {
        return this.f24258b.a("rocketopen.RocketEntryActivity", aVar, bVar);
    }
}
