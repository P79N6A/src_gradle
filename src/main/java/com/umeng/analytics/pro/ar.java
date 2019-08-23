package com.umeng.analytics.pro;

import android.content.Context;

public final class ar implements au {

    /* renamed from: c  reason: collision with root package name */
    private static ar f80393c;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public au f80394a = new aq(this.f80395b);

    /* renamed from: b  reason: collision with root package name */
    private Context f80395b;

    public final void b() {
        bz.c(new cb() {
            public void a() {
                ar.this.f80394a.b();
            }
        });
    }

    public final void a() {
        bz.b(new cb() {
            public void a() {
                ar.this.f80394a.a();
            }
        });
    }

    public final void a(au auVar) {
        this.f80394a = auVar;
    }

    private ar(Context context) {
        this.f80395b = context;
    }

    public final synchronized aq a(Context context) {
        return (aq) this.f80394a;
    }

    public static synchronized ar b(Context context) {
        ar arVar;
        synchronized (ar.class) {
            if (f80393c == null && context != null) {
                f80393c = new ar(context);
            }
            arVar = f80393c;
        }
        return arVar;
    }

    public final void a(final Object obj) {
        bz.b(new cb() {
            public void a() {
                ar.this.f80394a.a(obj);
            }
        });
    }
}
