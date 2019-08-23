package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class co {

    /* renamed from: a  reason: collision with root package name */
    private static co f81909a;

    /* renamed from: a  reason: collision with other field name */
    private static String f233a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public int f234a = 0;

    /* renamed from: a  reason: collision with other field name */
    private Context f235a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f236a = new cc(this);

    /* renamed from: a  reason: collision with other field name */
    private ce f237a = new ce();

    /* renamed from: a  reason: collision with other field name */
    private ch f238a;

    /* renamed from: a  reason: collision with other field name */
    private ci f239a;

    /* renamed from: a  reason: collision with other field name */
    private cl f240a;

    /* renamed from: a  reason: collision with other field name */
    private Object f241a = new Object();

    public static co a() {
        if (f81909a == null) {
            f81909a = new co();
        }
        return f81909a;
    }

    /* access modifiers changed from: private */
    public void a(HashMap hashMap) {
        if (hashMap != null) {
            String b2 = ck.b(this.f235a);
            if (!(this.f237a == null || b2 == null)) {
                this.f237a.g(b2);
                if (hashMap.containsKey(b2)) {
                    this.f237a.h((String) hashMap.get(b2));
                }
            }
            String a2 = ck.a(this.f235a);
            if (a2 != null && hashMap.containsKey(a2)) {
                hashMap.remove(a2);
            }
            if (this.f237a != null && hashMap.size() > 0) {
                this.f237a.a((List) new ArrayList(hashMap.values()));
                b();
            }
        }
    }

    private void d() {
        cn.a(this.f235a, this.f236a, 0);
    }

    private void e() {
        String c2 = ck.c(this.f235a);
        String a2 = ck.a(this.f235a, 2);
        String a3 = ck.a(this.f235a, 1);
        if (c2 != null && a2 != null && a3 != null && this.f237a != null) {
            this.f237a.a(Build.MODEL).b(bq.b()).c(c2).f(a2).e(a3).a(this.f239a.a()).b(this.f239a.b());
        }
    }

    private void f() {
        b();
    }

    private void g() {
        if (this.f234a == 4 && this.f237a != null) {
            ((bl) this.f235a).a(this.f237a.a().a().toString());
        }
    }

    private void h() {
        this.f240a = new cl(this, null);
        f233a = bm.a().a();
        StringBuffer stringBuffer = new StringBuffer(f233a);
        stringBuffer.append("/api/v2/realip");
        String stringBuffer2 = stringBuffer.toString();
        this.f240a.execute(new String[]{stringBuffer2});
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m170a() {
        if (this.f238a != null) {
            this.f238a.c();
            this.f238a.d();
            this.f238a = null;
        }
        this.f239a = null;
    }

    public void a(Context context) {
        this.f235a = context;
        this.f239a = new ci(this, null);
        this.f238a = new ch(context);
        this.f238a.b();
        this.f238a.a((cq) this.f239a);
    }

    /* access modifiers changed from: package-private */
    public void b() {
        if (bm.a().b()) {
            switch (this.f234a) {
                case 0:
                    this.f234a = 1;
                    e();
                    if (this.f237a != null) {
                        d();
                        break;
                    }
                    break;
                case 1:
                    this.f234a = 2;
                    f();
                    return;
                case 2:
                    this.f234a = 3;
                    h();
                    return;
                case 3:
                    this.f234a = 4;
                    this.f240a.cancel(true);
                    this.f240a = null;
                    g();
                    return;
                default:
                    return;
            }
        }
    }

    public void c() {
        if (this.f238a != null) {
            this.f238a.a();
        }
    }
}
