package com.alipay.d.a.a.c;

import android.content.Context;
import com.alipay.b.b.a.a.ad;
import com.alipay.b.b.a.a.e;
import com.alipay.b.b.a.a.o;
import com.alipay.f.a.a.b.a;
import org.json.JSONObject;

public final class b implements a {

    /* renamed from: d  reason: collision with root package name */
    private static b f5373d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static com.alipay.f.a.a.b.b.b f5374e;

    /* renamed from: a  reason: collision with root package name */
    a f5375a;

    /* renamed from: b  reason: collision with root package name */
    private ad f5376b;

    /* renamed from: c  reason: collision with root package name */
    private com.alipay.f.a.a.a.a f5377c;

    private b(Context context, String str) {
        e eVar = new e();
        eVar.f5261a = str;
        this.f5376b = new o(context);
        this.f5377c = (com.alipay.f.a.a.a.a) this.f5376b.a(com.alipay.f.a.a.a.a.class, eVar);
        this.f5375a = (a) this.f5376b.a(a.class, eVar);
    }

    public static synchronized b a(Context context, String str) {
        b bVar;
        synchronized (b.class) {
            if (f5373d == null) {
                f5373d = new b(context, str);
            }
            bVar = f5373d;
        }
        return bVar;
    }

    public final com.alipay.f.a.a.b.b.b a(com.alipay.f.a.a.b.a.a aVar) {
        if (this.f5375a != null) {
            f5374e = null;
            new Thread(new c(this, aVar)).start();
            int i = 300000;
            while (f5374e == null && i >= 0) {
                Thread.sleep(50);
                i -= 50;
            }
        }
        return f5374e;
    }

    public final boolean a(String str) {
        String str2;
        boolean z = false;
        if (com.alipay.d.a.a.a.a.a(str)) {
            return false;
        }
        if (this.f5377c != null) {
            try {
                com.alipay.f.a.a.a.a aVar = this.f5377c;
                com.alipay.d.a.a.a.a.e(str);
                str2 = aVar.a();
            } catch (Exception unused) {
                str2 = null;
            }
            if (!com.alipay.d.a.a.a.a.a(str2)) {
                z = ((Boolean) new JSONObject(str2).get("success")).booleanValue();
            }
        }
        return z;
    }
}
