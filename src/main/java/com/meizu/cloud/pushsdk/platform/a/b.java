package com.meizu.cloud.pushsdk.platform.a;

import android.content.Context;
import com.meizu.cloud.pushsdk.b.a.c;
import com.meizu.cloud.pushsdk.platform.b.a;
import com.meizu.cloud.pushsdk.platform.b.d;
import com.meizu.cloud.pushsdk.platform.b.e;
import com.meizu.cloud.pushsdk.platform.b.f;
import com.meizu.cloud.pushsdk.platform.b.g;
import java.io.File;
import java.util.concurrent.ScheduledExecutorService;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f27264a;

    /* renamed from: b  reason: collision with root package name */
    private ScheduledExecutorService f27265b;

    /* renamed from: c  reason: collision with root package name */
    private Context f27266c;

    /* renamed from: d  reason: collision with root package name */
    private a f27267d;

    /* renamed from: e  reason: collision with root package name */
    private com.meizu.cloud.pushsdk.platform.b.b f27268e;

    /* renamed from: f  reason: collision with root package name */
    private g f27269f;
    private f g;
    private e h;
    private d i;
    private a j;
    private boolean k;

    public b(Context context, boolean z) {
        this(context, z, true);
    }

    public b(Context context, boolean z, boolean z2) {
        this.k = true;
        this.f27266c = context.getApplicationContext();
        this.f27267d = new a(this.f27266c);
        if (z) {
            this.f27265b = (ScheduledExecutorService) com.meizu.cloud.pushsdk.c.b.a.b.a();
        }
        this.k = z2;
        this.f27268e = new com.meizu.cloud.pushsdk.platform.b.b(this.f27266c, this.f27267d, this.f27265b, z2);
        this.f27269f = new g(this.f27266c, this.f27267d, this.f27265b, z2);
        this.g = new f(this.f27266c, this.f27267d, this.f27265b, z2);
        this.h = new e(this.f27266c, this.f27267d, this.f27265b, z2);
        this.i = new d(this.f27266c, this.f27267d, this.f27265b, z2);
        this.j = new a(this.f27266c, this.f27265b, z2);
    }

    public static b a(Context context) {
        if (f27264a == null) {
            synchronized (b.class) {
                if (f27264a == null) {
                    f27264a = new b(context, true);
                }
            }
        }
        return f27264a;
    }

    public c<String> a(String str, String str2, String str3, File file) {
        return this.f27267d.a(str, str2, str3, file);
    }

    public void a(boolean z) {
        this.f27268e.a(z);
        this.f27269f.a(z);
        this.g.a(z);
        this.i.a(z);
        this.h.a(z);
    }

    public boolean a(String str) {
        a aVar = new a(this.f27266c, this.f27265b, this.k);
        aVar.a(0);
        aVar.d(str);
        return aVar.m();
    }

    public boolean a(String str, String str2) {
        a aVar = new a(this.f27266c, this.f27265b, this.k);
        aVar.a(2);
        aVar.a(str2);
        aVar.d(str);
        return aVar.m();
    }

    public boolean a(String str, String str2, String str3) {
        this.f27268e.b(str);
        this.f27268e.c(str2);
        this.f27268e.d(str3);
        return this.f27268e.m();
    }

    public boolean a(String str, String str2, String str3, String str4) {
        this.g.b(str);
        this.g.c(str2);
        this.g.d(str3);
        this.g.a(str4);
        this.g.a(2);
        return this.g.m();
    }

    public boolean a(String str, String str2, String str3, String str4, int i2, boolean z) {
        this.g.b(str);
        this.g.c(str2);
        this.g.d(str3);
        this.g.a(str4);
        this.g.a(i2);
        this.g.b(z);
        return this.g.m();
    }

    public boolean a(String str, String str2, String str3, String str4, String str5) {
        this.h.b(str);
        this.h.c(str2);
        this.h.d(str3);
        this.h.e(str4);
        this.h.a(0);
        this.h.a(str5);
        return this.h.m();
    }

    public boolean a(String str, String str2, String str3, String str4, boolean z) {
        this.g.b(str);
        this.g.c(str2);
        this.g.d(str3);
        this.g.a(str4);
        this.g.a(3);
        this.g.b(z);
        return this.g.m();
    }

    public boolean a(String str, int... iArr) {
        a aVar = new a(this.f27266c, this.f27265b, this.k);
        aVar.a(iArr);
        aVar.d(str);
        aVar.a(1);
        return aVar.m();
    }

    public boolean b(String str, String str2, String str3) {
        this.f27269f.b(str);
        this.f27269f.c(str2);
        this.f27269f.d(str3);
        return this.f27269f.m();
    }

    public boolean b(String str, String str2, String str3, String str4) {
        this.h.b(str);
        this.h.c(str2);
        this.h.d(str3);
        this.h.e(str4);
        this.h.a(2);
        return this.h.m();
    }

    public boolean b(String str, String str2, String str3, String str4, String str5) {
        this.h.b(str);
        this.h.c(str2);
        this.h.d(str3);
        this.h.e(str4);
        this.h.a(1);
        this.h.a(str5);
        return this.h.m();
    }

    public boolean c(String str, String str2, String str3, String str4) {
        this.h.b(str);
        this.h.c(str2);
        this.h.d(str3);
        this.h.e(str4);
        this.h.a(3);
        return this.h.m();
    }

    public boolean c(String str, String str2, String str3, String str4, String str5) {
        this.i.b(str);
        this.i.c(str2);
        this.i.d(str3);
        this.i.e(str4);
        this.i.a(0);
        this.i.a(str5);
        return this.i.m();
    }

    public boolean d(String str, String str2, String str3, String str4) {
        this.i.b(str);
        this.i.c(str2);
        this.i.d(str3);
        this.i.e(str4);
        this.i.a(2);
        return this.i.m();
    }

    public boolean d(String str, String str2, String str3, String str4, String str5) {
        this.i.b(str);
        this.i.c(str2);
        this.i.d(str3);
        this.i.e(str4);
        this.i.a(1);
        this.i.a(str5);
        return this.i.m();
    }
}
