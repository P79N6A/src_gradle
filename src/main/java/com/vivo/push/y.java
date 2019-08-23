package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.vivo.push.util.o;

public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    private int f81711a = -1;

    /* renamed from: b  reason: collision with root package name */
    private String f81712b;

    /* access modifiers changed from: protected */
    public abstract void c(a aVar);

    public boolean c() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract void d(a aVar);

    public final String a() {
        return this.f81712b;
    }

    public final int b() {
        return this.f81711a;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public final void a(String str) {
        this.f81712b = str;
    }

    public y(int i) {
        if (i >= 0) {
            this.f81711a = i;
            return;
        }
        throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
    }

    private final void e(a aVar) {
        aVar.a("command", this.f81711a);
        aVar.a("client_pkgname", this.f81712b);
        c(aVar);
    }

    public final void a(Intent intent) {
        a a2 = a.a(intent);
        if (a2 == null) {
            o.b("PushCommand", "bundleWapper is null");
            return;
        }
        a(a2);
        Bundle b2 = a2.b();
        if (b2 != null) {
            intent.putExtras(b2);
        }
    }

    public final void b(a aVar) {
        String a2 = aVar.a();
        if (!TextUtils.isEmpty(a2)) {
            this.f81712b = a2;
        } else {
            this.f81712b = aVar.a("client_pkgname");
        }
        d(aVar);
    }

    public final void a(a aVar) {
        String a2 = z.a(this.f81711a);
        if (a2 == null) {
            a2 = "";
        }
        aVar.a(PushConstants.MZ_PUSH_MESSAGE_METHOD, a2);
        e(aVar);
    }

    public final void b(Intent intent) {
        a a2 = a.a(intent);
        if (a2 == null) {
            o.b("PushCommand", "bundleWapper is null");
            return;
        }
        a2.a(PushConstants.MZ_PUSH_MESSAGE_METHOD, this.f81711a);
        e(a2);
        Bundle b2 = a2.b();
        if (b2 != null) {
            intent.putExtras(b2);
        }
    }
}
