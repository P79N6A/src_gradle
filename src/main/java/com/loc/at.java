package com.loc;

import android.content.Context;
import java.lang.ref.WeakReference;

public class at {

    /* renamed from: a  reason: collision with root package name */
    static int f25487a = 1000;

    /* renamed from: b  reason: collision with root package name */
    static boolean f25488b = false;

    /* renamed from: c  reason: collision with root package name */
    static int f25489c = 20;

    /* renamed from: d  reason: collision with root package name */
    static int f25490d = 10;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static WeakReference<an> f25491e;

    public static synchronized void a(int i, boolean z, int i2) {
        synchronized (at.class) {
            f25487a = i;
            f25488b = z;
            if (i2 < 10 || i2 > 100) {
                i2 = 20;
            }
            f25489c = i2;
            if (i2 / 5 > f25490d) {
                f25490d = f25489c / 5;
            }
        }
    }

    public static synchronized void a(final as asVar, final Context context) {
        synchronized (at.class) {
            i.d().submit(new Runnable() {
                public final void run() {
                    try {
                        synchronized (at.class) {
                            String l = Long.toString(System.currentTimeMillis());
                            an a2 = aw.a(at.f25491e);
                            aw.a(context, a2, g.i, at.f25487a, 2097152, "6");
                            if (a2.f25480e == null) {
                                a2.f25480e = new dl(new a(new c(new a())));
                            }
                            as asVar = asVar;
                            aq.a(l, di.a(as.a(asVar.f25484a, asVar.f25485b, asVar.f25486c)), a2);
                        }
                    } catch (Throwable th) {
                        i.b(th, "ofm", "aple");
                    }
                }
            });
        }
    }
}
