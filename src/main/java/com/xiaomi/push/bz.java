package com.xiaomi.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;

public class bz {

    /* renamed from: a  reason: collision with root package name */
    private static bz f81879a;

    /* renamed from: a  reason: collision with other field name */
    private Context f201a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f202a;

    /* renamed from: a  reason: collision with other field name */
    private HandlerThread f203a;

    /* renamed from: a  reason: collision with other field name */
    private cs f204a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f205a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f81880b;

    public static bz a() {
        if (f81879a == null) {
            f81879a = new bz();
        }
        return f81879a;
    }

    /* access modifiers changed from: private */
    public void c() {
        co.a().a(this.f201a);
        this.f81880b = true;
    }

    /* access modifiers changed from: private */
    public void d() {
        co.a().a();
        this.f81880b = false;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m135a() {
        co.a().c();
    }

    public void a(Context context) {
        this.f201a = context;
        bm.a(this.f201a);
        if (!this.f205a) {
            this.f205a = true;
            this.f203a = new HandlerThread("metoknlp_cl");
            this.f203a.start();
            this.f202a = new Handler(this.f203a.getLooper());
            this.f204a = new cr(this, null);
            bm.a().a(this.f204a);
            if (bl.a().a()) {
                b();
            }
        }
    }

    public void b() {
        if (this.f202a != null) {
            this.f202a.post(new ca(this));
        }
    }
}
