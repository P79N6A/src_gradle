package com.alipay.d.a.a.c;

import com.alipay.f.a.a.b.a.a;
import com.alipay.f.a.a.b.b.b;

public final class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f5380a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ b f5381b;

    c(b bVar, a aVar) {
        this.f5381b = bVar;
        this.f5380a = aVar;
    }

    public final void run() {
        try {
            b unused = b.f5374e = this.f5381b.f5375a.a();
        } catch (Throwable th) {
            b unused2 = b.f5374e = new b();
            b.f5374e.success = false;
            b a2 = b.f5374e;
            a2.resultCode = "static data rpc upload error, " + com.alipay.d.a.a.a.a.a(th);
            com.alipay.d.a.a.a.a.a(th);
        }
    }
}
