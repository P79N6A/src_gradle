package com.bytedance.sdk.account.open.tt.impl;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.sdk.account.a.b.d;
import com.bytedance.sdk.account.b.c.b;
import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.open.tt.a.a;

public class TTWebAuthorizeActivity extends d {

    /* renamed from: c  reason: collision with root package name */
    private a f22522c;

    public final String a() {
        return "open.snssdk.com";
    }

    public final String b() {
        return "/oauth/authorize/";
    }

    public final String c() {
        return "api.snssdk.com";
    }

    public void onCreate(Bundle bundle) {
        this.f22522c = a.a((Context) this);
        super.onCreate(bundle);
    }

    public final void a(c.a aVar, b bVar) {
        this.f22522c.a(aVar, bVar);
    }

    public final boolean a(Intent intent, com.bytedance.sdk.account.b.a.a aVar) {
        return this.f22522c.a(intent, aVar);
    }
}
