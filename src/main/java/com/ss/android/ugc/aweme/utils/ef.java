package com.ss.android.ugc.aweme.utils;

import android.os.Build;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.g;
import java.lang.reflect.Field;

public class ef implements g.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4293a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f4294b;

    /* renamed from: c  reason: collision with root package name */
    private static ef f4295c;

    /* renamed from: d  reason: collision with root package name */
    private static Field f4296d;

    /* renamed from: e  reason: collision with root package name */
    private static long f4297e;

    public final void c() {
    }

    public static synchronized ef d() {
        synchronized (ef.class) {
            if (PatchProxy.isSupport(new Object[0], null, f4293a, true, 88605, new Class[0], ef.class)) {
                ef efVar = (ef) PatchProxy.accessDispatch(new Object[0], null, f4293a, true, 88605, new Class[0], ef.class);
                return efVar;
            }
            if (f4295c == null) {
                f4295c = new ef();
            }
            ef efVar2 = f4295c;
            return efVar2;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f4293a, false, 88608, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4293a, false, 88608, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (PatchProxy.isSupport(new Object[0], this, f4293a, false, 88607, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4293a, false, 88607, new Class[0], Void.TYPE);
            } else if (f4297e > 0) {
                try {
                    if (f4296d == null) {
                        Field declaredField = Class.forName("java.lang.Daemons").getDeclaredField("MAX_FINALIZE_NANOS");
                        f4296d = declaredField;
                        declaredField.setAccessible(true);
                    }
                    f4296d.set(null, Long.valueOf(f4297e));
                } catch (Exception e2) {
                    a.a((Throwable) e2);
                }
            }
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f4293a, false, 88609, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f4293a, false, 88609, new Class[0], Void.TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            if (PatchProxy.isSupport(new Object[0], this, f4293a, false, 88606, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f4293a, false, 88606, new Class[0], Void.TYPE);
                return;
            }
            try {
                if (f4296d == null) {
                    Field declaredField = Class.forName("java.lang.Daemons").getDeclaredField("MAX_FINALIZE_NANOS");
                    f4296d = declaredField;
                    declaredField.setAccessible(true);
                }
                f4297e = ((Long) f4296d.get(null)).longValue();
                f4296d.set(null, Long.MAX_VALUE);
            } catch (Exception e2) {
                if (Build.VERSION.SDK_INT < 21) {
                    StringBuilder sb = new StringBuilder();
                    try {
                        for (Field field : Class.forName("java.lang.Daemons").getDeclaredFields()) {
                            sb.append(field.toString());
                            sb.append(", ");
                        }
                    } catch (ClassNotFoundException unused) {
                    }
                    if (!TextUtils.isEmpty(sb.toString())) {
                        a.a("SystemCrashManager", sb.toString());
                    }
                }
                a.a((Throwable) e2);
            }
        }
    }
}
