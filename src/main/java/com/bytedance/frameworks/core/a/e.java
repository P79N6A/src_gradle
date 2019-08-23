package com.bytedance.frameworks.core.a;

import android.content.Context;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public long f19949a;

    /* renamed from: b  reason: collision with root package name */
    private Context f19950b;

    /* renamed from: c  reason: collision with root package name */
    private com.bytedance.frameworks.core.a.b.e f19951c;

    /* renamed from: d  reason: collision with root package name */
    private c f19952d;

    public final void a(com.bytedance.frameworks.core.a.b.e eVar) {
        this.f19951c = eVar;
        if (this.f19951c != null) {
            com.bytedance.frameworks.core.a.b.e c2 = this.f19952d.c();
            if (c2 == null || !c2.equals(this.f19951c)) {
                this.f19949a = this.f19952d.a(this.f19951c);
            } else {
                this.f19949a = c2.f19908a;
            }
            long j = this.f19949a;
        }
    }

    protected e(Context context, c cVar) {
        this.f19950b = context.getApplicationContext();
        this.f19952d = cVar;
    }
}
