package com.bytedance.apm.battery.c;

import com.bytedance.apm.battery.b.a;
import com.bytedance.apm.j.b;
import com.ss.android.common.util.ToolUtils;

public abstract class c implements i {

    /* renamed from: a  reason: collision with root package name */
    public String f18929a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f18930b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f18931c = ToolUtils.isMainProcess(com.bytedance.apm.c.a());

    /* access modifiers changed from: protected */
    public abstract long a();

    public void b() {
        this.f18930b = false;
        e();
    }

    public void c() {
        this.f18930b = true;
        e();
    }

    public void d() {
        if (!this.f18930b) {
            e();
        }
    }

    private void e() {
        b.a().a((Runnable) new Runnable() {
            public final void run() {
                com.bytedance.apm.f.b bVar = new com.bytedance.apm.f.b(c.this.f18930b, System.currentTimeMillis(), c.this.f18929a, c.this.a());
                a.a().a(bVar);
            }
        });
    }

    public c(String str) {
        this.f18929a = str;
    }
}
