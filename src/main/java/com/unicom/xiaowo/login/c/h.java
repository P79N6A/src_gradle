package com.unicom.xiaowo.login.c;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import com.unicom.xiaowo.login.d.a;
import com.unicom.xiaowo.login.d.b;
import com.unicom.xiaowo.login.d.c;
import com.unicom.xiaowo.login.d.d;
import com.unicom.xiaowo.login.d.e;

public final class h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f81442a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f81443b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ k f81444c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ f f81445d;

    h(f fVar, Context context, String str, k kVar) {
        this.f81445d = fVar;
        this.f81442a = context;
        this.f81443b = str;
        this.f81444c = kVar;
    }

    public final void run() {
        a a2 = a.a();
        Context context = this.f81442a;
        String str = this.f81443b;
        i iVar = new i(this);
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                a2.f81450b = (ConnectivityManager) context.getSystemService("connectivity");
                NetworkRequest.Builder builder = new NetworkRequest.Builder();
                builder.addTransportType(0);
                builder.addCapability(12);
                NetworkRequest build = builder.build();
                a2.f81449a = new d(a2, iVar);
                if (a2.f81451c != null) {
                    a2.f81451c.cancel();
                    a2.f81451c = null;
                }
                a2.f81451c = new e(a2, iVar);
                a2.f81451c.start();
                a2.f81450b.requestNetwork(build, a2.f81449a);
            } catch (Exception e2) {
                com.google.a.a.a.a.a.a.b(e2);
                iVar.a(false, null);
            }
        } else {
            if (a2.f81452d != null) {
                a2.f81452d.shutdownNow();
            }
            a2.f81452d = b.a();
            a2.f81452d.submit(new c(a2, context, str, iVar));
        }
    }
}
