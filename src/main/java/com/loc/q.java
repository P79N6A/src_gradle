package com.loc;

import android.content.Context;
import com.google.a.a.a.a.a.a;
import java.util.List;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    n f25868a;

    /* renamed from: b  reason: collision with root package name */
    Context f25869b;

    public q(Context context, boolean z) {
        this.f25869b = context;
        this.f25868a = a(this.f25869b, z);
    }

    static n a(Context context, boolean z) {
        try {
            return new n(context, n.a(p.class));
        } catch (Throwable th) {
            if (!z) {
                i.b(th, "sd", "gdb");
            }
            return null;
        }
    }

    public final List<dh> a() {
        try {
            return this.f25868a.a("a6=1", dh.class, true);
        } catch (Throwable th) {
            a.b(th);
            return null;
        }
    }
}
