package com.ss.android.agilelogger;

import android.os.Looper;
import android.support.annotation.RestrictTo;
import com.ss.android.agilelogger.f.b;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class e {
    public static e n;
    public static e o;
    public static int p;
    public static int q;
    public static final Object r = new Object();

    /* renamed from: a  reason: collision with root package name */
    public int f27906a = -1;

    /* renamed from: b  reason: collision with root package name */
    public int f27907b;

    /* renamed from: c  reason: collision with root package name */
    public String f27908c;

    /* renamed from: d  reason: collision with root package name */
    public String f27909d;

    /* renamed from: e  reason: collision with root package name */
    public long f27910e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f27911f;
    public b.a g;
    public Object h;
    public Object i;
    public String j;
    public String k;
    public String l;
    public e m;

    public static e a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            synchronized (r) {
                if (n != null) {
                    e eVar = n;
                    n = eVar.m;
                    eVar.m = null;
                    p--;
                    return eVar;
                }
            }
        } else if (o != null) {
            e eVar2 = o;
            o = eVar2.m;
            eVar2.m = null;
            q--;
            return eVar2;
        }
        return new e();
    }
}
