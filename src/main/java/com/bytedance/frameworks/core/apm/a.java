package com.bytedance.frameworks.core.apm;

import android.support.annotation.WorkerThread;
import com.bytedance.apm.f.f;
import com.bytedance.frameworks.core.apm.a.b.b;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public long f2116a;

    /* renamed from: b  reason: collision with root package name */
    private b f2117b = b.a().f2133d;

    /* renamed from: c  reason: collision with root package name */
    private f f2118c;

    /* renamed from: com.bytedance.frameworks.core.apm.a$a  reason: collision with other inner class name */
    static class C0009a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f2119a = new a();
    }

    public static a a() {
        return C0009a.f2119a;
    }

    protected a() {
    }

    public final f a(long j) {
        return this.f2117b.b(j);
    }

    @WorkerThread
    public final void a(f fVar) {
        this.f2118c = fVar;
        if (this.f2118c != null) {
            f f2 = this.f2117b.f();
            if (f2 == null || !f2.equals(this.f2118c)) {
                this.f2116a = this.f2117b.a(this.f2118c);
            } else {
                this.f2116a = f2.f1989a;
            }
        }
    }
}
