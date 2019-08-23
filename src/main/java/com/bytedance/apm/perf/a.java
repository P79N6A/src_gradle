package com.bytedance.apm.perf;

import android.app.Activity;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.d.b.e;
import com.bytedance.apm.j.b;
import com.bytedance.services.apm.api.c;
import com.bytedance.services.slardar.config.IConfigManager;
import org.json.JSONObject;

public abstract class a implements b.C0006b, c, com.bytedance.services.slardar.config.a {

    /* renamed from: a  reason: collision with root package name */
    private boolean f2057a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f2058b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f2059c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f2060d;

    /* renamed from: e  reason: collision with root package name */
    private long f2061e;

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: protected */
    public void b() {
    }

    public final void c(Activity activity) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean c();

    /* access modifiers changed from: protected */
    public abstract long d();

    public final void d(Activity activity) {
    }

    /* access modifiers changed from: protected */
    public void e() {
    }

    public void onReady() {
        this.f2058b = true;
        a();
    }

    private void a() {
        if (!this.f2060d) {
            this.f2060d = true;
            if (c()) {
                b.a().a((b.C0006b) this);
            }
        }
        e();
        this.f2061e = System.currentTimeMillis();
    }

    public final void f() {
        if (!this.f2057a) {
            this.f2057a = true;
            ActivityLifeObserver.getInstance().register(this);
            ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).registerConfigListener(this);
            b();
        }
    }

    public final void g() {
        if (this.f2060d) {
            this.f2060d = false;
            if (c()) {
                b.a().b(this);
            }
        }
    }

    public final void h() {
        ActivityLifeObserver.getInstance().unregister(this);
        ((IConfigManager) com.bytedance.news.common.service.manager.c.a(IConfigManager.class)).unregisterConfigListener(this);
    }

    protected static void a(e eVar) {
        com.bytedance.apm.d.a.a.b().a(eVar);
    }

    public void a(Activity activity) {
        this.f2059c = true;
        if (com.bytedance.apm.c.b()) {
            g();
        }
    }

    public void b(Activity activity) {
        this.f2059c = false;
        if (com.bytedance.apm.c.b()) {
            a();
        }
    }

    public final void a(long j) {
        long d2 = d();
        if (d2 > 0 && j - this.f2061e > d2) {
            e();
            this.f2061e = System.currentTimeMillis();
        }
    }

    public void onRefresh(JSONObject jSONObject, boolean z) {
        a(jSONObject);
    }
}
