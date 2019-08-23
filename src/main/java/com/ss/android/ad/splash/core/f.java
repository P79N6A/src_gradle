package com.ss.android.ad.splash.core;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.ss.android.ad.splash.b.b;
import com.ss.android.ad.splash.c.c;
import com.ss.android.ad.splash.i;
import java.util.concurrent.ExecutorService;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f27693a;

    private f() {
    }

    public static void a(@NonNull Context context, i iVar) {
        if (!f27693a) {
            synchronized (f.class) {
                if (!f27693a) {
                    b(context.getApplicationContext(), iVar);
                    f27693a = true;
                }
            }
        }
    }

    private static void b(@NonNull Context context, @Nullable i iVar) {
        ExecutorService executorService;
        ExecutorService executorService2;
        ExecutorService executorService3;
        e.a(context);
        if (iVar != null) {
            e.a(iVar.f22824f);
            e.a(iVar.g);
            if (iVar.f22819a != null) {
                executorService = iVar.f22819a;
            } else {
                executorService = g.a();
            }
            e.a(executorService);
            if (iVar.f22820b != null) {
                executorService2 = iVar.f22820b;
            } else {
                executorService2 = g.a();
            }
            e.b(executorService2);
            if (iVar.f22821c != null) {
                executorService3 = iVar.f22821c;
            } else {
                executorService3 = g.a();
            }
            e.c(executorService3);
            e.a(iVar.f22822d);
            e.a(iVar.f22823e);
            e.a(iVar.h);
            e.c(iVar.i);
            e.d(iVar.j);
        } else {
            e.a(g.a());
            e.b(g.a());
            e.c(g.a());
        }
        e.f();
        a.a();
        a.c();
        c.a().b();
        b.a().b();
    }
}
