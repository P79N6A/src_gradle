package com.bytedance.sdk.account.open.tt.impl;

import android.content.Context;
import android.content.Intent;
import com.bytedance.sdk.account.b.c.c;
import com.bytedance.sdk.account.open.tt.a.a;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f22524a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.sdk.account.a.a.b f22525b;

    public final boolean a(c.a aVar) {
        if (!this.f22525b.a("com.ss.android.article.news", "bdopen.BdAuthorizeActivity", 1) || !this.f22525b.a("com.ss.android.article.news", "aea615ab910015038f73c47e45d21466") || !this.f22525b.a("bdopen.BdEntryActivity", "com.ss.android.article.news", "bdopen.BdAuthorizeActivity", aVar)) {
            return this.f22525b.a(TTWebAuthorizeActivity.class, aVar);
        }
        return true;
    }

    b(Context context, com.bytedance.sdk.account.a.a.b bVar) {
        this.f22524a = context;
        this.f22525b = bVar;
    }

    public final boolean a(Intent intent, com.bytedance.sdk.account.b.a.a aVar) {
        return this.f22525b.a(intent, aVar);
    }

    public final boolean a(c.a aVar, com.bytedance.sdk.account.b.c.b bVar) {
        return this.f22525b.a("bdopen.BdEntryActivity", aVar, bVar);
    }
}
