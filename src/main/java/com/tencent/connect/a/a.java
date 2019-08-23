package com.tencent.connect.a;

import android.content.Context;
import com.tencent.connect.b.d;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f79556a;

    /* renamed from: b  reason: collision with root package name */
    public static Class<?> f79557b;

    /* renamed from: c  reason: collision with root package name */
    public static Method f79558c;

    /* renamed from: d  reason: collision with root package name */
    public static Method f79559d;

    /* renamed from: e  reason: collision with root package name */
    public static Method f79560e;

    /* renamed from: f  reason: collision with root package name */
    public static Method f79561f;
    public static boolean g;

    public static void a(Context context, d dVar) {
        try {
            if (com.tencent.open.d.d.a(context, dVar.f79590a).b("Common_ta_enable")) {
                f79561f.invoke(f79556a, new Object[]{Boolean.TRUE});
                return;
            }
            f79561f.invoke(f79556a, new Object[]{Boolean.FALSE});
        } catch (Exception unused) {
        }
    }

    public static void a(Context context, d dVar, String str, String... strArr) {
        if (g) {
            a(context, dVar);
            try {
                f79559d.invoke(f79557b, new Object[]{context, str, strArr});
            } catch (Exception unused) {
            }
        }
    }
}
