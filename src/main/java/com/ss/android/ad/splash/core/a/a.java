package com.ss.android.ad.splash.core.a;

import android.content.Context;
import com.ss.android.ad.splash.core.a.b;

public class a extends b {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f27529c;

    public final /* bridge */ /* synthetic */ b.c a() {
        return super.a();
    }

    private a(Context context) {
        super(context);
    }

    public static a a(Context context) {
        if (f27529c == null) {
            synchronized (a.class) {
                if (f27529c == null) {
                    f27529c = new a(context);
                }
            }
        }
        return f27529c;
    }
}
